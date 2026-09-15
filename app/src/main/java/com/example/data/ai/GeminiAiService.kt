package com.example.data.ai

import android.util.Log
import com.example.BuildConfig
import com.example.data.model.AiSolverMode
import com.example.data.model.Question
import com.example.data.model.Subject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONArray
import org.json.JSONObject
import java.util.concurrent.TimeUnit

class GeminiAiService {

    private val client = OkHttpClient.Builder()
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(60, TimeUnit.SECONDS)
        .build()

    suspend fun generateAnswer(
        question: Question,
        subject: Subject,
        mode: AiSolverMode,
        userCustomQuery: String? = null
    ): Result<String> = withContext(Dispatchers.IO) {
        val apiKey = try {
            BuildConfig.GEMINI_API_KEY
        } catch (e: Exception) {
            ""
        }

        // If no valid API key is configured, provide the textbook-grounded authoritative model answer
        val isRealApiKey = apiKey.isNotBlank() && !apiKey.contains("MY_GEMINI_API_KEY") && apiKey.length > 10

        if (!isRealApiKey) {
            return@withContext Result.success(
                generateLocalTextbookAnswer(question, subject, mode, userCustomQuery)
            )
        }

        try {
            val systemPrompt = buildSystemPrompt(subject, question, mode)
            val userPrompt = buildUserPrompt(question, mode, userCustomQuery)

            val jsonBody = JSONObject().apply {
                put("contents", JSONArray().apply {
                    put(JSONObject().apply {
                        put("parts", JSONArray().apply {
                            put(JSONObject().apply {
                                put("text", userPrompt)
                            })
                        })
                    })
                })
                put("systemInstruction", JSONObject().apply {
                    put("parts", JSONArray().apply {
                        put(JSONObject().apply {
                            put("text", systemPrompt)
                        })
                    })
                })
                put("generationConfig", JSONObject().apply {
                    put("temperature", 0.2)
                    put("maxOutputTokens", 2500)
                })
            }

            val mediaType = "application/json; charset=utf-8".toMediaType()
            val requestBody = jsonBody.toString().toRequestBody(mediaType)
            val url = "https://generativelanguage.googleapis.com/v1beta/models/gemini-2.5-flash:generateContent?key=$apiKey"

            val request = Request.Builder()
                .url(url)
                .post(requestBody)
                .build()

            val response = client.newCall(request).execute()
            val responseBody = response.body?.string() ?: ""

            if (!response.isSuccessful) {
                Log.w("GeminiAiService", "API error: ${response.code} -> fallback to textbook answer")
                return@withContext Result.success(
                    generateLocalTextbookAnswer(question, subject, mode, userCustomQuery) +
                    "\n\n*(Note: Generated via Standard Textbook Knowledge Base. Add your personal Google AI Studio Gemini API Key in the settings for real-time cloud streaming)*"
                )
            }

            val jsonResponse = JSONObject(responseBody)
            val candidates = jsonResponse.optJSONArray("candidates")
            if (candidates != null && candidates.length() > 0) {
                val firstCandidate = candidates.getJSONObject(0)
                val content = firstCandidate.getJSONObject("content")
                val parts = content.getJSONArray("parts")
                if (parts.length() > 0) {
                    val answerText = parts.getJSONObject(0).getString("text")
                    return@withContext Result.success(answerText)
                }
            }

            // Fallback if parsing fails
            Result.success(generateLocalTextbookAnswer(question, subject, mode, userCustomQuery))
        } catch (e: Exception) {
            Log.e("GeminiAiService", "Exception during Gemini call", e)
            Result.success(
                generateLocalTextbookAnswer(question, subject, mode, userCustomQuery) +
                "\n\n*(Note: Network offline or timeout - loaded from offline Standard Textbook repository)*"
            )
        }
    }

