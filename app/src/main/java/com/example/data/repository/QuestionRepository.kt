package com.example.data.repository

import com.example.data.model.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class QuestionRepository {

    private val subjectsList: List<Subject> by lazy {
        listOf(
            Subject(
                id = "paediatrics",
                name = "Paediatrics",
                code = "PEDS",
                iconName = "ChildCare",
                primaryColor = 0xFF0288D1, // Light Blue / Medical Cyan
                secondaryColor = 0xFFE1F5FE,
                standardTextbook = PaediatricsDataProvider.textbook,
                theoryMarks = "Theory: 100 Marks (Paper I)",
                practicalMarks = "Practical: 100 Marks (Long Case + Short Cases)",
                vivaMarks = "Oral/Viva: 20 Marks (X-rays, Instruments, Drugs, Vaccines)",
                syllabusOverview = "Care of normal neonate, high risk newborns, normal physical & mental development, immunization schedules, nutritional disorders, systemic pediatric diseases, and emergency pediatric resuscitations.",
                marksDistributionDetails = listOf(
                    "Long Question: 1 x 10 Marks",
                    "Short Essays / Problems: 3 x 10 Marks",
                    "Short Notes: 4 x 5 Marks",
                    "Explain Why / Short Answers: 5 x 4 Marks",
                    "Total Theory = 100 Marks (Pass mark 50%)"
                ),
                topics = PaediatricsDataProvider.getTopics()
            ),
            Subject(
                id = "surgery",
                name = "General Surgery",
                code = "SURG",
                iconName = "MedicalServices",
                primaryColor = 0xFFD32F2F, // Crimson Surgical Red
                secondaryColor = 0xFFFFEBEE,
                standardTextbook = SurgeryDataProvider.textbook,
                theoryMarks = "Theory: 200 Marks (Paper I: 100M + Paper II: 100M)",
                practicalMarks = "Practical: 200 Marks (1 Long Case: 80M + 2 Short Cases: 80M)",
                vivaMarks = "Viva/Oral: 40 Marks (Instruments, Operative surgery, X-rays, Specimens)",
                syllabusOverview = "General surgical principles, wounds, burns, arterial/venous disorders, head and neck, thyroid, breast, gastrointestinal tract, hepatobiliary, pancreas, abdominal wall hernias, urology, and neurosurgery.",
                marksDistributionDetails = listOf(
                    "Paper I: General Surgery, Head & Neck, Breast, Endocrine, Vascular, Trauma (100M)",
                    "Paper II: Gastrointestinal, Hepatobiliary, Pancreas, Hernia, Urology, Neurosurgery, Thorax (100M)",
                    "Each Paper: 1 Long Question (15M) + 4 Semi-long Questions (10M each) + 5 Short Notes/Explain Why (5M/4M each)",
                    "Total Theory = 200 Marks, Practical = 200 Marks"
                ),
                topics = SurgeryDataProvider.getTopics()
            ),
            Subject(
                id = "orthopaedics",
                name = "Orthopaedics",
                code = "ORTHO",
                iconName = "AccessibilityNew",
                primaryColor = 0xFF5D4037, // Earthy Bone Brown
                secondaryColor = 0xFFEFEBE9,
                standardTextbook = OrthopaedicsDataProvider.textbook,
                theoryMarks = "Part of Surgery Paper II (40-50 Marks)",
                practicalMarks = "Practical: Orthopaedic Short Case + OSPE Stations",
                vivaMarks = "Viva: Implants, Splints, Plaster casts, Traction, X-rays",
                syllabusOverview = "Fractures and dislocations of extremities and spine, bone infections (acute and chronic osteomyelitis, skeletal tuberculosis), bone tumors, congenital deformities (CTEV, DDH), and nerve injuries.",
                marksDistributionDetails = listOf(
                    "Long / Semi-long Questions: 1-2 x 10 Marks",
                    "Short Notes: 3-4 x 5 Marks",
                    "Explain Why: 2-3 x 4 Marks",
                    "Part of Surgery Paper II Exam"
                ),
                topics = OrthopaedicsDataProvider.getTopics()
            ),
            Subject(
                id = "obs_gyn",
                name = "Obstetrics & Gynaecology",
                code = "OBG",
                iconName = "PregnantWoman",
                primaryColor = 0xFFC2185B, // Rose / Magenta
                secondaryColor = 0xFFFCE4EC,
                standardTextbook = ObsGynDataProvider.textbookObs,
                theoryMarks = "Theory: 200 Marks (Paper I: Obstetrics 100M + Paper II: Gynaecology 100M)",
                practicalMarks = "Practical: 200 Marks (Obstetric Long Case + Gynae Short Case)",
                vivaMarks = "Oral/Viva: 40 Marks (Specimens, Instruments, CTG, USG plates, Drugs, Pelvis)",
                syllabusOverview = "Antenatal care, physiological and pathological changes in pregnancy, normal and abnormal labour, obstetric complications (APH, PPH, pre-eclampsia), operative obstetrics, gynaecological oncology, pelvic organ prolapse, and infertility.",
                marksDistributionDetails = listOf(
                    "Paper I (Obstetrics & Neonatology): 100 Marks (1 Case Question 15M + 3 Structured 10M + 5 Short Notes/Explain Why 5M)",
                    "Paper II (Gynaecology, Family Welfare & Oncology): 100 Marks (1 Case Question 15M + 3 Structured 10M + 5 Short Notes 5M)",
                    "Total Theory = 200 Marks, Practical = 200 Marks"
                ),
                topics = ObsGynDataProvider.getTopics()
            ),
            Subject(
                id = "medicine",
                name = "General Medicine",
                code = "MED",
                iconName = "HealthAndSafety",
                primaryColor = 0xFF1565C0, // Navy Clinical Blue
                secondaryColor = 0xFFE3F2FD,
                standardTextbook = MedicineDataProvider.textbook,
                theoryMarks = "Theory: 200 Marks (Paper I: 100M + Paper II: 100M)",
                practicalMarks = "Practical: 200 Marks (1 Long Case 80M + 2 Short Cases 80M + OSCE 40M)",
                vivaMarks = "Viva/Oral: 40 Marks (ECGs, X-rays, ABG reports, Drugs, Instruments)",
                syllabusOverview = "Cardiology, pulmonology, gastroenterology, hepatology, nephrology, hematology, endocrinology, rheumatology, neurology, infectious diseases, fluid/electrolyte and acid-base disorders, and emergency medicine.",
                marksDistributionDetails = listOf(
                    "Paper I: CVS, Respiratory, GI, Hepatobiliary, Nutrition, Infectious Diseases, Hematology (100M)",
                    "Paper II: Neurology, Nephrology, Endocrine, Rheumatology, Toxicology, Psychiatry, Dermatology (100M)",
                    "Each Paper: 1 Case Question (15M) + 4 Semi-long Questions (10M each) + 5 Short Notes/Explain Why",
                    "Total Theory = 200 Marks, Practical = 200 Marks"
                ),
                topics = MedicineDataProvider.getTopics()
            ),
            Subject(
                id = "ent",
                name = "Otorhinolaryngology (ENT)",
                code = "ENT",
                iconName = "Hearing",
                primaryColor = 0xFF00796B, // Emerald Teal
                secondaryColor = 0xFFE0F2F1,
                standardTextbook = EntOphthalDataProvider.textbookEnt,
                theoryMarks = "Theory: 100 Marks",
                practicalMarks = "Practical: 80 Marks (1 Long Case + 1 Short Case)",
                vivaMarks = "Viva: 20 Marks (Instruments, Audiograms, X-rays/CT scans)",
                syllabusOverview = "Diseases of external, middle and inner ear, hearing loss, facial nerve palsy, diseases of nose, paranasal sinuses, polyps, epistaxis, diseases of pharynx, tonsils, larynx, hoarseness, stridor, and tracheostomy.",
                marksDistributionDetails = listOf(
                    "1 Clinical Long Question: 15 Marks",
                    "3 Structured Semi-long Questions: 10 Marks each",
                    "4 Short Notes: 5 Marks each",
                    "5 Short Answers / Explain Why: 3-4 Marks each"
                ),
                topics = EntOphthalDataProvider.getEntTopics()
            ),
            Subject(
                id = "ophthalmology",
                name = "Ophthalmology",
                code = "OPHTHAL",
                iconName = "Visibility",
                primaryColor = 0xFF6A1B9A, // Royal Purple
                secondaryColor = 0xFFF3E5F5,
                standardTextbook = EntOphthalDataProvider.textbookOphthal,
                theoryMarks = "Theory: 100 Marks",
                practicalMarks = "Practical: 80 Marks (1 Long Case + 2 Short Cases)",
                vivaMarks = "Viva: 20 Marks (Ocular drugs, Lenses, Surgical instruments, Fundus/slit lamp photos)",
                syllabusOverview = "Optics and refraction, diseases of conjunctiva, cornea, uveal tract, lens and cataract surgery, glaucoma, retina and vitreous, neuro-ophthalmology, strabismus, ocular injuries, and community eye health.",
                marksDistributionDetails = listOf(
                    "1 Clinical Long Question: 15 Marks",
                    "3 Structured Questions: 10 Marks each",
                    "4 Short Notes: 5 Marks each",
                    "5 Explain Why / Reasoning: 3-4 Marks each"
                ),
                topics = EntOphthalDataProvider.getOphthalTopics()
            )
        )
    }

    fun getAllSubjects(): List<Subject> = subjectsList

    fun getSubjectById(id: String): Subject? {
        return subjectsList.find { it.id.equals(id, ignoreCase = true) }
    }

    fun getAllQuestions(): List<Question> {
        return subjectsList.flatMap { subject ->
            subject.topics.flatMap { topic -> topic.questions }
        }
    }

    fun getQuestionsForSubject(subjectId: String): List<Question> {
        return subjectsList.find { it.id.equals(subjectId, ignoreCase = true) }
            ?.topics?.flatMap { it.questions } ?: emptyList()
    }

    fun getQuestionsForTopic(subjectId: String, topicId: String): List<Question> {
        return subjectsList.find { it.id.equals(subjectId, ignoreCase = true) }
            ?.topics?.find { it.id.equals(topicId, ignoreCase = true) }
            ?.questions ?: emptyList()
    }

    fun getQuestionById(questionId: String): Question? {
        return getAllQuestions().find { it.id == questionId }
    }

    fun searchQuestions(query: String): List<Question> {
        if (query.isBlank()) return getAllQuestions()
        val lowerQuery = query.lowercase().trim()
        return getAllQuestions().filter { q ->
            q.text.lowercase().contains(lowerQuery) ||
            q.topicName.lowercase().contains(lowerQuery) ||
            q.textbookRef.lowercase().contains(lowerQuery) ||
            q.years.any { it.contains(lowerQuery) } ||
            q.highYieldPoints.any { it.lowercase().contains(lowerQuery) }
        }
    }

    fun getStandardTextbooks(): List<TextbookInfo> {
        return listOf(
            PaediatricsDataProvider.textbook,
            SurgeryDataProvider.textbook,
            OrthopaedicsDataProvider.textbook,
            ObsGynDataProvider.textbookObs,
            ObsGynDataProvider.textbookGyn,
            MedicineDataProvider.textbook,
            EntOphthalDataProvider.textbookEnt,
            EntOphthalDataProvider.textbookOphthal
        )
    }
}
