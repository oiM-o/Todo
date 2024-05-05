package com.github.oimo.apps.todoapp.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy

@Dao
interface TodoDao {
    @Insert
    suspend fun create(todo: Todo)

    /*
    @Delete
    suspend fun delete(todo: Todo)
    */
}