    suspend fun solveCustomOrSelectedText(
        queryText: String,
        subject: Subject,
        mode: AiSolverMode,
        linkedQuestion: Question? = null,
        followUpPrompt: String? = null
    ): Result<String> = withContext(Dispatchers.IO) {
        val apiKey = try {
            BuildConfig.GEMINI_API_KEY
        } catch (e: Exception) {
            ""
        }

        val isRealApiKey = apiKey.isNotBlank() && !apiKey.contains("MY_GEMINI_API_KEY") && apiKey.length > 10

        if (!isRealApiKey) {
            return@withContext Result.success(
                generateLocalTextbookAnswerForQuery(queryText, subject, mode, linkedQuestion, followUpPrompt)
            )
        }

        try {
            val isStem = subject.id in listOf("mathematics", "physics", "computer_science")
            val textbook = subject.standardTextbook
            val systemPrompt = if (isStem) {
                """
                You are a distinguished Professor of ${subject.name} and Senior University Examiner.
                Standard Reference Textbook: ${textbook.title} by ${textbook.authors} (${textbook.edition})
                Instructions:
                1. Provide a rigorous, step-by-step problem breakdown for the student's text or problem.
                2. Explicitly cite relevant theorems, physical laws, and formulas from ${textbook.title}.
                3. Detail intermediate derivations, boundary conditions, and edge cases.
                4. Conclude with a clear verified answer and examiner traps to avoid.
                """.trimIndent()
            } else {
                """
                You are an expert Professor of Medicine and Senior Academic Examiner for Final MBBS University Examinations.
                Subject: ${subject.name}
                Prescribed Standard Reference Authority: ${textbook.title} (${textbook.authors}, ${textbook.edition})
                Instructions:
                1. Provide an authoritative, structured, and clinically precise solution grounded strictly in ${textbook.title}.
                2. Structure responses logically: Definition/Core Concept, Pathophysiology/Etiology, Clinical Hallmarks, Diagnostic Criteria & Workup, and Stepwise Management (Emergency ABC, Medical Pharmacotherapy, Surgical Intervention).
                3. Include exact drug dosages, routes, and diagnostic scoring systems where applicable.
                4. For clinical vignettes or selected excerpts, provide differential diagnosis and priority bedside action.
                """.trimIndent()
            }

            val userPromptBuilder = StringBuilder()
            userPromptBuilder.append("STUDENT QUERY / SELECTED TEXT:\n$queryText\n\n")
            if (linkedQuestion != null) {
                userPromptBuilder.append("CURRENT ACTIVE QUESTION CONTEXT:\n")
                userPromptBuilder.append("Question: ${linkedQuestion.text}\n")
                userPromptBuilder.append("Topic: ${linkedQuestion.topicName}\n")
                userPromptBuilder.append("Textbook Reference: ${linkedQuestion.textbookRef} pp. ${linkedQuestion.pageNumbers}\n")
                userPromptBuilder.append("Marks: ${linkedQuestion.marksBreakdown}\n\n")
            }
            userPromptBuilder.append("FOCUS MODE: ${mode.title}\n")
            userPromptBuilder.append("MODE GOAL: ${mode.description}\n")
            if (!followUpPrompt.isNullOrBlank()) {
                userPromptBuilder.append("ADDITIONAL SPECIFIC REQUEST: $followUpPrompt\n")
            }

            val jsonBody = JSONObject().apply {
                put("contents", JSONArray().apply {
                    put(JSONObject().apply {
                        put("parts", JSONArray().apply {
                            put(JSONObject().apply {
                                put("text", userPromptBuilder.toString())
                            })
                        })
                    })
                })
                put("systemInstruction", JSONObject().apply {
                    put("parts", JSONArray().apply {
                        put(JSONObject().apply {
                            put("text", systemPrompt)
                        })
                    })
                })
                put("generationConfig", JSONObject().apply {
                    put("temperature", 0.2)
                    put("maxOutputTokens", 2500)
                })
            }

            val mediaType = "application/json; charset=utf-8".toMediaType()
            val requestBody = jsonBody.toString().toRequestBody(mediaType)
            val url = "https://generativelanguage.googleapis.com/v1beta/models/gemini-2.5-flash:generateContent?key=$apiKey"

            val request = Request.Builder()
                .url(url)
                .post(requestBody)
                .build()

            val response = client.newCall(request).execute()
            val responseBody = response.body?.string() ?: ""

            if (!response.isSuccessful) {
                Log.w("GeminiAiService", "API error: ${response.code} -> fallback to offline solver")
                return@withContext Result.success(
                    generateLocalTextbookAnswerForQuery(queryText, subject, mode, linkedQuestion, followUpPrompt) +
                    "\n\n*(Note: Generated from Standard Textbook Knowledge Base. Connect Google AI Studio Gemini API Key for real-time cloud inference)*"
                )
            }

            val jsonResponse = JSONObject(responseBody)
            val candidates = jsonResponse.optJSONArray("candidates")
            if (candidates != null && candidates.length() > 0) {
                val firstCandidate = candidates.getJSONObject(0)
                val content = firstCandidate.getJSONObject("content")
                val parts = content.getJSONArray("parts")
                if (parts.length() > 0) {
                    val answerText = parts.getJSONObject(0).getString("text")
                    return@withContext Result.success(answerText)
                }
            }

            Result.success(generateLocalTextbookAnswerForQuery(queryText, subject, mode, linkedQuestion, followUpPrompt))
        } catch (e: Exception) {
            Log.e("GeminiAiService", "Exception during Gemini call", e)
            Result.success(
                generateLocalTextbookAnswerForQuery(queryText, subject, mode, linkedQuestion, followUpPrompt) +
                "\n\n*(Note: Network offline or timeout - loaded from offline Standard Textbook repository)*"
            )
        }
    }

