package com.wrecker.data.mappers

import com.wrecker.data.model.JokeData
import com.wrecker.domain.models.Joke
import javax.inject.Inject

class JokeDataMapper @Inject constructor(

): DataMapper<Joke, JokeData> {

    override fun mapFromEntity(type: Joke): JokeData {
        return JokeData(type.joke)
    }

    override fun mapToEntity(type: JokeData): Joke {
        return Joke(type.joke)
    }
}