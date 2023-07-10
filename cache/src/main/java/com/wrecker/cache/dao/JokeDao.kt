package com.wrecker.cache.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.wrecker.cache.entity.JokeEntity
import com.wrecker.domain.models.Joke
import kotlinx.coroutines.flow.Flow

@Dao
interface JokeDao {

    @Upsert
    suspend fun upsertJoke(joke: JokeEntity)

    @Query("SELECT * FROM JokeEntity ORDER BY id ASC")
    suspend fun getJokes(): Flow<List<JokeEntity>>

    @Query("DELETE FROM JokeEntity WHERE id")
    fun deleteJoke()
}