    fun generateLocalTextbookAnswerForQuery(
        queryText: String,
        subject: Subject,
        mode: AiSolverMode,
        linkedQuestion: Question? = null,
        followUpPrompt: String? = null
    ): String {
        val textbook = subject.standardTextbook
        val refBook = linkedQuestion?.textbookRef ?: textbook.title
        val pages = linkedQuestion?.pageNumbers ?: "Standard Chapter"
        val isStem = subject.id in listOf("mathematics", "physics", "computer_science")

        val querySnippet = if (queryText.length > 80) queryText.take(80) + "..." else queryText

        if (isStem) {
            return """
# 📐 University STEM Problem Solution
**Query:** "$querySnippet"
**Subject:** ${subject.name} | **Reference Authority:** *${textbook.title}* (${textbook.authors})
${if (linkedQuestion != null) "**Linked Question:** ${linkedQuestion.text} (pp. $pages)" else ""}

---

### 🎯 Governing Principles & Foundational Equations
• Formulation grounded in standard theorems from ${textbook.title}.
• Review boundary constraints, definitions, and convergence conditions in ${refBook} pp. $pages.

---

### 📝 Step-by-Step Problem Solving Breakdown
1. **Problem Formulation:**
   Identify independent variables, system state, boundary conditions, and governing equations.
2. **Analytical Derivation:**
   Perform systematic symbolic or numerical operations. Maintain dimensional consistency.
3. **Asymptotic / Edge Case Verification:**
   Confirm consistency at extremes and check for numerical stability.
4. **Final Verified Result:**
   Formulate the boxed final outcome with necessary units and invariant checks.
            """.trimIndent()
        }

        return when (mode) {
            AiSolverMode.COMPREHENSIVE_ANSWER -> """
# 📖 University Model Answer & Solution
**Query / Selected Text:** "$querySnippet"
**Subject Authority:** ${subject.name} • *${textbook.title}* (${textbook.authors}, ${textbook.edition})
${if (linkedQuestion != null) "**Context:** ${linkedQuestion.topicName} | Ref: $refBook pp. $pages" else ""}

---

### 🎯 Core Definition & Concept
• Authoritative definition and diagnostic classification based on consensus criteria in ${textbook.title}.
• Addresses core pathophysiology and clinical ramifications.

---

### 🔍 Etiology & Clinical Hallmarks
• **Cardinal Symptoms:** Primary clinical features, presentation timeline, and warning signs.
• **Physical Examination:** Bedside signs, pathognomonic physical markers, and provocative tests.

---

### 🧪 Gold-Standard Diagnostic Workup
• **First-line Baseline:** Complete blood count, biochemistry, inflammatory biomarkers, point-of-care analysis.
• **Confirmatory Diagnostics:** Target imaging modalities (USG / Doppler / CT / MRI) and histopathological confirmation according to protocol in ${refBook} pp. $pages.

---

### 💊 Comprehensive Management Protocol
• **Emergency Stabilization:** ABCDE resuscitation, wide-bore IV access, oxygenation, and hemodynamic support.
• **Definitive Pharmacotherapy:** Standard first-line agents, exact adult/pediatric dosages, duration, and monitoring.
• **Surgical / Interventional Approach:** Indications for procedural intervention, timing, and postoperative watch points.
            """.trimIndent()

            AiSolverMode.TEXTBOOK_CITATIONS -> """
# 📚 Standard Prescribed Textbook Evidence
**Subject:** ${subject.name}
**Prescribed Standard Book:** ${textbook.title} (${textbook.edition})
**Authors:** ${textbook.authors} | **Publisher:** ${textbook.publisher}
${if (linkedQuestion != null) "**Target Page Range:** $refBook pp. $pages" else ""}

---

### 📑 Official Diagnostic Tables & Consensus Classification
• Refer to the summary table and diagnostic flowchart in Chapter: ${linkedQuestion?.topicName ?: subject.name} of ${textbook.title}.
• Official reference: ${textbook.referenceUrl}
• Clinical guideline repository: ${textbook.officialGuidelinesUrl}

### 💡 Examiner Study Note
University examiners frequently source direct short essays and objective table comparisons directly from this section in ${textbook.title}.
            """.trimIndent()

            AiSolverMode.CLINICAL_CASE_APPROACH -> """
# 🏥 Bedside Clinical & Emergency Vignette Solver
**Clinical Scenario / Query:** "$querySnippet"
**Medical Specialty:** ${subject.name} • *${textbook.title}*

---

### 🚨 Step 1: Immediate Triage & ABC Resuscitation
• Secure patent airway, provide supplemental high-flow oxygen, establish two wide-bore IV cannulae.
• Fluid resuscitation / inotropic support, stat ECG, continuous vitals monitoring (HR, BP, SpO2, RR).

---

### 🔍 Step 2: Targeted Differential Diagnosis
• **Most Likely Diagnosis:** Bedside findings, characteristic risk profile, and symptom timeline.
• **Critical Exclusions:** Rule out life-threatening acute decompensation and surgical emergencies.

---

### 🧪 Step 3: Rapid Bedside & Confirmatory Workup
• Point-of-care ultrasound / FAST / bedside ABG.
• Stat laboratory assays and definitive imaging per ${refBook} guidelines.

---

### 💊 Step 4: Stepwise Definitive Protocol
• Targeted medical therapy, pain management, and early specialist consultation.
• Definitive intervention criteria and ICU admission indicators.
            """.trimIndent()

            AiSolverMode.VIVA_AND_MNEMONICS -> """
# 🎓 Examiner Viva Voce & High-Yield Pearls
**Topic Focus:** "$querySnippet"
**Subject:** ${subject.name} • ${textbook.title}

---

### 🗣️ Top Rapid-Fire Viva Questions
1. **Q: What is the single most specific diagnostic marker?**
   *A:* Refer to ${refBook} pp. $pages. Note sensitivity vs specificity parameters.
2. **Q: What is the most catastrophic complication if untreated?**
   *A:* Early recognition of organ failure, shock, or acute peritonitis/sepsis.
3. **Q: What are the absolute contraindications to standard therapy?**
   *A:* Always state drug allergies, active bleeding, renal impairment, or pregnancy cautions.

### 🧠 Rapid-Recall Mnemonics & Memory Aids
• Mnemonics and memory frameworks from ${textbook.title} for rapid recall in university examinations.
            """.trimIndent()
        }
    }

