package com.example.taskmaster.model.data

import androidx.compose.ui.graphics.Color
import com.example.taskmaster.ui.theme.HighPriorityColor
import com.example.taskmaster.ui.theme.LowPriorityColor
import com.example.taskmaster.ui.theme.MediumPriorityColor
import com.example.taskmaster.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}