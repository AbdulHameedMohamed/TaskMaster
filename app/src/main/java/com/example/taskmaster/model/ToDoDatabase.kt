package com.example.taskmaster.model

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.taskmaster.model.data.Task

@Database(entities = [Task::class], version = 1, exportSchema = false)
abstract class ToDoDatabase: RoomDatabase() {
    abstract fun toDoDao(): ToDoDao

}