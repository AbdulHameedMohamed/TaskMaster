package com.example.taskmaster.ui.theme.model.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.taskmaster.ui.theme.util.Constants.TaskTable

@Entity(tableName = TaskTable)
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)