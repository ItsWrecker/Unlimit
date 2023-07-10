package com.wrecker.remote.repository

import com.wrecker.data.mappers.DataMapper
import com.wrecker.data.model.JokeData
import com.wrecker.data.repository.JokeRemoteSource
import com.wrecker.remote.api.JokeApi
import com.wrecker.remote.model.JokeModel
import javax.inject.Inject

class JokeRemoteDataSource @Inject constructor(
    private val api: JokeApi, private val mapper: DataMapper<JokeData, JokeModel>
) : JokeRemoteSource {

    override suspend fun getJoke(): JokeData? {
        try {
            val response = api.getJoke()
            if (response.isSuccessful && response.code() in 200..300) {
                val data = response.body() ?: return null
                return mapper.mapToEntity(data)
            } else {
                return null
            }
        } catch (exception: Exception) {
            exception.printStackTrace()
            return null
        }
    }
}