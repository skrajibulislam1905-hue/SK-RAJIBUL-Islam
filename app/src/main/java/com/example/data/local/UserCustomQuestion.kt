package com.example.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.data.model.Question
import com.example.data.model.QuestionType
import com.example.data.model.ReferenceLink

@Entity(tableName = "custom_questions")
data class UserCustomQuestion(
    @PrimaryKey val id: String,
    val subjectId: String,
    val topicId: String,
    val topicName: String,
    val text: String,
    val yearsCsv: String,
    val typeString: String,
    val marksBreakdown: String,
    val textbookRef: String,
    val pageNumbers: String,
    val highYieldPointsRaw: String,
    val referenceLinksRaw: String = "",
    val isClinicalCase: Boolean = false,
    val isRepeatQuestion: Boolean = false,
    val createdTimestamp: Long = System.currentTimeMillis()
) {
    fun toQuestion(): Question {
        val yearsList = yearsCsv.split(",").map { it.trim() }.filter { it.isNotEmpty() }
        val pointsList = highYieldPointsRaw.split("\n").map { it.trim() }.filter { it.isNotEmpty() }
        val qType = try {
            QuestionType.valueOf(typeString)
        } catch (_: Exception) {
            QuestionType.LONG_ESSAY
        }
        val refLinks = if (referenceLinksRaw.isNotBlank()) {
            referenceLinksRaw.split("\n").mapNotNull { line ->
                val parts = line.split("|")
                if (parts.size >= 2) {
                    ReferenceLink(parts[0].trim(), parts[1].trim(), parts.getOrNull(2)?.trim() ?: "Textbook")
                } else null
            }
        } else emptyList()

        return Question(
            id = id,
            subjectId = subjectId,
            topicId = topicId,
            topicName = topicName,
            text = text,
            years = if (yearsList.isNotEmpty()) yearsList else listOf("Custom"),
            type = qType,
            marksBreakdown = marksBreakdown.ifBlank { "10 Marks" },
            textbookRef = textbookRef.ifBlank { "Standard Reference" },
            pageNumbers = pageNumbers,
            highYieldPoints = pointsList,
            referenceLinks = refLinks,
            isClinicalCase = isClinicalCase,
            isRepeatQuestion = isRepeatQuestion,
            isCustom = true
        )
    }

    companion object {
        fun fromQuestion(q: Question): UserCustomQuestion {
            return UserCustomQuestion(
                id = q.id,
                subjectId = q.subjectId,
                topicId = q.topicId,
                topicName = q.topicName,
                text = q.text,
                yearsCsv = q.years.joinToString(", "),
                typeString = q.type.name,
                marksBreakdown = q.marksBreakdown,
                textbookRef = q.textbookRef,
                pageNumbers = q.pageNumbers,
                highYieldPointsRaw = q.highYieldPoints.joinToString("\n"),
                referenceLinksRaw = q.referenceLinks.joinToString("\n") { "${it.title}|${it.url}|${it.type}" },
                isClinicalCase = q.isClinicalCase,
                isRepeatQuestion = q.isRepeatQuestion
            )
        }
    }
}
