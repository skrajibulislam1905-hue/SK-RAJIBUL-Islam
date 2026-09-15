package com.example.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface UserCustomQuestionDao {

    @Query("SELECT * FROM custom_questions ORDER BY createdTimestamp DESC")
    fun getAllCustomQuestions(): Flow<List<UserCustomQuestion>>

    @Query("SELECT * FROM custom_questions WHERE subjectId = :subjectId ORDER BY createdTimestamp DESC")
    fun getCustomQuestionsForSubject(subjectId: String): Flow<List<UserCustomQuestion>>

    @Query("SELECT * FROM custom_questions WHERE id = :id LIMIT 1")
    suspend fun getCustomQuestionById(id: String): UserCustomQuestion?

    @Query("SELECT COUNT(*) FROM custom_questions")
    fun getCustomQuestionsCount(): Flow<Int>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCustomQuestion(question: UserCustomQuestion)

    @Delete
    suspend fun deleteCustomQuestion(question: UserCustomQuestion)

    @Query("DELETE FROM custom_questions WHERE id = :id")
    suspend fun deleteCustomQuestionById(id: String)
}
