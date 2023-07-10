package com.wrecker.remote.mapper

import com.wrecker.data.mappers.DataMapper
import com.wrecker.data.model.JokeData
import com.wrecker.remote.model.JokeModel
import javax.inject.Inject

class ModelMapper @Inject constructor(

) : DataMapper<JokeData, JokeModel> {
    override fun mapFromEntity(type: JokeData): JokeModel {
        return JokeModel(type.joke)
    }

    override fun mapToEntity(type: JokeModel): JokeData {
        return JokeData(type.joke)
    }

}