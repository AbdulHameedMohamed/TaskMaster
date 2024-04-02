package com.example.taskmaster.model.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.taskmaster.util.Constants.TaskTable

@Entity(tableName = TaskTable)
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)