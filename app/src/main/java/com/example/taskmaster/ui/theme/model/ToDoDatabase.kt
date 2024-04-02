package com.example.taskmaster.ui.theme.model

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.taskmaster.ui.theme.model.data.Task

@Database(entities = [Task::class], version = 1, exportSchema = false)
abstract class ToDoDatabase: RoomDatabase() {
    abstract fun toDoDao(): ToDoDao

}