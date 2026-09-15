package com.example.data.model

enum class SrsRating(val value: Int, val label: String, val subtitle: String) {
    AGAIN(1, "Again", "Forgot (<1d)"),
    HARD(2, "Hard", "Struggled (~2d)"),
    GOOD(3, "Good", "Recalled (~4-7d)"),
    EASY(4, "Easy", "Mastered (14d+)")
}

data class SrsCalculationResult(
    val repetitions: Int,
    val intervalDays: Int,
    val easeFactor: Float,
    val nextReviewTimestamp: Long,
    val resultingStatus: QuestionProgressStatus,
    val isMastered: Boolean
)

object SrsAlgorithm {
    private const val ONE_DAY_MS = 24 * 60 * 60 * 1000L

    fun calculateNextReview(
        currentRepetitions: Int,
        currentIntervalDays: Int,
        currentEaseFactor: Float,
        rating: SrsRating,
        now: Long = System.currentTimeMillis()
    ): SrsCalculationResult {
        val safeEase = if (currentEaseFactor < 1.3f) 2.5f else currentEaseFactor
        return when (rating) {
            SrsRating.AGAIN -> {
                val newEase = (safeEase - 0.2f).coerceAtLeast(1.3f)
                val newInterval = 1
                SrsCalculationResult(
                    repetitions = 0,
                    intervalDays = newInterval,
                    easeFactor = newEase,
                    nextReviewTimestamp = now + (newInterval * ONE_DAY_MS),
                    resultingStatus = QuestionProgressStatus.INCORRECT,
                    isMastered = false
                )
            }
            SrsRating.HARD -> {
                val newRepetitions = currentRepetitions + 1
                val newEase = (safeEase - 0.15f).coerceAtLeast(1.3f)
                val newInterval = if (currentIntervalDays <= 1) 2 else (currentIntervalDays * 1.2f).toInt().coerceAtLeast(2)
                SrsCalculationResult(
                    repetitions = newRepetitions,
                    intervalDays = newInterval,
                    easeFactor = newEase,
                    nextReviewTimestamp = now + (newInterval * ONE_DAY_MS),
                    resultingStatus = QuestionProgressStatus.ATTEMPTED,
                    isMastered = false
                )
            }
            SrsRating.GOOD -> {
                val newRepetitions = currentRepetitions + 1
                val newInterval = when (newRepetitions) {
                    1 -> 1
                    2 -> 3
                    else -> (currentIntervalDays * safeEase).toInt().coerceAtLeast(currentIntervalDays + 1)
                }
                val isMastered = newInterval >= 14
                SrsCalculationResult(
                    repetitions = newRepetitions,
                    intervalDays = newInterval,
                    easeFactor = safeEase,
                    nextReviewTimestamp = now + (newInterval * ONE_DAY_MS),
                    resultingStatus = QuestionProgressStatus.CORRECT,
                    isMastered = isMastered
                )
            }
            SrsRating.EASY -> {
                val newRepetitions = currentRepetitions + 1
                val newEase = (safeEase + 0.15f).coerceAtMost(3.0f)
                val newInterval = when (newRepetitions) {
                    1 -> 2
                    2 -> 5
                    else -> (currentIntervalDays * safeEase * 1.3f).toInt().coerceAtLeast(currentIntervalDays + 2)
                }
                val isMastered = newInterval >= 14
                SrsCalculationResult(
                    repetitions = newRepetitions,
                    intervalDays = newInterval,
                    easeFactor = newEase,
                    nextReviewTimestamp = now + (newInterval * ONE_DAY_MS),
                    resultingStatus = QuestionProgressStatus.CORRECT,
                    isMastered = isMastered
                )
            }
        }
    }
}

data class SrsQuestionReviewItem(
    val question: Question,
    val subject: Subject,
    val userData: com.example.data.local.UserQuestionData?,
    val isDue: Boolean,
    val daysUntilDue: Int,
    val stageLabel: String
)
