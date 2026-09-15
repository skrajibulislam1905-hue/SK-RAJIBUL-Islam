package com.example

import com.example.data.local.UserCustomQuestion
import com.example.data.model.Question
import com.example.data.model.QuestionType
import com.example.data.model.ReferenceLink
import org.junit.Assert.*
import org.junit.Test

class ExampleUnitTest {
  @Test
  fun addition_isCorrect() {
    assertEquals(4, 2 + 2)
  }

  @Test
  fun testUserCustomQuestionToQuestionMapping() {
    val entity = UserCustomQuestion(
      id = "custom_test_1",
      subjectId = "obs_gyn",
      topicId = "obg_custom",
      topicName = "Custom Submissions",
      text = "Discuss management of Eclampsia with Pritchard regimen.",
      yearsCsv = "2024, 2022",
      typeString = "LONG_ESSAY",
      marksBreakdown = "15 Marks",
      textbookRef = "DC Dutta (10th Ed)",
      pageNumbers = "220-225",
      highYieldPointsRaw = "Loading dose: 4g IV + 10g IM\nMaintenance dose: 5g IM q4h\nMonitor urine output >=30ml/hr",
      referenceLinksRaw = "FOGSI Guidelines|https://fogsi.org|Guideline",
      isClinicalCase = true,
      isRepeatQuestion = true
    )

    val question = entity.toQuestion()

    assertEquals("custom_test_1", question.id)
    assertEquals("obs_gyn", question.subjectId)
    assertEquals(QuestionType.LONG_ESSAY, question.type)
    assertTrue(question.isCustom)
    assertTrue(question.isClinicalCase)
    assertTrue(question.isRepeatQuestion)
    assertEquals(2, question.years.size)
    assertEquals("2024", question.years[0])
    assertEquals(3, question.highYieldPoints.size)
    assertEquals(1, question.referenceLinks.size)
    assertEquals("FOGSI Guidelines", question.referenceLinks[0].title)
  }

  @Test
  fun testQuestionToUserCustomQuestionConversion() {
    val question = Question(
      id = "custom_peds_1",
      subjectId = "paediatrics",
      topicId = "peds_neonato",
      topicName = "Neonatology",
      text = "Describe warm chain and hypothermia grading in neonate.",
      years = listOf("2024"),
      type = QuestionType.SHORT_ESSAY,
      marksBreakdown = "10 Marks",
      textbookRef = "OP Ghai",
      pageNumbers = "139-140",
      highYieldPoints = listOf("Radiation is major cause", "Warm chain has 10 steps"),
      referenceLinks = listOf(ReferenceLink("WHO Guide", "https://who.int", "Guideline")),
      isClinicalCase = false,
      isRepeatQuestion = true,
      isCustom = true
    )

    val entity = UserCustomQuestion.fromQuestion(question)

    assertEquals("custom_peds_1", entity.id)
    assertEquals("paediatrics", entity.subjectId)
    assertEquals("SHORT_ESSAY", entity.typeString)
    assertEquals("2024", entity.yearsCsv)
    assertTrue(entity.highYieldPointsRaw.contains("Radiation is major cause"))
  }

  @Test
  fun testAiAssistantLocalFallbackSolverForQuery() {
    val aiService = com.example.data.ai.GeminiAiService()
    val repo = com.example.data.repository.QuestionRepository()
    val subject = repo.getAllSubjects().first { it.id == "paediatrics" }

    val answer = aiService.generateLocalTextbookAnswerForQuery(
      queryText = "Management of severe acute malnutrition (SAM) with complications",
      subject = subject,
      mode = com.example.data.model.AiSolverMode.COMPREHENSIVE_ANSWER
    )

    assertNotNull(answer)
    assertTrue(answer.contains("Essential Pediatrics"))
    assertTrue(answer.contains("OP Ghai"))
    assertTrue(answer.contains("Management of severe acute malnutrition"))
  }
}
