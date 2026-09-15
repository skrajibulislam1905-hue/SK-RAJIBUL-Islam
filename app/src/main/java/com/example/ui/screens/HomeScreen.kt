package com.example.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.data.model.Question
import com.example.data.model.QuestionProgressStatus
import com.example.ui.viewmodel.AppNavScreen
import com.example.ui.viewmodel.MainViewModel

enum class MainBottomTab(val title: String, val iconSelected: @Composable () -> Unit, val iconUnselected: @Composable () -> Unit) {
    CURRICULUM(
        "Subjects & PYQ",
        { Icon(Icons.Filled.School, contentDescription = "Subjects") },
        { Icon(Icons.Outlined.School, contentDescription = "Subjects") }
    ),
    REVIEW(
        "SRS Review",
        { Icon(Icons.Filled.Psychology, contentDescription = "Review") },
        { Icon(Icons.Outlined.Psychology, contentDescription = "Review") }
    ),
    FOCUS(
        "Focus Timer",
        { Icon(Icons.Filled.Timer, contentDescription = "Focus Timer") },
        { Icon(Icons.Outlined.Timer, contentDescription = "Focus Timer") }
    ),
    PROGRESS(
        "Progress",
        { Icon(Icons.Filled.Analytics, contentDescription = "Progress") },
        { Icon(Icons.Outlined.Analytics, contentDescription = "Progress") }
    ),
    TEXTBOOKS(
        "Textbooks",
        { Icon(Icons.Filled.MenuBook, contentDescription = "Textbooks") },
        { Icon(Icons.Outlined.MenuBook, contentDescription = "Textbooks") }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(viewModel: MainViewModel) {
    val allSubjects by viewModel.allSubjects.collectAsStateWithLifecycle()
    val currentScreen by viewModel.currentScreen.collectAsStateWithLifecycle()
    val selectedSubject by viewModel.selectedSubject.collectAsStateWithLifecycle()
    val selectedTopic by viewModel.selectedTopic.collectAsStateWithLifecycle()
    val displayedQuestions by viewModel.displayedQuestions.collectAsStateWithLifecycle()
    val selectedQuestion by viewModel.selectedQuestion.collectAsStateWithLifecycle()
    val selectedStatusFilter by viewModel.selectedStatusFilter.collectAsStateWithLifecycle()
    val userDataMap by viewModel.userQuestionDataMap.collectAsStateWithLifecycle()

    val subjectProgressList by viewModel.subjectProgressList.collectAsStateWithLifecycle()
    val areasNeedingAttention by viewModel.areasNeedingAttention.collectAsStateWithLifecycle()

    val activeAiMode by viewModel.activeAiMode.collectAsStateWithLifecycle()
    val isAiLoading by viewModel.isAiLoading.collectAsStateWithLifecycle()
    val currentAiSolution by viewModel.currentAiSolution.collectAsStateWithLifecycle()

    val onlyCustom by viewModel.onlyCustom.collectAsStateWithLifecycle()
    val isAddQuestionDialogOpen by viewModel.isAddQuestionDialogOpen.collectAsStateWithLifecycle()
    val questionToEdit by viewModel.questionToEdit.collectAsStateWithLifecycle()
    val isGeneratingAiDraft by viewModel.isGeneratingDraftPoints.collectAsStateWithLifecycle()

    val isAiAssistantOpen by viewModel.isAiAssistantOpen.collectAsStateWithLifecycle()
    val aiAssistantInputText by viewModel.aiAssistantInputText.collectAsStateWithLifecycle()
    val aiAssistantSubject by viewModel.aiAssistantSubject.collectAsStateWithLifecycle()
    val aiAssistantActiveQuestion by viewModel.aiAssistantActiveQuestion.collectAsStateWithLifecycle()
    val aiAssistantSolution by viewModel.aiAssistantSolution.collectAsStateWithLifecycle()
    val isAiAssistantLoading by viewModel.isAiAssistantLoading.collectAsStateWithLifecycle()

    var activeBottomTab by remember { mutableStateOf(MainBottomTab.CURRICULUM) }

    // Intercept back button for deep navigation (Questions -> Topics -> Subjects)
    BackHandler(enabled = currentScreen != AppNavScreen.SUBJECTS) {
        viewModel.navigateBack()
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = when (currentScreen) {
                                AppNavScreen.SUBJECTS -> "Academic PYQ & Problem Solver"
                                AppNavScreen.TOPICS -> selectedSubject?.name ?: "Topics"
                                AppNavScreen.QUESTIONS -> selectedTopic?.name ?: "Questions"
                                AppNavScreen.SRS_REVIEW -> "Spaced Repetition Review (SM-2)"
                                AppNavScreen.FOCUS_TIMER -> "Study Focus & Pomodoro Blocks"
                                AppNavScreen.PROGRESS_SUMMARY -> "Progress & Mastery Summary"
                                AppNavScreen.TEXTBOOKS -> "Prescribed Textbooks Library"
                            },
                            fontWeight = FontWeight.Bold,
                            fontSize = 17.sp,
                            maxLines = 1
                        )
                        Text(
                            text = when (currentScreen) {
                                AppNavScreen.SUBJECTS -> "Select subject to explore topics & questions"
                                AppNavScreen.TOPICS -> "Select topic to practice questions"
                                AppNavScreen.QUESTIONS -> "${selectedSubject?.name ?: ""} • ${displayedQuestions.size} Questions"
                                AppNavScreen.SRS_REVIEW -> "Optimal recall intervals • Active flashcard drill"
                                AppNavScreen.FOCUS_TIMER -> "Track time per subject • Pomodoro interval cycles"
                                AppNavScreen.PROGRESS_SUMMARY -> "Performance breakdown & focus areas"
                                AppNavScreen.TEXTBOOKS -> "Official reference texts & clinical guidelines"
                            },
                            fontSize = 11.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            maxLines = 1
                        )
                    }
                },
                navigationIcon = {
                    if (currentScreen == AppNavScreen.TOPICS || currentScreen == AppNavScreen.QUESTIONS) {
                        IconButton(onClick = { viewModel.navigateBack() }) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "Back"
                            )
                        }
                    }
                },
                actions = {
                    IconButton(
                        onClick = { viewModel.openAddQuestionDialog(selectedSubject, selectedTopic) },
                        modifier = Modifier.testTag("topbar_add_question_button")
                    ) {
                        Icon(
                            imageVector = Icons.Default.PostAdd,
                            contentDescription = "Add Question",
                            tint = MaterialTheme.colorScheme.primary
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        },
        bottomBar = {
            NavigationBar(
                containerColor = MaterialTheme.colorScheme.surface,
                tonalElevation = 8.dp
            ) {
                MainBottomTab.values().forEach { tab ->
                    val isSelected = when (tab) {
                        MainBottomTab.CURRICULUM -> currentScreen in listOf(AppNavScreen.SUBJECTS, AppNavScreen.TOPICS, AppNavScreen.QUESTIONS)
                        MainBottomTab.REVIEW -> currentScreen == AppNavScreen.SRS_REVIEW
                        MainBottomTab.FOCUS -> currentScreen == AppNavScreen.FOCUS_TIMER
                        MainBottomTab.PROGRESS -> currentScreen == AppNavScreen.PROGRESS_SUMMARY
                        MainBottomTab.TEXTBOOKS -> currentScreen == AppNavScreen.TEXTBOOKS
                    }

                    NavigationBarItem(
                        selected = isSelected,
                        onClick = {
                            activeBottomTab = tab
                            when (tab) {
                                MainBottomTab.CURRICULUM -> {
                                    if (currentScreen in listOf(AppNavScreen.PROGRESS_SUMMARY, AppNavScreen.TEXTBOOKS, AppNavScreen.FOCUS_TIMER, AppNavScreen.SRS_REVIEW)) {
                                        viewModel.navigateToSubjects()
                                    }
                                }
                                MainBottomTab.REVIEW -> viewModel.navigateToSrsReview()
                                MainBottomTab.FOCUS -> viewModel.navigateToFocusTimer()
                                MainBottomTab.PROGRESS -> viewModel.navigateToProgress()
                                MainBottomTab.TEXTBOOKS -> viewModel.navigateToTextbooks()
                            }
                        },
                        icon = {
                            if (isSelected) tab.iconSelected() else tab.iconUnselected()
                        },
                        label = {
                            Text(tab.title, fontSize = 11.sp, fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal)
                        }
                    )
                }
            }
        },
        floatingActionButton = {
            AiAssistantFloatingBubble(
                activeQuestion = selectedQuestion ?: aiAssistantActiveQuestion,
                onClick = {
                    viewModel.openAiAssistant()
                }
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            when (currentScreen) {
                AppNavScreen.SUBJECTS -> {
                    SubjectsScreen(
                        subjects = allSubjects,
                        subjectProgressList = subjectProgressList,
                        onSelectSubject = { subject ->
                            viewModel.navigateToTopics(subject)
                        }
                    )
                }

                AppNavScreen.TOPICS -> {
                    val subject = selectedSubject ?: allSubjects.first()
                    val progress = subjectProgressList.find { it.subject.id == subject.id }
                    TopicsScreen(
                        subject = subject,
                        subjectProgress = progress,
                        onSelectTopic = { topic ->
                            viewModel.navigateToQuestions(topic, subject)
                        },
                        onBack = {
                            viewModel.navigateToSubjects()
                        },
                        onStartFocusTimer = { sub ->
                            viewModel.navigateToFocusTimer(sub)
                        }
                    )
                }

                AppNavScreen.QUESTIONS -> {
                    val subject = selectedSubject ?: allSubjects.first()
                    val topic = selectedTopic ?: subject.topics.first()

                    QuestionsScreen(
                        subject = subject,
                        topic = topic,
                        questions = displayedQuestions,
                        userDataMap = userDataMap,
                        selectedStatusFilter = selectedStatusFilter,
                        onlyCustom = onlyCustom,
                        onStatusFilterChange = { viewModel.setStatusFilter(it) },
                        onToggleOnlyCustom = { viewModel.toggleOnlyCustom() },
                        onSetQuestionStatus = { qId, status ->
                            viewModel.setQuestionStatus(qId, status)
                        },
                        onSelectQuestion = { question ->
                            viewModel.selectQuestion(question)
                        },
                        onToggleBookmark = { qId ->
                            viewModel.toggleBookmark(qId)
                        },
                        onAddQuestion = {
                            viewModel.openAddQuestionDialog(subject, topic)
                        },
                        onBack = {
                            viewModel.navigateBack()
                        }
                    )
                }

                AppNavScreen.SRS_REVIEW -> {
                    ReviewScreen(
                        viewModel = viewModel
                    )
                }

                AppNavScreen.FOCUS_TIMER -> {
                    FocusTimerScreen(
                        viewModel = viewModel
                    )
                }

                AppNavScreen.PROGRESS_SUMMARY -> {
                    ProgressSummaryScreen(
                        subjectProgressList = subjectProgressList,
                        areasNeedingAttention = areasNeedingAttention,
                        onSelectTopicDirectly = { topic, subject ->
                            viewModel.navigateToQuestions(topic, subject)
                        },
                        onNavigateToSrsReview = {
                            viewModel.navigateToSrsReview()
                        }
                    )
                }

                AppNavScreen.TEXTBOOKS -> {
                    TextbooksScreen(
                        textbooks = viewModel.getTextbooks()
                    )
                }
            }
        }
    }

    // AI Problem Solver & Question Detail Bottom Sheet
    selectedQuestion?.let { question ->
        val subject = selectedSubject ?: allSubjects.first()
        QuestionDetailSheet(
            question = question,
            subject = subject,
            userData = userDataMap[question.id],
            activeAiMode = activeAiMode,
            isAiLoading = isAiLoading,
            aiSolution = currentAiSolution,
            onSelectAiMode = { mode -> viewModel.setAiMode(mode) },
            onSolveAi = { q, sub, mode, query ->
                viewModel.solveQuestionWithAi(q, sub, mode, query)
            },
            onSetQuestionStatus = { qId, status ->
                viewModel.setQuestionStatus(qId, status)
            },
            onToggleBookmark = { qId -> viewModel.toggleBookmark(qId) },
            onToggleMastered = { qId -> viewModel.toggleMastered(qId) },
            onSaveNotes = { qId, notes -> viewModel.saveUserNotes(qId, notes) },
            onDismiss = { viewModel.selectQuestion(null) },
            onRateSrs = { rating -> viewModel.recordSrsReview(question.id, rating) },
            onEditCustomQuestion = { q ->
                viewModel.openEditQuestionDialog(q)
            },
            onDeleteCustomQuestion = { qId ->
                viewModel.deleteCustomQuestion(qId)
            },
            onOpenInAiAssistant = { q ->
                viewModel.openAiAssistant(question = q)
            }
        )
    }

    // Add / Edit Custom Question Dialog
    if (isAddQuestionDialogOpen) {
        AddEditQuestionDialog(
            allSubjects = allSubjects,
            initialSubject = selectedSubject,
            initialTopic = selectedTopic,
            questionToEdit = questionToEdit,
            isGeneratingAi = isGeneratingAiDraft,
            onGenerateAiPoints = { qText, sName ->
                viewModel.generateAiPointsForCustomQuestion(qText, sName)
            },
            onSaveQuestion = { id, subId, topId, topName, text, years, type, marks, textbook, pages, points, refs, isClinical, isRepeat ->
                viewModel.saveCustomQuestion(
                    id, subId, topId, topName, text, years, type, marks, textbook, pages, points, refs, isClinical, isRepeat
                )
            },
            onDismiss = {
                viewModel.closeAddQuestionDialog()
            }
        )
    }

    // Persistent Floating AI Assistant Bottom Sheet
    if (isAiAssistantOpen) {
        val subjectForAssistant = aiAssistantSubject ?: selectedSubject ?: allSubjects.first()
        AiAssistantBottomSheet(
            allSubjects = allSubjects,
            selectedSubject = subjectForAssistant,
            activeQuestion = aiAssistantActiveQuestion ?: selectedQuestion,
            inputText = aiAssistantInputText,
            solution = aiAssistantSolution,
            isLoading = isAiAssistantLoading,
            onSelectSubject = { sub -> viewModel.setAiAssistantSubject(sub) },
            onInputTextChange = { text -> viewModel.setAiAssistantInputText(text) },
            onSelectQuestion = { q -> viewModel.setAiAssistantQuestion(q) },
            onSolve = { text, mode, followUp ->
                viewModel.solveWithAiAssistant(text, mode, followUp)
            },
            onSaveToQuestionNotes = { qId, notes ->
                viewModel.saveUserNotes(qId, notes)
            },
            onClearSolution = {
                viewModel.clearAiAssistantSolution()
            },
            onDismiss = {
                viewModel.closeAiAssistant()
            }
        )
    }
}
