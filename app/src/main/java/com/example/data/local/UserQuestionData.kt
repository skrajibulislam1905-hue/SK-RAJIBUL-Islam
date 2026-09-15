package com.example.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_question_data")
data class UserQuestionData(
    @PrimaryKey val questionId: String,
    val isBookmarked: Boolean = false,
    val isMastered: Boolean = false,
    val status: String = "UNATTEMPTED", // UNATTEMPTED, ATTEMPTED, CORRECT, INCORRECT
    val userNotes: String = "",
    val cachedAiAnswer: String = "",
    val cachedAiMode: String = "",
    val lastUpdatedTimestamp: Long = System.currentTimeMillis(),
    // Spaced Repetition System (SRS) parameters
    val srsRepetitions: Int = 0, // Count of successful consecutive reviews
    val srsIntervalDays: Int = 0, // Current interval in days until next review
    val srsEaseFactor: Float = 2.5f, // SM-2 ease factor (starts at 2.5)
    val nextReviewTimestamp: Long = 0L, // Epoch ms when question is due for SRS review
    val lastReviewRating: Int = 0 // 1: Again, 2: Hard, 3: Good, 4: Easy
)
