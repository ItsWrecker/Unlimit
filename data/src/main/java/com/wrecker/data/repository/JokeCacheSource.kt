package com.wrecker.data.repository

import com.wrecker.data.model.JokeData

interface JokeCacheSource {
    suspend fun getJokes(): List<JokeData>
    suspend fun update(joke: JokeData)
    suspend fun isMaxSize(): Boolean
}