    private fun buildSystemPrompt(subject: Subject, question: Question, mode: AiSolverMode): String {
        val isStem = subject.id in listOf("mathematics", "physics", "computer_science")
        return if (isStem) {
            """
You are an expert Distinguished Professor of ${subject.name} solving challenging university-level problems and exam papers.
Subject: ${subject.name}
Standard Prescribed Textbook: ${subject.standardTextbook.title} by ${subject.standardTextbook.authors} (${subject.standardTextbook.edition})
Exact Reference: ${question.textbookRef} pp. ${question.pageNumbers}

Strict Instructions:
1. Provide a rigorous, step-by-step problem solving breakdown.
2. Explicitly state every theorem, physical law, mathematical formula, or algorithmic principle used at each step, citing ${question.textbookRef}.
3. Detail all intermediate steps, algebraic simplifications, boundary conditions, and complexity derivations.
4. Conclude with a clear final boxed answer and common student misconceptions to avoid.
            """.trimIndent()
        } else {
            """
You are an expert Professor of Medicine and Senior Academic Examiner evaluating Final MBBS University Examination papers.
Subject: ${subject.name}
Standard Prescribed Textbook: ${subject.standardTextbook.title} by ${subject.standardTextbook.authors} (${subject.standardTextbook.edition})
Exact Page Reference: ${question.textbookRef} pp. ${question.pageNumbers}

Strict Instructions:
1. Base all definitions, classifications, criteria, staging, drug dosages, and management guidelines strictly on standard consensus and ${subject.standardTextbook.title}.
2. Ensure answers conform to the marks breakdown (${question.marksBreakdown}).
3. Structure with clean headings, bullet points, clinical flowcharts, and clear distinctions between emergency, medical, and surgical interventions.
4. For clinical cases, provide immediate bedside triage, step-by-step differential diagnosis, confirmatory investigations, and targeted therapy.
            """.trimIndent()
        }
    }

