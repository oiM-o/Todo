package com.github.oimo.apps.todoapp.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "todos")
data class Todo (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String = "",
    val description: String,
    val done: Int,
    val createdAt: Long
)