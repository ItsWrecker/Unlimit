package com.wrecker.data.repository

import com.wrecker.data.mappers.DataMapper
import com.wrecker.data.model.JokeData
import com.wrecker.domain.events.Event
import com.wrecker.domain.models.Joke
import com.wrecker.domain.repository.JokeRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class JokeRepositoryImpl @Inject constructor(
    private val remote: JokeRemoteSource,
    private val cache: JokeCacheSource,
    private val mapper: DataMapper<Joke, JokeData>
) : JokeRepository {
    override suspend fun getJokes(): Flow<Event<List<Joke>>> = flow {
        emit(Event.Loading("Loading the jokes."))
        try {
            cache.update(remote.getJoke())
            val data = cache.getJokes()
            return@flow (if (data.isNotEmpty()) emit(Event.Success(data.map {
                mapper.mapToEntity(it)
            })) else emit(Event.Errors("Error while fetching the data"))) as Unit
        } catch (exception: Exception) {
            return@flow emit(Event.Errors(message = exception.message.toString(), exception))
        }
    }.flowOn(Dispatchers.IO)


}