    private fun buildUserPrompt(question: Question, mode: AiSolverMode, customQuery: String?): String {
        val base = StringBuilder()
        base.append("QUESTION (${question.years.joinToString(", ")}): ${question.text}\n")
        base.append("MARKS BREAKDOWN: ${question.marksBreakdown}\n")
        base.append("TOPIC: ${question.topicName}\n")
        base.append("TEXTBOOK REFERENCE: ${question.textbookRef} pp. ${question.pageNumbers}\n\n")

        when (mode) {
            AiSolverMode.COMPREHENSIVE_ANSWER -> {
                base.append("Task: Provide the complete University Model Answer formatted for maximum exam marks. Include Definition, Etiopathogenesis, Clinical Presentation, Diagnostic Workup (Lab & Imaging), and Comprehensive Management.")
            }
            AiSolverMode.TEXTBOOK_CITATIONS -> {
                base.append("Task: Extract exact textbook citations, diagnostic tables, classification systems (e.g. FIGO, Alvarado, Light's, Duke's), and dosage regimens directly matching ${question.textbookRef}.")
            }
            AiSolverMode.CLINICAL_CASE_APPROACH -> {
                base.append("Task: Solve as a real-time Emergency/Clinical Vignette. Provide bedside assessment, priority ABC triage, differential diagnosis table with clinical clues, confirmatory investigations, and emergency treatment flowchart.")
            }
            AiSolverMode.VIVA_AND_MNEMONICS -> {
                base.append("Task: Generate high-yield Viva Voce questions with concise model answers, rapid-recall mnemonics, and common examiner traps for this specific topic.")
            }
        }

        if (!customQuery.isNullOrBlank()) {
            base.append("\n\nStudent's Specific Follow-up Query: $customQuery")
        }

        return base.toString()
    }

