package com.example.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.ai.GeminiAiService
import com.example.data.local.AppDatabase
import com.example.data.local.StudySession
import com.example.data.local.UserCustomQuestion
import com.example.data.local.UserQuestionData
import com.example.data.model.*
import com.example.data.repository.QuestionRepository
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

enum class AppNavScreen {
    SUBJECTS,
    TOPICS,
    QUESTIONS,
    PROGRESS_SUMMARY,
    FOCUS_TIMER,
    SRS_REVIEW,
    TEXTBOOKS
}

enum class TimerMode(val title: String, val defaultMinutes: Int) {
    POMODORO("Focus Block", 25),
    SHORT_BREAK("Short Break", 5),
    LONG_BREAK("Long Break", 15),
    EXTENDED_FOCUS("Deep Review", 50)
}

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = QuestionRepository()
    private val aiService = GeminiAiService()
    private val database = AppDatabase.getInstance(application)
    private val userDao = database.userQuestionDataDao()
    private val customQuestionDao = database.userCustomQuestionDao()

    val customQuestions: StateFlow<List<Question>> = customQuestionDao.getAllCustomQuestions()
        .map { list -> list.map { it.toQuestion() } }
        .stateIn(viewModelScope, SharingStarted.Eagerly, emptyList())

    val allSubjects: StateFlow<List<Subject>> = customQuestions.map { customList ->
        val baseSubjects = repository.getAllSubjects()
        if (customList.isEmpty()) {
            baseSubjects
        } else {
            baseSubjects.map { subject ->
                val customForSub = customList.filter { it.subjectId.equals(subject.id, ignoreCase = true) }
                if (customForSub.isEmpty()) {
                    subject
                } else {
                    val updatedTopics = subject.topics.map { topic ->
                        val customForTopic = customForSub.filter { it.topicId.equals(topic.id, ignoreCase = true) }
                        if (customForTopic.isEmpty()) {
                            topic
                        } else {
                            topic.copy(questions = topic.questions + customForTopic)
                        }
                    }.toMutableList()

                    val unassigned = customForSub.filter { cq ->
                        updatedTopics.none { it.id.equals(cq.topicId, ignoreCase = true) }
                    }
                    if (unassigned.isNotEmpty()) {
                        unassigned.groupBy { it.topicId }.forEach { (topId, qList) ->
                            val topicName = qList.first().topicName.ifBlank { "Custom Submissions" }
                            updatedTopics.add(
                                Topic(
                                    id = topId,
                                    subjectId = subject.id,
                                    name = topicName,
                                    description = "User-added custom questions & exam problems",
                                    textbookChapter = subject.standardTextbook.title,
                                    standardPages = "Custom",
                                    questions = qList
                                )
                            )
                        }
                    }
                    subject.copy(topics = updatedTopics)
                }
            }
        }
    }.stateIn(viewModelScope, SharingStarted.Eagerly, repository.getAllSubjects())

    // Navigation State
    private val _currentScreen = MutableStateFlow(AppNavScreen.SUBJECTS)
    val currentScreen: StateFlow<AppNavScreen> = _currentScreen.asStateFlow()

    private val _selectedSubject = MutableStateFlow<Subject?>(null)
    val selectedSubject: StateFlow<Subject?> = _selectedSubject.asStateFlow()

    private val _selectedTopic = MutableStateFlow<Topic?>(null)
    val selectedTopic: StateFlow<Topic?> = _selectedTopic.asStateFlow()

    private val _selectedQuestion = MutableStateFlow<Question?>(null)
    val selectedQuestion: StateFlow<Question?> = _selectedQuestion.asStateFlow()

    // Filters
    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    private val _selectedTypeFilter = MutableStateFlow<QuestionType?>(null)
    val selectedTypeFilter: StateFlow<QuestionType?> = _selectedTypeFilter.asStateFlow()

    private val _selectedStatusFilter = MutableStateFlow<QuestionProgressStatus?>(null)
    val selectedStatusFilter: StateFlow<QuestionProgressStatus?> = _selectedStatusFilter.asStateFlow()

    private val _selectedYearFilter = MutableStateFlow<String?>(null)
    val selectedYearFilter: StateFlow<String?> = _selectedYearFilter.asStateFlow()

    private val _onlyRepeats = MutableStateFlow(false)
    val onlyRepeats: StateFlow<Boolean> = _onlyRepeats.asStateFlow()

    private val _onlyClinical = MutableStateFlow(false)
    val onlyClinical: StateFlow<Boolean> = _onlyClinical.asStateFlow()

    private val _onlyBookmarked = MutableStateFlow(false)
    val onlyBookmarked: StateFlow<Boolean> = _onlyBookmarked.asStateFlow()

    private val _onlyCustom = MutableStateFlow(false)
    val onlyCustom: StateFlow<Boolean> = _onlyCustom.asStateFlow()

    // Add / Edit Custom Question Dialog State
    private val _isAddQuestionDialogOpen = MutableStateFlow(false)
    val isAddQuestionDialogOpen: StateFlow<Boolean> = _isAddQuestionDialogOpen.asStateFlow()

    private val _questionToEdit = MutableStateFlow<Question?>(null)
    val questionToEdit: StateFlow<Question?> = _questionToEdit.asStateFlow()

    private val _isGeneratingDraftPoints = MutableStateFlow(false)
    val isGeneratingDraftPoints: StateFlow<Boolean> = _isGeneratingDraftPoints.asStateFlow()

    // Room Database User Data
    val userQuestionDataMap: StateFlow<Map<String, UserQuestionData>> = userDao.getAllUserData()
        .map { list -> list.associateBy { it.questionId } }
        .stateIn(viewModelScope, SharingStarted.Lazily, emptyMap())

    // AI Solver State
    private val _activeAiMode = MutableStateFlow(AiSolverMode.COMPREHENSIVE_ANSWER)
    val activeAiMode: StateFlow<AiSolverMode> = _activeAiMode.asStateFlow()

    private val _isAiLoading = MutableStateFlow(false)
    val isAiLoading: StateFlow<Boolean> = _isAiLoading.asStateFlow()

    private val _currentAiSolution = MutableStateFlow<String?>(null)
    val currentAiSolution: StateFlow<String?> = _currentAiSolution.asStateFlow()

    // Persistent AI Assistant Floating State
    private val _isAiAssistantOpen = MutableStateFlow(false)
    val isAiAssistantOpen: StateFlow<Boolean> = _isAiAssistantOpen.asStateFlow()

    private val _aiAssistantInputText = MutableStateFlow("")
    val aiAssistantInputText: StateFlow<String> = _aiAssistantInputText.asStateFlow()

    private val _aiAssistantSubject = MutableStateFlow<Subject?>(null)
    val aiAssistantSubject: StateFlow<Subject?> = _aiAssistantSubject.asStateFlow()

    private val _aiAssistantActiveQuestion = MutableStateFlow<Question?>(null)
    val aiAssistantActiveQuestion: StateFlow<Question?> = _aiAssistantActiveQuestion.asStateFlow()

    private val _aiAssistantSolution = MutableStateFlow<String?>(null)
    val aiAssistantSolution: StateFlow<String?> = _aiAssistantSolution.asStateFlow()

    private val _isAiAssistantLoading = MutableStateFlow(false)
    val isAiAssistantLoading: StateFlow<Boolean> = _isAiAssistantLoading.asStateFlow()

    // Filtered questions based on subject, topic, search query, status, etc.
    val displayedQuestions: StateFlow<List<Question>> = combine(
        selectedSubject,
        selectedTopic,
        _searchQuery,
        _selectedTypeFilter,
        _selectedStatusFilter,
        _selectedYearFilter,
        _onlyRepeats,
        _onlyClinical,
        _onlyBookmarked,
        _onlyCustom,
        userQuestionDataMap,
        allSubjects
    ) { params ->
        val subject = params[0] as? Subject
        val topic = params[1] as? Topic
        val query = params[2] as String
        val typeFilter = params[3] as? QuestionType
        val statusFilter = params[4] as? QuestionProgressStatus
        val yearFilter = params[5] as? String
        val repeatsOnly = params[6] as Boolean
        val clinicalOnly = params[7] as Boolean
        val bookmarkedOnly = params[8] as Boolean
        val customOnly = params[9] as Boolean
        @Suppress("UNCHECKED_CAST")
        val userDataMap = params[10] as Map<String, UserQuestionData>
        @Suppress("UNCHECKED_CAST")
        val currentSubjectsList = params[11] as List<Subject>

        val allCurrentQuestions = currentSubjectsList.flatMap { sub -> sub.topics.flatMap { it.questions } }

        var list = if (query.isNotBlank()) {
            val lowerQuery = query.lowercase().trim()
            allCurrentQuestions.filter { q ->
                q.text.lowercase().contains(lowerQuery) ||
                q.topicName.lowercase().contains(lowerQuery) ||
                q.textbookRef.lowercase().contains(lowerQuery) ||
                q.years.any { it.lowercase().contains(lowerQuery) } ||
                q.highYieldPoints.any { it.lowercase().contains(lowerQuery) }
            }
        } else if (topic != null) {
            val matchingSubject = currentSubjectsList.find { it.id.equals(subject?.id, ignoreCase = true) }
            matchingSubject?.topics?.find { it.id.equals(topic.id, ignoreCase = true) }?.questions ?: topic.questions
        } else if (subject != null) {
            val matchingSubject = currentSubjectsList.find { it.id.equals(subject.id, ignoreCase = true) }
            matchingSubject?.topics?.flatMap { it.questions } ?: subject.topics.flatMap { it.questions }
        } else {
            allCurrentQuestions
        }

        if (customOnly) {
            list = list.filter { it.isCustom }
        }
        if (typeFilter != null) {
            list = list.filter { it.type == typeFilter }
        }
        if (statusFilter != null) {
            list = list.filter { q ->
                val statusStr = userDataMap[q.id]?.status ?: QuestionProgressStatus.UNATTEMPTED.id
                statusStr.equals(statusFilter.id, ignoreCase = true)
            }
        }
        if (!yearFilter.isNullOrBlank()) {
            list = list.filter { q -> q.years.any { it.contains(yearFilter) } }
        }
        if (repeatsOnly) {
            list = list.filter { it.isRepeatQuestion || it.years.size > 1 }
        }
        if (clinicalOnly) {
            list = list.filter { it.isClinicalCase }
        }
        if (bookmarkedOnly) {
            list = list.filter { userDataMap[it.id]?.isBookmarked == true }
        }

        list
    }.stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    // Progress Calculation Per Subject and Topic
    val subjectProgressList: StateFlow<List<SubjectProgress>> = combine(
        allSubjects,
        userQuestionDataMap
    ) { subjects, dataMap ->
        subjects.map { subject ->
            var subAttempted = 0
            var subCorrect = 0
            var subIncorrect = 0
            var subUnattempted = 0

            val topicProgresses = subject.topics.map { topic ->
                var topicAttempted = 0
                var topicCorrect = 0
                var topicIncorrect = 0
                var topicUnattempted = 0

                topic.questions.forEach { q ->
                    val status = QuestionProgressStatus.fromId(dataMap[q.id]?.status)
                    when (status) {
                        QuestionProgressStatus.ATTEMPTED -> {
                            topicAttempted++
                            subAttempted++
                        }
                        QuestionProgressStatus.CORRECT -> {
                            topicAttempted++
                            topicCorrect++
                            subAttempted++
                            subCorrect++
                        }
                        QuestionProgressStatus.INCORRECT -> {
                            topicAttempted++
                            topicIncorrect++
                            subAttempted++
                            subIncorrect++
                        }
                        QuestionProgressStatus.UNATTEMPTED -> {
                            topicUnattempted++
                            subUnattempted++
                        }
                    }
                }

                TopicProgress(
                    topicId = topic.id,
                    topicName = topic.name,
                    subjectId = subject.id,
                    totalQuestions = topic.questions.size,
                    attemptedCount = topicAttempted,
                    correctCount = topicCorrect,
                    incorrectCount = topicIncorrect,
                    unattemptedCount = topicUnattempted
                )
            }

            SubjectProgress(
                subject = subject,
                totalQuestions = subject.topics.sumOf { it.questions.size },
                attemptedCount = subAttempted,
                correctCount = subCorrect,
                incorrectCount = subIncorrect,
                unattemptedCount = subUnattempted,
                topicProgressList = topicProgresses
            )
        }
    }.stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    // Highlighted Areas Needing More Attention (topics with incorrect answers or low accuracy)
    val areasNeedingAttention: StateFlow<List<TopicProgress>> = subjectProgressList.map { subList ->
        subList.flatMap { it.topicProgressList }
            .filter { it.needsAttention || it.incorrectCount > 0 }
            .sortedWith(compareByDescending<TopicProgress> { it.incorrectCount }
                .thenBy { it.accuracyPercent })
    }.stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    // Navigation methods
    fun navigateToSubjects() {
        _selectedTopic.value = null
        _selectedQuestion.value = null
        _currentScreen.value = AppNavScreen.SUBJECTS
    }

    fun navigateToTopics(subject: Subject) {
        _selectedSubject.value = subject
        _selectedTopic.value = null
        _selectedQuestion.value = null
        _currentScreen.value = AppNavScreen.TOPICS
    }

    fun navigateToQuestions(topic: Topic, subject: Subject? = null) {
        if (subject != null) {
            _selectedSubject.value = subject
        }
        _selectedTopic.value = topic
        _selectedQuestion.value = null
        _currentScreen.value = AppNavScreen.QUESTIONS
    }

    fun navigateToProgress() {
        _selectedQuestion.value = null
        _currentScreen.value = AppNavScreen.PROGRESS_SUMMARY
    }

    fun navigateToFocusTimer(preselectedSubject: Subject? = null) {
        if (preselectedSubject != null) {
            _selectedTimerSubject.value = preselectedSubject
        } else if (_selectedTimerSubject.value == null && _selectedSubject.value != null) {
            _selectedTimerSubject.value = _selectedSubject.value
        }
        _selectedQuestion.value = null
        _currentScreen.value = AppNavScreen.FOCUS_TIMER
    }

    fun navigateToSrsReview(preselectedSubject: Subject? = null) {
        if (preselectedSubject != null) {
            _srsSubjectFilter.value = preselectedSubject
        }
        _srsSessionIndex.value = 0
        _selectedQuestion.value = null
        _currentScreen.value = AppNavScreen.SRS_REVIEW
    }

    fun navigateToTextbooks() {
        _selectedQuestion.value = null
        _currentScreen.value = AppNavScreen.TEXTBOOKS
    }

    fun navigateBack(): Boolean {
        return when (_currentScreen.value) {
            AppNavScreen.QUESTIONS -> {
                _selectedTopic.value = null
                _currentScreen.value = AppNavScreen.TOPICS
                true
            }
            AppNavScreen.TOPICS -> {
                _selectedSubject.value = null
                _currentScreen.value = AppNavScreen.SUBJECTS
                true
            }
            AppNavScreen.PROGRESS_SUMMARY, AppNavScreen.TEXTBOOKS, AppNavScreen.FOCUS_TIMER, AppNavScreen.SRS_REVIEW -> {
                _currentScreen.value = AppNavScreen.SUBJECTS
                true
            }
            AppNavScreen.SUBJECTS -> false
        }
    }

    fun selectQuestion(question: Question?) {
        _selectedQuestion.value = question
        if (question != null) {
            val cached = userQuestionDataMap.value[question.id]?.cachedAiAnswer
            if (!cached.isNullOrBlank()) {
                _currentAiSolution.value = cached
            } else {
                val subject = _selectedSubject.value ?: repository.getAllSubjects().first()
                _currentAiSolution.value = aiService.generateLocalTextbookAnswer(
                    question, subject, _activeAiMode.value, null
                )
            }
        } else {
            _currentAiSolution.value = null
        }
    }

    fun setQuestionStatus(questionId: String, status: QuestionProgressStatus) {
        viewModelScope.launch {
            val currentData = userDao.getUserDataForQuestion(questionId)
            val now = System.currentTimeMillis()
            val initialInterval = if (status == QuestionProgressStatus.CORRECT) 1 else 0
            val nextRev = if (status == QuestionProgressStatus.UNATTEMPTED) 0L else now + (initialInterval * 24 * 3600 * 1000L)
            if (currentData == null) {
                userDao.saveUserData(
                    UserQuestionData(
                        questionId = questionId,
                        status = status.id,
                        srsIntervalDays = initialInterval,
                        nextReviewTimestamp = nextRev,
                        srsRepetitions = if (status == QuestionProgressStatus.CORRECT) 1 else 0
                    )
                )
            } else {
                userDao.updateStatus(questionId, status.id)
                if (currentData.nextReviewTimestamp == 0L && status != QuestionProgressStatus.UNATTEMPTED) {
                    userDao.updateSrsReview(
                        questionId = questionId,
                        repetitions = if (status == QuestionProgressStatus.CORRECT) 1 else currentData.srsRepetitions,
                        intervalDays = initialInterval,
                        easeFactor = currentData.srsEaseFactor,
                        nextReviewTimestamp = nextRev,
                        rating = if (status == QuestionProgressStatus.CORRECT) 3 else 1,
                        status = status.id,
                        isMastered = currentData.isMastered
                    )
                }
            }
        }
    }

    fun setSearchQuery(query: String) {
        _searchQuery.value = query
    }

    fun setTypeFilter(type: QuestionType?) {
        _selectedTypeFilter.value = type
    }

    fun setStatusFilter(status: QuestionProgressStatus?) {
        _selectedStatusFilter.value = status
    }

    fun setYearFilter(year: String?) {
        _selectedYearFilter.value = year
    }

    fun toggleOnlyRepeats() {
        _onlyRepeats.value = !_onlyRepeats.value
    }

    fun toggleOnlyClinical() {
        _onlyClinical.value = !_onlyClinical.value
    }

    fun toggleOnlyBookmarked() {
        _onlyBookmarked.value = !_onlyBookmarked.value
    }

    fun toggleOnlyCustom() {
        _onlyCustom.value = !_onlyCustom.value
    }

    fun openAddQuestionDialog(preselectedSubject: Subject? = null, preselectedTopic: Topic? = null) {
        if (preselectedSubject != null) _selectedSubject.value = preselectedSubject
        if (preselectedTopic != null) _selectedTopic.value = preselectedTopic
        _questionToEdit.value = null
        _isAddQuestionDialogOpen.value = true
    }

    fun openEditQuestionDialog(question: Question) {
        _questionToEdit.value = question
        _isAddQuestionDialogOpen.value = true
    }

    fun closeAddQuestionDialog() {
        _isAddQuestionDialogOpen.value = false
        _questionToEdit.value = null
    }

    fun saveCustomQuestion(
        id: String?,
        subjectId: String,
        topicId: String,
        topicName: String,
        text: String,
        years: List<String>,
        type: QuestionType,
        marksBreakdown: String,
        textbookRef: String,
        pageNumbers: String,
        highYieldPoints: List<String>,
        referenceLinks: List<ReferenceLink>,
        isClinicalCase: Boolean,
        isRepeatQuestion: Boolean
    ) {
        viewModelScope.launch {
            val finalId = if (!id.isNullOrBlank()) id else "custom_${System.currentTimeMillis()}_${(1000..9999).random()}"
            val entity = UserCustomQuestion(
                id = finalId,
                subjectId = subjectId,
                topicId = topicId.ifBlank { "custom_topic_${subjectId}" },
                topicName = topicName.ifBlank { "Custom Submissions" },
                text = text.trim(),
                yearsCsv = if (years.isNotEmpty()) years.joinToString(", ") else "Custom",
                typeString = type.name,
                marksBreakdown = marksBreakdown.ifBlank { "10 Marks" },
                textbookRef = textbookRef.ifBlank { "Standard Reference" },
                pageNumbers = pageNumbers.trim(),
                highYieldPointsRaw = highYieldPoints.joinToString("\n"),
                referenceLinksRaw = referenceLinks.joinToString("\n") { "${it.title}|${it.url}|${it.type}" },
                isClinicalCase = isClinicalCase,
                isRepeatQuestion = isRepeatQuestion
            )
            customQuestionDao.insertCustomQuestion(entity)

            // If selected question was this one, update it in state
            if (_selectedQuestion.value?.id == finalId) {
                _selectedQuestion.value = entity.toQuestion()
            }
            closeAddQuestionDialog()
        }
    }

    fun deleteCustomQuestion(questionId: String) {
        viewModelScope.launch {
            customQuestionDao.deleteCustomQuestionById(questionId)
            if (_selectedQuestion.value?.id == questionId) {
                _selectedQuestion.value = null
            }
        }
    }

    suspend fun generateAiPointsForCustomQuestion(
        questionText: String,
        subjectName: String
    ): List<String> {
        _isGeneratingDraftPoints.value = true
        return try {
            val dummyQuestion = Question(
                id = "temp_draft",
                subjectId = "temp",
                topicId = "temp",
                topicName = "Custom",
                text = questionText,
                years = listOf("2025"),
                type = QuestionType.LONG_ESSAY,
                marksBreakdown = "10 Marks",
                textbookRef = "Standard Medical Textbook",
                pageNumbers = "",
                highYieldPoints = emptyList(),
                referenceLinks = emptyList()
            )
            val dummySubject = Subject(
                id = "temp",
                name = subjectName,
                code = "MED",
                iconName = "School",
                primaryColor = 0xFF0D47A1,
                secondaryColor = 0xFFE3F2FD,
                standardTextbook = repository.getStandardTextbooks().first(),
                theoryMarks = "", practicalMarks = "", vivaMarks = "",
                syllabusOverview = "", marksDistributionDetails = emptyList(),
                topics = emptyList()
            )
            val result = aiService.generateAnswer(dummyQuestion, dummySubject, AiSolverMode.COMPREHENSIVE_ANSWER)
            if (result.isSuccess) {
                val fullAnswer = result.getOrNull() ?: ""
                val lines = fullAnswer.split("\n")
                    .map { it.trim().trimStart('-', '*', '•', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.', ' ') }
                    .filter { it.length in 25..300 && !it.startsWith("#") }
                    .take(6)
                if (lines.isNotEmpty()) lines else listOf(
                    "Clinical Presentation, Hallmarks & Differential Diagnosis",
                    "Pathophysiology and diagnostic criteria classification",
                    "Gold-standard laboratory, radiological and biopsy investigations",
                    "Emergency protocol, first-line medical therapy and definitive surgical management"
                )
            } else {
                listOf(
                    "Clinical Presentation, Hallmarks & Differential Diagnosis",
                    "Pathophysiology and diagnostic criteria classification",
                    "Gold-standard laboratory, radiological and biopsy investigations",
                    "Emergency protocol, first-line medical therapy and definitive surgical management"
                )
            }
        } catch (e: Exception) {
            listOf(
                "Clinical Presentation, Hallmarks & Differential Diagnosis",
                "Pathophysiology and diagnostic criteria classification",
                "Gold-standard laboratory, radiological and biopsy investigations",
                "Emergency protocol, first-line medical therapy and definitive surgical management"
            )
        } finally {
            _isGeneratingDraftPoints.value = false
        }
    }

    fun setAiMode(mode: AiSolverMode) {
        _activeAiMode.value = mode
        val question = _selectedQuestion.value
        val subject = _selectedSubject.value ?: repository.getAllSubjects().first()
        if (question != null) {
            solveQuestionWithAi(question, subject, mode, null)
        }
    }

    fun solveQuestionWithAi(
        question: Question,
        subject: Subject,
        mode: AiSolverMode = _activeAiMode.value,
        customQuery: String? = null
    ) {
        _isAiLoading.value = true
        viewModelScope.launch {
            val result = aiService.generateAnswer(question, subject, mode, customQuery)
            _isAiLoading.value = false
            result.onSuccess { answer ->
                _currentAiSolution.value = answer
                userDao.cacheAiAnswer(question.id, answer, mode.name)
            }.onFailure {
                val fallback = aiService.generateLocalTextbookAnswer(question, subject, mode, customQuery)
                _currentAiSolution.value = fallback
            }
        }
    }

    // Persistent AI Assistant Handlers
    fun openAiAssistant(initialText: String? = null, question: Question? = null) {
        val targetQuestion = question ?: _selectedQuestion.value
        _aiAssistantActiveQuestion.value = targetQuestion

        val currentSubjectList = allSubjects.value
        if (targetQuestion != null) {
            val matchingSubject = currentSubjectList.find { it.id == targetQuestion.subjectId }
                ?: _selectedSubject.value
                ?: repository.getAllSubjects().first()
            _aiAssistantSubject.value = matchingSubject
            if (!initialText.isNullOrBlank()) {
                _aiAssistantInputText.value = initialText
            } else if (_aiAssistantInputText.value.isBlank()) {
                _aiAssistantInputText.value = targetQuestion.text
            }
        } else {
            if (!initialText.isNullOrBlank()) {
                _aiAssistantInputText.value = initialText
            }
            if (_aiAssistantSubject.value == null) {
                _aiAssistantSubject.value = _selectedSubject.value ?: repository.getAllSubjects().first()
            }
        }
        _isAiAssistantOpen.value = true
    }

    fun closeAiAssistant() {
        _isAiAssistantOpen.value = false
    }

    fun setAiAssistantInputText(text: String) {
        _aiAssistantInputText.value = text
    }

    fun setAiAssistantSubject(subject: Subject) {
        _aiAssistantSubject.value = subject
    }

    fun setAiAssistantQuestion(question: Question?) {
        _aiAssistantActiveQuestion.value = question
        if (question != null) {
            _aiAssistantInputText.value = question.text
            val sub = allSubjects.value.find { it.id == question.subjectId }
            if (sub != null) {
                _aiAssistantSubject.value = sub
            }
        }
    }

    fun clearAiAssistantSolution() {
        _aiAssistantSolution.value = null
    }

    fun solveWithAiAssistant(
        text: String,
        mode: AiSolverMode = _activeAiMode.value,
        customQuery: String? = null
    ) {
        if (text.isBlank()) return
        val subject = _aiAssistantSubject.value ?: _selectedSubject.value ?: repository.getAllSubjects().first()
        val linkedQ = _aiAssistantActiveQuestion.value

        _isAiAssistantLoading.value = true
        viewModelScope.launch {
            val result = aiService.solveCustomOrSelectedText(
                queryText = text,
                subject = subject,
                mode = mode,
                linkedQuestion = linkedQ,
                followUpPrompt = customQuery
            )
            _isAiAssistantLoading.value = false
            result.onSuccess { answer ->
                _aiAssistantSolution.value = answer
                if (linkedQ != null) {
                    userDao.cacheAiAnswer(linkedQ.id, answer, mode.name)
                }
            }.onFailure {
                val fallback = aiService.generateLocalTextbookAnswerForQuery(
                    queryText = text,
                    subject = subject,
                    mode = mode,
                    linkedQuestion = linkedQ,
                    followUpPrompt = customQuery
                )
                _aiAssistantSolution.value = fallback
            }
        }
    }

    fun toggleBookmark(questionId: String) {
        viewModelScope.launch {
            val currentData = userDao.getUserDataForQuestion(questionId)
            val newBookmarked = !(currentData?.isBookmarked ?: false)
            if (currentData == null) {
                userDao.saveUserData(UserQuestionData(questionId = questionId, isBookmarked = newBookmarked))
            } else {
                userDao.updateBookmark(questionId, newBookmarked)
            }
        }
    }

    fun toggleMastered(questionId: String) {
        viewModelScope.launch {
            val currentData = userDao.getUserDataForQuestion(questionId)
            val newMastered = !(currentData?.isMastered ?: false)
            if (currentData == null) {
                userDao.saveUserData(UserQuestionData(questionId = questionId, isMastered = newMastered))
            } else {
                userDao.updateMastered(questionId, newMastered)
            }
        }
    }

    fun saveUserNotes(questionId: String, notes: String) {
        viewModelScope.launch {
            val currentData = userDao.getUserDataForQuestion(questionId)
            if (currentData == null) {
                userDao.saveUserData(UserQuestionData(questionId = questionId, userNotes = notes))
            } else {
                userDao.updateNotes(questionId, notes)
            }
        }
    }

    // Focus Timer State & Methods
    private val sessionDao = database.studySessionDao()
    val allStudySessions: StateFlow<List<StudySession>> = sessionDao.getAllSessions()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    private val _timerMode = MutableStateFlow(TimerMode.POMODORO)
    val timerMode: StateFlow<TimerMode> = _timerMode.asStateFlow()

    private val _selectedTimerSubject = MutableStateFlow<Subject?>(null)
    val selectedTimerSubject: StateFlow<Subject?> = _selectedTimerSubject.asStateFlow()

    private val _totalDurationSeconds = MutableStateFlow(25 * 60)
    val totalDurationSeconds: StateFlow<Int> = _totalDurationSeconds.asStateFlow()

    private val _timeRemainingSeconds = MutableStateFlow(25 * 60)
    val timeRemainingSeconds: StateFlow<Int> = _timeRemainingSeconds.asStateFlow()

    private val _timerRunning = MutableStateFlow(false)
    val timerRunning: StateFlow<Boolean> = _timerRunning.asStateFlow()

    private val _completedPomodorosCount = MutableStateFlow(0)
    val completedPomodorosCount: StateFlow<Int> = _completedPomodorosCount.asStateFlow()

    private val _lastSessionFinishedNotice = MutableStateFlow<String?>(null)
    val lastSessionFinishedNotice: StateFlow<String?> = _lastSessionFinishedNotice.asStateFlow()

    private var timerJob: Job? = null

    fun startTimer() {
        if (_timerRunning.value) return
        _timerRunning.value = true
        timerJob?.cancel()
        timerJob = viewModelScope.launch {
            while (_timerRunning.value && _timeRemainingSeconds.value > 0) {
                delay(1000L)
                if (_timerRunning.value && _timeRemainingSeconds.value > 0) {
                    _timeRemainingSeconds.value -= 1
                }
            }
            if (_timeRemainingSeconds.value <= 0 && _timerRunning.value) {
                _timerRunning.value = false
                onTimerFinished()
            }
        }
    }

    fun pauseTimer() {
        _timerRunning.value = false
        timerJob?.cancel()
    }

    fun toggleTimer() {
        if (_timerRunning.value) {
            pauseTimer()
        } else {
            startTimer()
        }
    }

    fun resetTimer() {
        pauseTimer()
        _timeRemainingSeconds.value = _totalDurationSeconds.value
    }

    fun skipTimerPhase() {
        pauseTimer()
        val current = _timerMode.value
        if (current == TimerMode.POMODORO || current == TimerMode.EXTENDED_FOCUS) {
            if (_completedPomodorosCount.value > 0 && (_completedPomodorosCount.value + 1) % 4 == 0) {
                setTimerMode(TimerMode.LONG_BREAK)
            } else {
                setTimerMode(TimerMode.SHORT_BREAK)
            }
        } else {
            setTimerMode(TimerMode.POMODORO)
        }
    }

    fun setTimerMode(mode: TimerMode, customMinutes: Int? = null) {
        pauseTimer()
        _timerMode.value = mode
        val mins = customMinutes ?: mode.defaultMinutes
        _totalDurationSeconds.value = mins * 60
        _timeRemainingSeconds.value = mins * 60
    }

    fun selectTimerSubject(subject: Subject?) {
        _selectedTimerSubject.value = subject
    }

    private fun onTimerFinished() {
        val currentMode = _timerMode.value
        val subject = _selectedTimerSubject.value ?: allSubjects.value.firstOrNull()
        val durationMins = _totalDurationSeconds.value / 60

        if (currentMode == TimerMode.POMODORO || currentMode == TimerMode.EXTENDED_FOCUS) {
            _completedPomodorosCount.value += 1
            if (subject != null) {
                viewModelScope.launch {
                    sessionDao.insertSession(
                        StudySession(
                            subjectId = subject.id,
                            subjectName = subject.name,
                            durationMinutes = durationMins,
                            sessionType = currentMode.name,
                            timestamp = System.currentTimeMillis(),
                            completedSuccessfully = true
                        )
                    )
                }
            }
            _lastSessionFinishedNotice.value = "Great job! Completed $durationMins min of ${subject?.name ?: "Study"}!"
            if (_completedPomodorosCount.value % 4 == 0) {
                setTimerMode(TimerMode.LONG_BREAK)
            } else {
                setTimerMode(TimerMode.SHORT_BREAK)
            }
        } else {
            _lastSessionFinishedNotice.value = "Break finished! Ready for the next learning block?"
            setTimerMode(TimerMode.POMODORO)
        }
    }

    fun dismissSessionNotice() {
        _lastSessionFinishedNotice.value = null
    }

    fun clearStudyHistory() {
        viewModelScope.launch {
            sessionDao.clearAllSessions()
        }
    }

    // --- Spaced Repetition System (SRS) State & Operations ---
    private val _srsSubjectFilter = MutableStateFlow<Subject?>(null)
    val srsSubjectFilter: StateFlow<Subject?> = _srsSubjectFilter.asStateFlow()

    private val _srsSessionIndex = MutableStateFlow(0)
    val srsSessionIndex: StateFlow<Int> = _srsSessionIndex.asStateFlow()

    private val _srsActiveModeOnlyDue = MutableStateFlow(true)
    val srsActiveModeOnlyDue: StateFlow<Boolean> = _srsActiveModeOnlyDue.asStateFlow()

    val allSrsItems: StateFlow<List<SrsQuestionReviewItem>> = combine(
        allSubjects,
        userQuestionDataMap
    ) { subjects, dataMap ->
        val now = System.currentTimeMillis()
        val allQuestionsWithSubject = subjects.flatMap { subj ->
            subj.topics.flatMap { topic ->
                topic.questions.map { q -> q to subj }
            }
        }
        allQuestionsWithSubject.mapNotNull { (q, subj) ->
            val uData = dataMap[q.id]
            if (uData != null && (uData.status != QuestionProgressStatus.UNATTEMPTED.id || uData.isBookmarked || uData.srsIntervalDays > 0)) {
                val nextRev = uData.nextReviewTimestamp
                val isDue = nextRev <= now || nextRev == 0L
                val daysUntilDue = if (nextRev <= now) 0 else (((nextRev - now) / (24 * 3600 * 1000L)).toInt() + 1)
                val stageLabel = when {
                    uData.isMastered || uData.srsIntervalDays >= 14 -> "Mastered"
                    uData.srsIntervalDays >= 4 -> "Review Stage"
                    uData.srsIntervalDays >= 1 -> "Learning Stage"
                    else -> "New / Due"
                }
                SrsQuestionReviewItem(
                    question = q,
                    subject = subj,
                    userData = uData,
                    isDue = isDue,
                    daysUntilDue = daysUntilDue,
                    stageLabel = stageLabel
                )
            } else {
                null
            }
        }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    val activeSrsQueue: StateFlow<List<SrsQuestionReviewItem>> = combine(
        allSrsItems,
        _srsSubjectFilter,
        _srsActiveModeOnlyDue
    ) { items, subjFilter, onlyDue ->
        var list = items
        if (subjFilter != null) {
            list = list.filter { it.subject.id == subjFilter.id }
        }
        if (onlyDue) {
            list = list.filter { it.isDue }
        }
        list.sortedWith(compareBy({ !it.isDue }, { it.userData?.nextReviewTimestamp ?: 0L }))
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    val currentSrsReviewCard: StateFlow<SrsQuestionReviewItem?> = combine(
        activeSrsQueue,
        _srsSessionIndex
    ) { queue, index ->
        if (queue.isNotEmpty() && index in queue.indices) {
            queue[index]
        } else {
            null
        }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), null)

    val srsDueCount: StateFlow<Int> = allSrsItems.map { items ->
        items.count { it.isDue }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), 0)

    val srsMasteredCount: StateFlow<Int> = allSrsItems.map { items ->
        items.count { it.userData?.isMastered == true || (it.userData?.srsIntervalDays ?: 0) >= 14 }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), 0)

    val srsLearningCount: StateFlow<Int> = allSrsItems.map { items ->
        items.count { (it.userData?.srsIntervalDays ?: 0) in 1..13 && it.userData?.isMastered != true }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), 0)

    fun recordSrsReview(questionId: String, rating: SrsRating) {
        viewModelScope.launch {
            val currentData = userDao.getUserDataForQuestion(questionId)
            val currentReps = currentData?.srsRepetitions ?: 0
            val currentInterval = currentData?.srsIntervalDays ?: 0
            val currentEase = currentData?.srsEaseFactor ?: 2.5f

            val result = SrsAlgorithm.calculateNextReview(
                currentRepetitions = currentReps,
                currentIntervalDays = currentInterval,
                currentEaseFactor = currentEase,
                rating = rating
            )

            if (currentData == null) {
                userDao.saveUserData(
                    UserQuestionData(
                        questionId = questionId,
                        status = result.resultingStatus.id,
                        srsRepetitions = result.repetitions,
                        srsIntervalDays = result.intervalDays,
                        srsEaseFactor = result.easeFactor,
                        nextReviewTimestamp = result.nextReviewTimestamp,
                        lastReviewRating = rating.value,
                        isMastered = result.isMastered
                    )
                )
            } else {
                userDao.updateSrsReview(
                    questionId = questionId,
                    repetitions = result.repetitions,
                    intervalDays = result.intervalDays,
                    easeFactor = result.easeFactor,
                    nextReviewTimestamp = result.nextReviewTimestamp,
                    rating = rating.value,
                    status = result.resultingStatus.id,
                    isMastered = result.isMastered
                )
            }

            _srsSessionIndex.value += 1
        }
    }

    fun restartSrsSession() {
        _srsSessionIndex.value = 0
    }

    fun setSrsSubjectFilter(subject: Subject?) {
        _srsSubjectFilter.value = subject
        _srsSessionIndex.value = 0
    }

    fun setSrsModeOnlyDue(onlyDue: Boolean) {
        _srsActiveModeOnlyDue.value = onlyDue
        _srsSessionIndex.value = 0
    }

    fun seedHighYieldQuestionsToSrs() {
        viewModelScope.launch {
            val now = System.currentTimeMillis()
            val topRepeats = repository.getAllSubjects().flatMap { s ->
                s.topics.flatMap { t -> t.questions.filter { it.isRepeatQuestion || it.years.size > 1 } }
            }.take(12)

            topRepeats.forEach { q ->
                val existing = userDao.getUserDataForQuestion(q.id)
                if (existing == null) {
                    userDao.saveUserData(
                        UserQuestionData(
                            questionId = q.id,
                            status = QuestionProgressStatus.ATTEMPTED.id,
                            srsRepetitions = 0,
                            srsIntervalDays = 0,
                            srsEaseFactor = 2.5f,
                            nextReviewTimestamp = now,
                            lastReviewRating = 0,
                            isMastered = false
                        )
                    )
                } else if (existing.nextReviewTimestamp == 0L) {
                    userDao.updateSrsReview(
                        questionId = q.id,
                        repetitions = existing.srsRepetitions,
                        intervalDays = 0,
                        easeFactor = existing.srsEaseFactor,
                        nextReviewTimestamp = now,
                        rating = 0,
                        status = if (existing.status == QuestionProgressStatus.UNATTEMPTED.id) QuestionProgressStatus.ATTEMPTED.id else existing.status,
                        isMastered = false
                    )
                }
            }
            _srsSessionIndex.value = 0
        }
    }

    fun getTextbooks(): List<TextbookInfo> = repository.getStandardTextbooks()
}
