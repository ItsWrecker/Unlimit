package com.wrecker.cache.repository

import com.wrecker.cache.database.JokeDatabase
import com.wrecker.cache.entity.JokeEntity
import com.wrecker.data.mappers.DataMapper
import com.wrecker.data.model.JokeData
import com.wrecker.data.repository.JokeCacheSource
import kotlinx.coroutines.flow.first
import javax.inject.Inject

class JokeCacheDataSourceImpl @Inject constructor(
    private val jokeDatabase: JokeDatabase,
    private val mapper: DataMapper<JokeEntity, JokeData>
) : JokeCacheSource {

    override suspend fun update(joke: JokeData) {
        try {
            val mappedData = mapper.mapToEntity(joke)
            if (isMaxSize()){
                jokeDatabase.jokeDao().deleteJoke()
            }
            jokeDatabase.jokeDao().upsertJoke(mappedData)
        } catch (exception: Exception) {
            exception.printStackTrace()
        }
    }

    override suspend fun getJokes(): List<JokeData> {
        return try {
            val data = jokeDatabase.jokeDao().getJokes().first()
            data.map {
                mapper.mapFromEntity(it)
            }
        }catch (exception: Exception){
            exception.printStackTrace()
            emptyList()
        }
    }


    override suspend fun isMaxSize(): Boolean {
        return jokeDatabase.jokeDao().getJokes().first().size >=10
    }
}