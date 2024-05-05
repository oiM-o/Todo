package com.github.oimo.apps.todoapp

import androidx.room.Database
import androidx.room.RoomDatabase
import com.github.oimo.apps.todoapp.model.Todo
import com.github.oimo.apps.todoapp.model.TodoDao

@Database(
    entities = [
        Todo::class,
    ],
    version = 1,
    exportSchema = true,
)
abstract class TodoDatabase: RoomDatabase() {

    abstract fun todoDao(): TodoDao
}