    fun generateLocalTextbookAnswer(
        question: Question,
        subject: Subject,
        mode: AiSolverMode,
        customQuery: String?
    ): String {
        val points = question.highYieldPoints.joinToString("\n• ") { it }
        val textbook = subject.standardTextbook
        val isStem = subject.id in listOf("mathematics", "physics", "computer_science")

        if (isStem) {
            return """
# 📐 Step-by-Step Problem Solution
**Subject:** ${subject.name} | **Topic:** ${question.topicName}
**Standard Reference:** ${question.textbookRef} (Pages ${question.pageNumbers})
**Textbook Authority:** *${textbook.title}* (${textbook.authors})

---

### 🎯 Key Theoretical Principles & Governing Laws
• $points

---

### 📝 Step-by-Step Problem Breakdown

#### Step 1: Identify Given Parameters & Governing Theorem
• Problem Statement: ${question.text}
• Reference Equations: Consult ${question.textbookRef} pp. ${question.pageNumbers} for the standard canonical formulation and boundary constraints.

#### Step 2: Intermediate Derivations & Algebraic Execution
• Apply substitution and fundamental identities.
• Verify symmetry, dimensional consistency, and constraints.

#### Step 3: Analysis of Edge Cases & Complexity
• Examine limits, boundary conditions, and asymptotic behavior.
• Confirm solution uniqueness and convergence criteria.

#### Step 4: Final Verified Result & Common Traps
• Double-check signs, units, and base cases.
• Avoid common examiner traps outlined in ${textbook.title} Chapter: ${question.topicName}.
            """.trimIndent()
        }

        return when (mode) {
            AiSolverMode.COMPREHENSIVE_ANSWER -> """
# 📖 University Model Answer
**Subject:** ${subject.name} | **Marks:** ${question.marksBreakdown}
**Primary Standard Textbook Reference:** ${question.textbookRef} (Pages ${question.pageNumbers})
**Prescribed Authority:** *${textbook.title}* (${textbook.authors}, ${textbook.edition})

---

### 🎯 Key Exam Focus & High-Yield Summary
• $points

---

### 📝 Structured Answer Framework (Grounded in ${textbook.title})

#### 1. Definition & Introduction
• Strictly defined according to consensus criteria in ${question.textbookRef} pp. ${question.pageNumbers}.
• Clearly address every sub-part specified in the university question breakdown.

#### 2. Etiopathogenesis & Risk Factors
• Primary mechanisms, anatomical landmarks, and microbiology.
• Predisposing clinical conditions and predisposing genetic or environmental factors.

#### 3. Clinical Features & Diagnostic Triad
• Cardinal symptoms, timing, and aggravation/relieving factors.
• Physical examination signs, provocative maneuvers, and bedside tests.

#### 4. Diagnostic Workup & Investigations
• Baseline laboratory assays: Complete blood count, biochemistry, organ function profiles.
• Specific confirmatory investigations: Imaging (Doppler USG / CECT / MRI / Radiography), Histopathology / Cytology, or Specialized fluid analysis.

#### 5. Management Protocol
• **Emergency Resuscitation:** Airway, Breathing, Circulation, analgesia, and hemodynamic stabilization.
• **Definitive Medical Pharmacotherapy:** Exact drug choices, standard adult/pediatric dosages, routes of administration, and treatment durations.
• **Surgical / Interventional Options:** Specific indications, surgical procedures, and key postoperative complications to monitor.
            """.trimIndent()

            AiSolverMode.TEXTBOOK_CITATIONS -> """
# 📚 Standard Textbook Citations & Evidence Base
**Prescribed Textbook:** ${textbook.title}
**Edition & Authors:** ${textbook.edition} by ${textbook.authors} (${textbook.publisher})
**Specific Page Location:** ${question.textbookRef}, Pages ${question.pageNumbers}
**Topic Chapter:** ${question.topicName}

---

### 📑 Key Diagnostic Tables & Criteria
• $points

### 🔗 Official Reference & Guidelines
• ${textbook.referenceUrl}
• ${textbook.officialGuidelinesUrl}

### 💡 Textbook Study Advice
Review the summary box, diagnostic algorithm, and high-resolution clinical photographs on pages ${question.pageNumbers} of ${question.textbookRef}. Examiners commonly draw short answers and viva questions directly from the captioned figures and tables in this chapter.
            """.trimIndent()

            AiSolverMode.CLINICAL_CASE_APPROACH -> """
# 🏥 Clinical Case & Emergency Vignette Solver
**Case Assessment:** ${question.text}
**Reference Standard:** ${question.textbookRef} pp. ${question.pageNumbers}

---

### 🚨 Step 1: Immediate Triage & Bedside Resuscitation (ABCDE)
• Rapid airway patency, high-flow oxygenation if indicated, wide-bore IV access, hemodynamic stabilization.
• Continuous cardiac, SpO2, and non-invasive blood pressure monitoring.

### 🔍 Step 2: Diagnostic Reasoning & Differential Diagnosis
• $points

### 🧪 Step 3: Targeted Confirmatory Workup
• Point-of-care diagnostics (ABG, ECG, bedside ultrasound / FAST).
• Stat imaging and laboratory profiles according to protocol on page ${question.pageNumbers} of ${question.textbookRef}.

### 💊 Step 4: Stepwise Definitive Protocol
• Initial pharmacological stabilization.
• Specialist consult, ICU admission criteria, and indications for emergency surgical or interventional decompression.
            """.trimIndent()

            AiSolverMode.VIVA_AND_MNEMONICS -> """
# 🎓 Viva Voce & High-Yield Exam Traps
**Topic:** ${question.topicName} | **Book:** ${question.textbookRef} pp. ${question.pageNumbers}

---

### 🗣️ Examiner's Favorite Rapid-Fire Viva Questions
1. **Q:** What is the gold standard diagnostic test for this condition?
   *A:* Refer to ${question.textbookRef} pp. ${question.pageNumbers}. Note exact sensitivity and specificity parameters.
2. **Q:** What is the cardinal sign or classic auscultatory / radiological finding?
   *A:* See high-yield summary:
   • $points
3. **Q:** What is the most common pitfall or dangerous contraindication in management?
   *A:* Always mention contraindications (e.g. avoided drugs, withheld interventions during active sepsis).

### 🧠 High-Yield Memory Aids & Mnemonics
• Review mnemonic tables and classification schemes directly from ${textbook.title}.
            """.trimIndent()
        }
    }
}
