package com.example.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.local.UserQuestionData
import com.example.data.model.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuestionsScreen(
    subject: Subject,
    topic: Topic,
    questions: List<Question>,
    userDataMap: Map<String, UserQuestionData>,
    selectedStatusFilter: QuestionProgressStatus?,
    onlyCustom: Boolean = false,
    onStatusFilterChange: (QuestionProgressStatus?) -> Unit,
    onToggleOnlyCustom: () -> Unit = {},
    onSetQuestionStatus: (String, QuestionProgressStatus) -> Unit,
    onSelectQuestion: (Question) -> Unit,
    onToggleBookmark: (String) -> Unit,
    onAddQuestion: () -> Unit = {},
    onBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = modifier.fillMaxSize()
    ) {
        item {
            // Header with Back Navigation & Add Question Button
            Card(
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.weight(1f)
                        ) {
                            IconButton(
                                onClick = onBack,
                                modifier = Modifier.size(36.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                    contentDescription = "Back to Topics"
                                )
                            }
                            Spacer(modifier = Modifier.width(6.dp))
                            Column {
                                Text(
                                    text = topic.name,
                                    fontSize = 17.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                                Text(
                                    text = "${subject.name} • ${questions.size} Questions",
                                    fontSize = 12.sp,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }
                        }

                        // Add Question action button
                        FilledTonalButton(
                            onClick = onAddQuestion,
                            contentPadding = PaddingValues(horizontal = 10.dp, vertical = 4.dp),
                            modifier = Modifier.height(34.dp).testTag("header_add_question_button")
                        ) {
                            Icon(Icons.Default.Add, contentDescription = null, modifier = Modifier.size(16.dp))
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Add Question", fontSize = 12.sp, fontWeight = FontWeight.SemiBold)
                        }
                    }

                    Spacer(modifier = Modifier.height(8.dp))
                    Surface(
                        color = MaterialTheme.colorScheme.surface,
                        shape = RoundedCornerShape(6.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.MenuBook,
                                contentDescription = null,
                                tint = MaterialTheme.colorScheme.primary,
                                modifier = Modifier.size(14.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = "Standard Ref: ${topic.textbookChapter} (${topic.standardPages})",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Medium,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                }
            }
        }

        // Status Filter Chips Row + Custom Questions Toggle
        item {
            Row(
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState())
            ) {
                FilterChip(
                    selected = selectedStatusFilter == null && !onlyCustom,
                    onClick = {
                        onStatusFilterChange(null)
                    },
                    label = { Text("All (${questions.size})", fontSize = 11.sp) }
                )
                FilterChip(
                    selected = onlyCustom,
                    onClick = onToggleOnlyCustom,
                    label = { Text("★ Custom Added", fontSize = 11.sp) },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.PostAdd,
                            contentDescription = null,
                            modifier = Modifier.size(14.dp)
                        )
                    },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = MaterialTheme.colorScheme.tertiaryContainer,
                        selectedLabelColor = MaterialTheme.colorScheme.onTertiaryContainer
                    )
                )
                FilterChip(
                    selected = selectedStatusFilter == QuestionProgressStatus.CORRECT,
                    onClick = {
                        onStatusFilterChange(
                            if (selectedStatusFilter == QuestionProgressStatus.CORRECT) null else QuestionProgressStatus.CORRECT
                        )
                    },
                    label = { Text("✓ Correct", fontSize = 11.sp) },
                    leadingIcon = {
                        Box(
                            modifier = Modifier
                                .size(8.dp)
                                .clip(CircleShape)
                                .background(Color(0xFF2E7D32))
                        )
                    }
                )
                FilterChip(
                    selected = selectedStatusFilter == QuestionProgressStatus.INCORRECT,
                    onClick = {
                        onStatusFilterChange(
                            if (selectedStatusFilter == QuestionProgressStatus.INCORRECT) null else QuestionProgressStatus.INCORRECT
                        )
                    },
                    label = { Text("✗ Incorrect", fontSize = 11.sp) },
                    leadingIcon = {
                        Box(
                            modifier = Modifier
                                .size(8.dp)
                                .clip(CircleShape)
                                .background(Color(0xFFD32F2F))
                        )
                    }
                )
                FilterChip(
                    selected = selectedStatusFilter == QuestionProgressStatus.ATTEMPTED,
                    onClick = {
                        onStatusFilterChange(
                            if (selectedStatusFilter == QuestionProgressStatus.ATTEMPTED) null else QuestionProgressStatus.ATTEMPTED
                        )
                    },
                    label = { Text("✎ Attempted", fontSize = 11.sp) },
                    leadingIcon = {
                        Box(
                            modifier = Modifier
                                .size(8.dp)
                                .clip(CircleShape)
                                .background(Color(0xFF0288D1))
                        )
                    }
                )
                FilterChip(
                    selected = selectedStatusFilter == QuestionProgressStatus.UNATTEMPTED,
                    onClick = {
                        onStatusFilterChange(
                            if (selectedStatusFilter == QuestionProgressStatus.UNATTEMPTED) null else QuestionProgressStatus.UNATTEMPTED
                        )
                    },
                    label = { Text("Unattempted", fontSize = 11.sp) }
                )
            }
        }

        if (questions.isEmpty()) {
            item {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(32.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Quiz,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.size(44.dp)
                    )
                    Text(
                        text = "No questions found matching selected filter.",
                        fontSize = 13.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    FilledTonalButton(
                        onClick = onAddQuestion,
                        modifier = Modifier.testTag("empty_state_add_question_button")
                    ) {
                        Icon(Icons.Default.Add, contentDescription = null, modifier = Modifier.size(16.dp))
                        Spacer(modifier = Modifier.width(6.dp))
                        Text("Add Custom Question")
                    }
                }
            }
        }

        items(questions) { question ->
            val userData = userDataMap[question.id]
            val currentStatus = QuestionProgressStatus.fromId(userData?.status)
            val isBookmarked = userData?.isBookmarked == true

            Card(
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        1.dp,
                        when (currentStatus) {
                            QuestionProgressStatus.CORRECT -> Color(0xFF2E7D32).copy(alpha = 0.5f)
                            QuestionProgressStatus.INCORRECT -> Color(0xFFD32F2F).copy(alpha = 0.5f)
                            QuestionProgressStatus.ATTEMPTED -> Color(0xFF0288D1).copy(alpha = 0.5f)
                            QuestionProgressStatus.UNATTEMPTED -> MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f)
                        },
                        RoundedCornerShape(12.dp)
                    )
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    // Top Row: Status badge, Question Type, Bookmark
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            // Status Badge
                            Surface(
                                color = Color(currentStatus.colorHex).copy(alpha = 0.15f),
                                shape = RoundedCornerShape(4.dp),
                                border = BorderStroke(1.dp, Color(currentStatus.colorHex).copy(alpha = 0.4f))
                            ) {
                                Text(
                                    text = currentStatus.displayName,
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(currentStatus.colorHex),
                                    modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                )
                            }

                            // Question Type
                            Surface(
                                color = Color(question.type.badgeColor).copy(alpha = 0.12f),
                                shape = RoundedCornerShape(4.dp)
                            ) {
                                Text(
                                    text = question.type.displayName,
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color(question.type.badgeColor),
                                    modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                )
                            }

                            // Marks
                            Text(
                                text = question.marksBreakdown,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.primary
                            )

                            if (question.isCustom) {
                                Surface(
                                    color = MaterialTheme.colorScheme.tertiaryContainer,
                                    shape = RoundedCornerShape(4.dp)
                                ) {
                                    Text(
                                        text = "Custom",
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = MaterialTheme.colorScheme.onTertiaryContainer,
                                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                    )
                                }
                            }
                        }

                        IconButton(
                            onClick = { onToggleBookmark(question.id) },
                            modifier = Modifier.size(28.dp)
                        ) {
                            Icon(
                                imageVector = if (isBookmarked) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
                                contentDescription = "Bookmark",
                                tint = if (isBookmarked) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurfaceVariant,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    // Question Text
                    Text(
                        text = question.text,
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        fontWeight = FontWeight.Medium,
                        color = MaterialTheme.colorScheme.onSurface
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    // University Years & Textbook Citation
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "Exam Years: ${question.years.joinToString(", ")}",
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Medium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )

                        Text(
                            text = "${question.textbookRef} pp. ${question.pageNumbers}",
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.secondary
                        )
                    }

                    Spacer(modifier = Modifier.height(12.dp))
                    HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.3f))
                    Spacer(modifier = Modifier.height(8.dp))

                    // Action Controls: Mark Status & AI Solver
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        // Mark Status Buttons
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Mark as:",
                                fontSize = 10.sp,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )

                            // Correct button
                            OutlinedButton(
                                onClick = {
                                    val next = if (currentStatus == QuestionProgressStatus.CORRECT) QuestionProgressStatus.UNATTEMPTED else QuestionProgressStatus.CORRECT
                                    onSetQuestionStatus(question.id, next)
                                },
                                contentPadding = PaddingValues(horizontal = 6.dp, vertical = 2.dp),
                                modifier = Modifier.height(26.dp),
                                colors = ButtonDefaults.outlinedButtonColors(
                                    containerColor = if (currentStatus == QuestionProgressStatus.CORRECT) Color(0xFF2E7D32).copy(alpha = 0.15f) else Color.Transparent
                                ),
                                border = BorderStroke(1.dp, if (currentStatus == QuestionProgressStatus.CORRECT) Color(0xFF2E7D32) else MaterialTheme.colorScheme.outlineVariant)
                            ) {
                                Text("✓ Correct", fontSize = 9.sp, fontWeight = FontWeight.Bold, color = Color(0xFF2E7D32))
                            }

                            // Incorrect button
                            OutlinedButton(
                                onClick = {
                                    val next = if (currentStatus == QuestionProgressStatus.INCORRECT) QuestionProgressStatus.UNATTEMPTED else QuestionProgressStatus.INCORRECT
                                    onSetQuestionStatus(question.id, next)
                                },
                                contentPadding = PaddingValues(horizontal = 6.dp, vertical = 2.dp),
                                modifier = Modifier.height(26.dp),
                                colors = ButtonDefaults.outlinedButtonColors(
                                    containerColor = if (currentStatus == QuestionProgressStatus.INCORRECT) Color(0xFFD32F2F).copy(alpha = 0.15f) else Color.Transparent
                                ),
                                border = BorderStroke(1.dp, if (currentStatus == QuestionProgressStatus.INCORRECT) Color(0xFFD32F2F) else MaterialTheme.colorScheme.outlineVariant)
                            ) {
                                Text("✗ Incorrect", fontSize = 9.sp, fontWeight = FontWeight.Bold, color = Color(0xFFD32F2F))
                            }

                            // Attempted button
                            OutlinedButton(
                                onClick = {
                                    val next = if (currentStatus == QuestionProgressStatus.ATTEMPTED) QuestionProgressStatus.UNATTEMPTED else QuestionProgressStatus.ATTEMPTED
                                    onSetQuestionStatus(question.id, next)
                                },
                                contentPadding = PaddingValues(horizontal = 6.dp, vertical = 2.dp),
                                modifier = Modifier.height(26.dp),
                                colors = ButtonDefaults.outlinedButtonColors(
                                    containerColor = if (currentStatus == QuestionProgressStatus.ATTEMPTED) Color(0xFF0288D1).copy(alpha = 0.15f) else Color.Transparent
                                ),
                                border = BorderStroke(1.dp, if (currentStatus == QuestionProgressStatus.ATTEMPTED) Color(0xFF0288D1) else MaterialTheme.colorScheme.outlineVariant)
                            ) {
                                Text("✎ Attempted", fontSize = 9.sp, fontWeight = FontWeight.Bold, color = Color(0xFF0288D1))
                            }
                        }

                        // AI Problem Solver Button
                        FilledTonalButton(
                            onClick = { onSelectQuestion(question) },
                            contentPadding = PaddingValues(horizontal = 10.dp, vertical = 4.dp),
                            modifier = Modifier.height(28.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.AutoAwesome,
                                contentDescription = null,
                                modifier = Modifier.size(13.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Solve with AI", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
        }
    }
}
