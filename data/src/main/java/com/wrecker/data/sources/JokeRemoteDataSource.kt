package com.wrecker.data.sources

import com.wrecker.data.model.JokeData
import com.wrecker.data.repository.JokeDataSource
import com.wrecker.data.repository.JokeRemoteSource
import javax.inject.Inject

class JokeRemoteDataSource @Inject constructor(
    private val remoteDataSource: JokeRemoteSource
) : JokeDataSource{
    override suspend fun getJoke(): List<JokeData> {
        TODO("Not yet implemented")
    }

    override suspend fun updateJoke(joke: JokeData) {
         throw UnsupportedOperationException("Remote support not implemented")
    }
}