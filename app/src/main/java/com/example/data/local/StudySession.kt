package com.example.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "study_sessions")
data class StudySession(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val subjectId: String,
    val subjectName: String,
    val durationMinutes: Int,
    val sessionType: String = "POMODORO", // "POMODORO", "SHORT_BREAK", "LONG_BREAK", "CUSTOM"
    val timestamp: Long = System.currentTimeMillis(),
    val completedSuccessfully: Boolean = true,
    val notes: String = ""
)
