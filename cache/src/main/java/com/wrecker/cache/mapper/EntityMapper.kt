package com.wrecker.cache.mapper

import com.wrecker.cache.entity.JokeEntity
import com.wrecker.data.mappers.DataMapper
import com.wrecker.data.model.JokeData
import javax.inject.Inject

class EntityMapper @Inject constructor(
    ): DataMapper<JokeEntity, JokeData> {

    override fun mapFromEntity(type: JokeEntity): JokeData {
        return JokeData(type.joke)
    }

    override fun mapToEntity(type: JokeData): JokeEntity {
        return JokeEntity(joke = type.joke)
    }
}