package com.wrecker.data.repository

import com.wrecker.data.model.JokeData

interface JokeDataSource {

    suspend fun getJoke(): JokeData
    suspend fun getJokes(): List<JokeData>

    suspend fun updateJoke(joke: JokeData)
}