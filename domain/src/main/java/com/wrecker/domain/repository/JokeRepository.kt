package com.wrecker.domain.repository

import com.wrecker.domain.events.Event
import com.wrecker.domain.models.Joke
import kotlinx.coroutines.flow.Flow

interface JokeRepository {
    suspend fun getJokes(): Flow<Event<List<Joke>>>
}