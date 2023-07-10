package com.wrecker.data.repository

import com.wrecker.data.model.JokeData

interface JokeRemoteSource {
    suspend fun getJoke(): JokeData?
}