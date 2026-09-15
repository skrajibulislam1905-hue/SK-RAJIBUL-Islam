package com.example.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface UserQuestionDataDao {
    @Query("SELECT * FROM user_question_data")
    fun getAllUserData(): Flow<List<UserQuestionData>>

    @Query("SELECT * FROM user_question_data WHERE questionId = :questionId LIMIT 1")
    suspend fun getUserDataForQuestion(questionId: String): UserQuestionData?

    @Query("SELECT * FROM user_question_data WHERE questionId = :questionId LIMIT 1")
    fun observeUserDataForQuestion(questionId: String): Flow<UserQuestionData?>

    @Query("SELECT * FROM user_question_data WHERE isBookmarked = 1")
    fun getBookmarkedQuestions(): Flow<List<UserQuestionData>>

    @Query("SELECT * FROM user_question_data WHERE isMastered = 1")
    fun getMasteredQuestions(): Flow<List<UserQuestionData>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveUserData(data: UserQuestionData)

    @Query("UPDATE user_question_data SET isBookmarked = :isBookmarked, lastUpdatedTimestamp = :timestamp WHERE questionId = :questionId")
    suspend fun updateBookmark(questionId: String, isBookmarked: Boolean, timestamp: Long = System.currentTimeMillis())

    @Query("UPDATE user_question_data SET isMastered = :isMastered, lastUpdatedTimestamp = :timestamp WHERE questionId = :questionId")
    suspend fun updateMastered(questionId: String, isMastered: Boolean, timestamp: Long = System.currentTimeMillis())

    @Query("UPDATE user_question_data SET status = :status, lastUpdatedTimestamp = :timestamp WHERE questionId = :questionId")
    suspend fun updateStatus(questionId: String, status: String, timestamp: Long = System.currentTimeMillis())

    @Query("UPDATE user_question_data SET userNotes = :notes, lastUpdatedTimestamp = :timestamp WHERE questionId = :questionId")
    suspend fun updateNotes(questionId: String, notes: String, timestamp: Long = System.currentTimeMillis())

    @Query("UPDATE user_question_data SET cachedAiAnswer = :aiAnswer, cachedAiMode = :aiMode, lastUpdatedTimestamp = :timestamp WHERE questionId = :questionId")
    suspend fun cacheAiAnswer(questionId: String, aiAnswer: String, aiMode: String, timestamp: Long = System.currentTimeMillis())

    @Query("""
        UPDATE user_question_data 
        SET srsRepetitions = :repetitions,
            srsIntervalDays = :intervalDays,
            srsEaseFactor = :easeFactor,
            nextReviewTimestamp = :nextReviewTimestamp,
            lastReviewRating = :rating,
            status = :status,
            isMastered = :isMastered,
            lastUpdatedTimestamp = :timestamp
        WHERE questionId = :questionId
    """)
    suspend fun updateSrsReview(
        questionId: String,
        repetitions: Int,
        intervalDays: Int,
        easeFactor: Float,
        nextReviewTimestamp: Long,
        rating: Int,
        status: String,
        isMastered: Boolean,
        timestamp: Long = System.currentTimeMillis()
    )
}
