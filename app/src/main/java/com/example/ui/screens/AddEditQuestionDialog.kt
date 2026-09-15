package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.data.model.Question
import com.example.data.model.QuestionType
import com.example.data.model.ReferenceLink
import com.example.data.model.Subject
import com.example.data.model.Topic
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddEditQuestionDialog(
    allSubjects: List<Subject>,
    initialSubject: Subject?,
    initialTopic: Topic?,
    questionToEdit: Question?,
    isGeneratingAi: Boolean,
    onGenerateAiPoints: suspend (String, String) -> List<String>,
    onSaveQuestion: (
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
    ) -> Unit,
    onDismiss: () -> Unit
) {
    val coroutineScope = rememberCoroutineScope()

    // Determine initial subject
    val selectedSubject = remember {
        mutableStateOf(
            if (questionToEdit != null) {
                allSubjects.find { it.id.equals(questionToEdit.subjectId, ignoreCase = true) } ?: allSubjects.first()
            } else {
                initialSubject ?: allSubjects.first()
            }
        )
    }

    // Determine initial topic
    var selectedTopicId by remember {
        mutableStateOf(
            questionToEdit?.topicId ?: initialTopic?.id ?: selectedSubject.value.topics.firstOrNull()?.id ?: "custom_topic"
        )
    }
    var isCustomTopic by remember {
        mutableStateOf(
            questionToEdit?.let { q -> selectedSubject.value.topics.none { it.id == q.topicId } } ?: false
        )
    }
    var customTopicName by remember {
        mutableStateOf(if (isCustomTopic) questionToEdit?.topicName ?: "" else "")
    }

    // Form fields
    var questionText by remember { mutableStateOf(questionToEdit?.text ?: "") }
    var questionType by remember { mutableStateOf(questionToEdit?.type ?: QuestionType.LONG_ESSAY) }
    var marksText by remember { mutableStateOf(questionToEdit?.marksBreakdown ?: "10 Marks") }
    var yearsText by remember { mutableStateOf(questionToEdit?.years?.joinToString(", ") ?: "2025") }
    var textbookRefText by remember {
        mutableStateOf(
            questionToEdit?.textbookRef ?: selectedSubject.value.standardTextbook.title
        )
    }
    var pageNumbersText by remember { mutableStateOf(questionToEdit?.pageNumbers ?: "") }
    var highYieldPointsText by remember {
        mutableStateOf(questionToEdit?.highYieldPoints?.joinToString("\n") ?: "")
    }
    var referenceUrlText by remember {
        mutableStateOf(questionToEdit?.referenceLinks?.firstOrNull()?.url ?: "")
    }
    var referenceTitleText by remember {
        mutableStateOf(questionToEdit?.referenceLinks?.firstOrNull()?.title ?: "")
    }
    var isClinicalCase by remember { mutableStateOf(questionToEdit?.isClinicalCase ?: false) }
    var isRepeatQuestion by remember { mutableStateOf(questionToEdit?.isRepeatQuestion ?: false) }

    // Validation
    var showValidationError by remember { mutableStateOf(false) }

    // Update textbook when subject changes (if not editing an existing question)
    LaunchedEffect(selectedSubject.value) {
        if (questionToEdit == null) {
            textbookRefText = selectedSubject.value.standardTextbook.title
            if (!isCustomTopic) {
                selectedTopicId = selectedSubject.value.topics.firstOrNull()?.id ?: "custom_topic"
            }
        }
    }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth(0.95f)
                .fillMaxHeight(0.92f)
                .clip(RoundedCornerShape(20.dp)),
            color = MaterialTheme.colorScheme.surface,
            tonalElevation = 6.dp
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                // Header
                Surface(
                    color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp, vertical = 16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Surface(
                                color = MaterialTheme.colorScheme.primaryContainer,
                                shape = CircleShape,
                                modifier = Modifier.size(40.dp)
                            ) {
                                Box(contentAlignment = Alignment.Center) {
                                    Icon(
                                        imageVector = if (questionToEdit != null) Icons.Default.EditNote else Icons.Default.PostAdd,
                                        contentDescription = null,
                                        tint = MaterialTheme.colorScheme.onPrimaryContainer,
                                        modifier = Modifier.size(24.dp)
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Column {
                                Text(
                                    text = if (questionToEdit != null) "Edit Custom Question" else "Add Custom Question",
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                                Text(
                                    text = "University PYQs, Model Exams & Internal Assessments",
                                    fontSize = 12.sp,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }
                        }

                        IconButton(
                            onClick = onDismiss,
                            modifier = Modifier
                                .size(36.dp)
                                .testTag("close_add_question_button")
                        ) {
                            Icon(imageVector = Icons.Default.Close, contentDescription = "Close")
                        }
                    }
                }

                HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f))

                // Scrollable Form Body
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(horizontal = 20.dp)
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Spacer(modifier = Modifier.height(4.dp))

                    // 1. Subject Selector
                    Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                        Text(
                            text = "1. Select MBBS Subject *",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .horizontalScroll(rememberScrollState())
                        ) {
                            allSubjects.forEach { sub ->
                                val isSelected = sub.id == selectedSubject.value.id
                                FilterChip(
                                    selected = isSelected,
                                    onClick = {
                                        selectedSubject.value = sub
                                        if (!isCustomTopic) {
                                            selectedTopicId = sub.topics.firstOrNull()?.id ?: "custom_topic"
                                        }
                                    },
                                    label = { Text(sub.name, fontSize = 12.sp) },
                                    leadingIcon = {
                                        Surface(
                                            color = Color(sub.primaryColor),
                                            shape = CircleShape,
                                            modifier = Modifier.size(10.dp)
                                        ) {}
                                    },
                                    colors = FilterChipDefaults.filterChipColors(
                                        selectedContainerColor = Color(sub.primaryColor).copy(alpha = 0.15f),
                                        selectedLabelColor = Color(sub.primaryColor)
                                    )
                                )
                            }
                        }
                    }

                    // 2. Topic Selector
                    Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                        Text(
                            text = "2. Topic / Section *",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .horizontalScroll(rememberScrollState())
                        ) {
                            selectedSubject.value.topics.forEach { top ->
                                val isSelected = !isCustomTopic && top.id == selectedTopicId
                                FilterChip(
                                    selected = isSelected,
                                    onClick = {
                                        isCustomTopic = false
                                        selectedTopicId = top.id
                                    },
                                    label = { Text(top.name, fontSize = 12.sp, maxLines = 1) }
                                )
                            }
                            // Option for custom new topic
                            FilterChip(
                                selected = isCustomTopic,
                                onClick = { isCustomTopic = true },
                                label = { Text("+ Custom Topic", fontSize = 12.sp) },
                                leadingIcon = {
                                    Icon(
                                        imageVector = Icons.Default.Add,
                                        contentDescription = null,
                                        modifier = Modifier.size(14.dp)
                                    )
                                }
                            )
                        }

                        AnimatedVisibility(visible = isCustomTopic) {
                            OutlinedTextField(
                                value = customTopicName,
                                onValueChange = { customTopicName = it },
                                label = { Text("Custom Topic Name") },
                                placeholder = { Text("e.g. Critical Care & Resuscitation") },
                                singleLine = true,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 4.dp)
                                    .testTag("custom_topic_name_input")
                            )
                        }
                    }

                    // 3. Question Type Selector
                    Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                        Text(
                            text = "3. Question Type *",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .horizontalScroll(rememberScrollState())
                        ) {
                            QuestionType.values().forEach { qType ->
                                val isSelected = questionType == qType
                                FilterChip(
                                    selected = isSelected,
                                    onClick = { questionType = qType },
                                    label = { Text(qType.displayName, fontSize = 12.sp) }
                                )
                            }
                        }
                    }

                    // 4. Question Text & AI Suggest Button
                    Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "4. Question / Clinical Vignette *",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onSurface
                            )

                            // AI Suggest Button
                            FilledTonalButton(
                                onClick = {
                                    if (questionText.isNotBlank()) {
                                        coroutineScope.launch {
                                            val generated = onGenerateAiPoints(questionText, selectedSubject.value.name)
                                            if (generated.isNotEmpty()) {
                                                highYieldPointsText = generated.joinToString("\n")
                                            }
                                        }
                                    }
                                },
                                enabled = questionText.isNotBlank() && !isGeneratingAi,
                                contentPadding = PaddingValues(horizontal = 10.dp, vertical = 4.dp),
                                modifier = Modifier.height(32.dp).testTag("ai_suggest_points_button")
                            ) {
                                if (isGeneratingAi) {
                                    CircularProgressIndicator(
                                        modifier = Modifier.size(14.dp),
                                        strokeWidth = 2.dp
                                    )
                                    Spacer(modifier = Modifier.width(6.dp))
                                    Text("Drafting...", fontSize = 11.sp)
                                } else {
                                    Icon(
                                        imageVector = Icons.Default.AutoAwesome,
                                        contentDescription = null,
                                        modifier = Modifier.size(14.dp)
                                    )
                                    Spacer(modifier = Modifier.width(6.dp))
                                    Text("AI Auto-Key", fontSize = 11.sp)
                                }
                            }
                        }

                        OutlinedTextField(
                            value = questionText,
                            onValueChange = {
                                questionText = it
                                if (showValidationError && it.isNotBlank()) {
                                    showValidationError = false
                                }
                            },
                            label = { Text("Exam Question Statement") },
                            placeholder = { Text("e.g. A 55-year-old male presents with acute severe chest pain radiating to left arm. Differential diagnosis, emergency protocol, and reperfusion therapy.") },
                            minLines = 3,
                            maxLines = 6,
                            isError = showValidationError && questionText.isBlank(),
                            supportingText = {
                                if (showValidationError && questionText.isBlank()) {
                                    Text("Question statement cannot be empty", color = MaterialTheme.colorScheme.error)
                                } else {
                                    Text("Include clinical history or question subparts (i, ii, iii)")
                                }
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .testTag("custom_question_text_input")
                        )
                    }

                    // 5. Marks Breakdown & Quick Chips
                    Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                        Text(
                            text = "5. Marks Distribution",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            listOf("5 Marks", "10 Marks", "15 Marks", "2 + 3 + 5 = 10M", "20 Marks").forEach { preset ->
                                Surface(
                                    shape = RoundedCornerShape(8.dp),
                                    color = if (marksText == preset) MaterialTheme.colorScheme.primaryContainer else MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f),
                                    modifier = Modifier
                                        .clickable { marksText = preset }
                                        .border(
                                            1.dp,
                                            if (marksText == preset) MaterialTheme.colorScheme.primary else Color.Transparent,
                                            RoundedCornerShape(8.dp)
                                        )
                                ) {
                                    Text(
                                        text = preset,
                                        fontSize = 11.sp,
                                        fontWeight = FontWeight.SemiBold,
                                        color = if (marksText == preset) MaterialTheme.colorScheme.onPrimaryContainer else MaterialTheme.colorScheme.onSurfaceVariant,
                                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 6.dp)
                                    )
                                }
                            }
                        }
                        OutlinedTextField(
                            value = marksText,
                            onValueChange = { marksText = it },
                            label = { Text("Marks Formula / Weightage") },
                            placeholder = { Text("e.g. 3 + 4 + 8 = 15 Marks") },
                            singleLine = true,
                            modifier = Modifier
                                .fillMaxWidth()
                                .testTag("custom_marks_input")
                        )
                    }

                    // 6. Exam Years
                    Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                        Text(
                            text = "6. University / Exam Years",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(6.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            listOf("2025", "2024", "2023", "Send-Up Exam", "Internal Assessment").forEach { chipYear ->
                                AssistChip(
                                    onClick = {
                                        if (!yearsText.contains(chipYear)) {
                                            yearsText = if (yearsText.isBlank()) chipYear else "$yearsText, $chipYear"
                                        }
                                    },
                                    label = { Text("+$chipYear", fontSize = 11.sp) }
                                )
                            }
                        }
                        OutlinedTextField(
                            value = yearsText,
                            onValueChange = { yearsText = it },
                            label = { Text("Exam Years (comma-separated)") },
                            placeholder = { Text("e.g. 2025, 2023 P1, 2021") },
                            singleLine = true,
                            modifier = Modifier
                                .fillMaxWidth()
                                .testTag("custom_years_input")
                        )
                    }

                    // 7. Textbook Reference & Pages
                    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        Text(
                            text = "7. Standard Textbook Reference",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            OutlinedTextField(
                                value = textbookRefText,
                                onValueChange = { textbookRefText = it },
                                label = { Text("Textbook Name & Edition") },
                                modifier = Modifier
                                    .weight(1.8f)
                                    .testTag("custom_textbook_input")
                            )
                            OutlinedTextField(
                                value = pageNumbersText,
                                onValueChange = { pageNumbersText = it },
                                label = { Text("Pages") },
                                placeholder = { Text("pp. 145-150") },
                                singleLine = true,
                                modifier = Modifier
                                    .weight(1.2f)
                                    .testTag("custom_pages_input")
                            )
                        }
                    }

                    // 8. High-Yield Answer Key & Bullets
                    Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                        Text(
                            text = "8. High-Yield Answer Points / Model Key",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            text = "Enter key points (one per line). These will appear in flashcard review & answer breakdown.",
                            fontSize = 11.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        OutlinedTextField(
                            value = highYieldPointsText,
                            onValueChange = { highYieldPointsText = it },
                            label = { Text("Key Bullet Points (1 per line)") },
                            placeholder = {
                                Text(
                                    "1. Clinical presentation & differential diagnosis\n2. Gold-standard diagnostic criteria\n3. First-line medical and emergency resuscitation\n4. Definitive surgical or pharmacological protocol"
                                )
                            },
                            minLines = 4,
                            maxLines = 8,
                            modifier = Modifier
                                .fillMaxWidth()
                                .testTag("custom_high_yield_input")
                        )
                    }

                    // 9. Optional Reference Link
                    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        Text(
                            text = "9. Guideline / Reference Link (Optional)",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            OutlinedTextField(
                                value = referenceTitleText,
                                onValueChange = { referenceTitleText = it },
                                label = { Text("Guideline Title") },
                                placeholder = { Text("e.g. WHO Protocol") },
                                singleLine = true,
                                modifier = Modifier.weight(1.2f)
                            )
                            OutlinedTextField(
                                value = referenceUrlText,
                                onValueChange = { referenceUrlText = it },
                                label = { Text("URL") },
                                placeholder = { Text("https://...") },
                                singleLine = true,
                                modifier = Modifier.weight(1.8f)
                            )
                        }
                    }

                    // 10. Toggles: Clinical Case & Frequent Repeat
                    Surface(
                        color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.35f),
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.padding(12.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(
                                        text = "Clinical Case Scenario",
                                        fontSize = 13.sp,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                    Text(
                                        text = "Marks this question as patient vignette/emergency problem",
                                        fontSize = 11.sp,
                                        color = MaterialTheme.colorScheme.onSurfaceVariant
                                    )
                                }
                                Switch(
                                    checked = isClinicalCase,
                                    onCheckedChange = { isClinicalCase = it },
                                    modifier = Modifier.testTag("clinical_case_toggle")
                                )
                            }

                            HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.3f))

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(
                                        text = "Frequent Repeat Question",
                                        fontSize = 13.sp,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                    Text(
                                        text = "Marks as high-priority repeat exam topic across years",
                                        fontSize = 11.sp,
                                        color = MaterialTheme.colorScheme.onSurfaceVariant
                                    )
                                }
                                Switch(
                                    checked = isRepeatQuestion,
                                    onCheckedChange = { isRepeatQuestion = it },
                                    modifier = Modifier.testTag("repeat_question_toggle")
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))
                }

                HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f))

                // Bottom Action Buttons
                Surface(
                    color = MaterialTheme.colorScheme.surface,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp, vertical = 12.dp),
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        OutlinedButton(
                            onClick = onDismiss,
                            modifier = Modifier
                                .height(44.dp)
                                .testTag("cancel_add_question_button")
                        ) {
                            Text("Cancel")
                        }

                        Spacer(modifier = Modifier.width(12.dp))

                        Button(
                            onClick = {
                                if (questionText.isBlank()) {
                                    showValidationError = true
                                    return@Button
                                }

                                val finalTopicId = if (isCustomTopic) {
                                    val safeName = customTopicName.trim().lowercase().replace(Regex("[^a-z0-9]"), "_")
                                    if (safeName.isNotBlank()) "custom_$safeName" else "custom_topic_${selectedSubject.value.id}"
                                } else {
                                    selectedTopicId
                                }

                                val finalTopicName = if (isCustomTopic) {
                                    customTopicName.trim().ifBlank { "Custom Submissions" }
                                } else {
                                    selectedSubject.value.topics.find { it.id == selectedTopicId }?.name ?: "General Topics"
                                }

                                val yearsList = yearsText.split(",")
                                    .map { it.trim() }
                                    .filter { it.isNotEmpty() }

                                val pointsList = highYieldPointsText.split("\n")
                                    .map { it.trim() }
                                    .filter { it.isNotEmpty() }

                                val refLinks = if (referenceUrlText.isNotBlank()) {
                                    listOf(
                                        ReferenceLink(
                                            title = referenceTitleText.trim().ifBlank { "Reference Guideline" },
                                            url = referenceUrlText.trim(),
                                            type = "Guideline"
                                        )
                                    )
                                } else emptyList()

                                onSaveQuestion(
                                    questionToEdit?.id,
                                    selectedSubject.value.id,
                                    finalTopicId,
                                    finalTopicName,
                                    questionText.trim(),
                                    if (yearsList.isNotEmpty()) yearsList else listOf("Custom"),
                                    questionType,
                                    marksText.trim().ifBlank { "10 Marks" },
                                    textbookRefText.trim().ifBlank { selectedSubject.value.standardTextbook.title },
                                    pageNumbersText.trim(),
                                    pointsList,
                                    refLinks,
                                    isClinicalCase,
                                    isRepeatQuestion
                                )
                            },
                            modifier = Modifier
                                .height(44.dp)
                                .testTag("save_custom_question_button")
                        ) {
                            Icon(
                                imageVector = if (questionToEdit != null) Icons.Default.Save else Icons.Default.Check,
                                contentDescription = null,
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(if (questionToEdit != null) "Update Question" else "Save Question")
                        }
                    }
                }
            }
        }
    }
}
