package com.example.data.model

enum class QuestionType(val displayName: String, val badgeColor: Long) {
    LONG_ESSAY("Long Question", 0xFF0D47A1), // Deep Blue
    SHORT_ESSAY("Short Essay", 0xFF00695C), // Deep Teal
    SHORT_NOTE("Short Note", 0xFFE65100),   // Deep Orange
    SHORT_ANSWER("Short Answer", 0xFF4A148C), // Deep Purple
    EXPLAIN_WHY("Explain Why", 0xFFB71C1C),  // Deep Red
    CLINICAL_CASE("Clinical Case", 0xFF004D40), // Dark Cyan
    SUPPLEMENTARY("Supplementary", 0xFF5D4037) // Brown
}

data class TextbookInfo(
    val title: String,
    val authors: String,
    val edition: String,
    val publisher: String,
    val primarySubject: String,
    val description: String,
    val referenceUrl: String,
    val officialGuidelinesUrl: String,
    val keyChapters: List<String>
)

data class Question(
    val id: String,
    val subjectId: String,
    val topicId: String,
    val topicName: String,
    val text: String,
    val years: List<String>,
    val type: QuestionType,
    val marksBreakdown: String,
    val textbookRef: String,
    val pageNumbers: String,
    val highYieldPoints: List<String>,
    val referenceLinks: List<ReferenceLink>,
    val isClinicalCase: Boolean = false,
    val isRepeatQuestion: Boolean = false,
    val isCustom: Boolean = false
)

data class ReferenceLink(
    val title: String,
    val url: String,
    val type: String // "Textbook", "Guideline", "PubMed", "Review"
)

data class Topic(
    val id: String,
    val subjectId: String,
    val name: String,
    val description: String,
    val textbookChapter: String,
    val standardPages: String,
    val questions: List<Question>
)

data class Subject(
    val id: String,
    val name: String,
    val code: String,
    val iconName: String,
    val primaryColor: Long,
    val secondaryColor: Long,
    val standardTextbook: TextbookInfo,
    val theoryMarks: String,
    val practicalMarks: String,
    val vivaMarks: String,
    val syllabusOverview: String,
    val marksDistributionDetails: List<String>,
    val topics: List<Topic>
)

enum class AiSolverMode(val title: String, val description: String, val icon: String) {
    COMPREHENSIVE_ANSWER(
        "Standard University Model Answer",
        "Structured according to marks distribution with Headings, Pathogenesis, Clinical Features & Management",
        "MenuBook"
    ),
    TEXTBOOK_CITATIONS(
        "Textbook Grounded Citations & Tables",
        "Strictly references the standard textbook chapter, diagnostic criteria tables, and classification systems",
        "LibraryBooks"
    ),
    CLINICAL_CASE_APPROACH(
        "Clinical Case & Diagnostic Workup",
        "Emergency resuscitation, step-by-step differential diagnosis, investigations, and bedside management",
        "LocalHospital"
    ),
    VIVA_AND_MNEMONICS(
        "Viva Voce & High-Yield Mnemonics",
        "Examiner favorite questions, key normal values, rapid-recall mnemonics, and practical exam traps",
        "Quiz"
    )
}

enum class QuestionProgressStatus(val id: String, val displayName: String, val colorHex: Long) {
    UNATTEMPTED("UNATTEMPTED", "Unattempted", 0xFF757575),
    ATTEMPTED("ATTEMPTED", "Attempted", 0xFF0288D1),
    CORRECT("CORRECT", "Correct", 0xFF2E7D32),
    INCORRECT("INCORRECT", "Incorrect", 0xFFD32F2F);

    companion object {
        fun fromId(id: String?): QuestionProgressStatus {
            return values().find { it.id.equals(id, ignoreCase = true) } ?: UNATTEMPTED
        }
    }
}

data class TopicProgress(
    val topicId: String,
    val topicName: String,
    val subjectId: String,
    val totalQuestions: Int,
    val attemptedCount: Int,
    val correctCount: Int,
    val incorrectCount: Int,
    val unattemptedCount: Int
) {
    val accuracyPercent: Int
        get() = if (attemptedCount > 0) ((correctCount.toFloat() / attemptedCount) * 100).toInt() else 0

    val completionPercent: Int
        get() = if (totalQuestions > 0) ((attemptedCount.toFloat() / totalQuestions) * 100).toInt() else 0

    val needsAttention: Boolean
        get() = (incorrectCount > 0 && accuracyPercent < 70) || (totalQuestions > 0 && completionPercent < 25)
}

data class SubjectProgress(
    val subject: Subject,
    val totalQuestions: Int,
    val attemptedCount: Int,
    val correctCount: Int,
    val incorrectCount: Int,
    val unattemptedCount: Int,
    val topicProgressList: List<TopicProgress>
) {
    val accuracyPercent: Int
        get() = if (attemptedCount > 0) ((correctCount.toFloat() / attemptedCount) * 100).toInt() else 0

    val completionPercent: Int
        get() = if (totalQuestions > 0) ((attemptedCount.toFloat() / totalQuestions) * 100).toInt() else 0

    val needsAttentionTopics: List<TopicProgress>
        get() = topicProgressList.filter { it.needsAttention }
}

