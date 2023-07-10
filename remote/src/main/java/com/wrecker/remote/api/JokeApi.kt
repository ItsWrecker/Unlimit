package com.wrecker.remote.api

import com.wrecker.remote.model.JokeModel
import retrofit2.Response
import retrofit2.http.GET

interface JokeApi {

    @GET("/api?format=json")
    suspend fun getJoke():Response<JokeModel>
}