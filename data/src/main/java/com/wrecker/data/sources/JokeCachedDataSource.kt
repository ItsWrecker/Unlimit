package com.wrecker.data.sources

import com.wrecker.data.model.JokeData
import com.wrecker.data.repository.JokeCacheSource
import com.wrecker.data.repository.JokeDataSource
import javax.inject.Inject

class JokeCachedDataSource @Inject constructor(
    private val jokeCachedSource: JokeCacheSource
) : JokeDataSource {
    override suspend fun getJoke(): JokeData {
        throw UnsupportedOperationException("Not supported")
    }

    override suspend fun getJokes(): List<JokeData> {
        return jokeCachedSource.getJokes()
    }

    override suspend fun updateJoke(joke: JokeData) {
        return jokeCachedSource.update(joke)
    }
}