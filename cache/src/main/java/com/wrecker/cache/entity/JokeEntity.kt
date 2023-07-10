package com.wrecker.cache.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class JokeEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int?=null,
    val joke: String
)