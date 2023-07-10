package com.wrecker.cache.database

import androidx.room.Database
import com.wrecker.cache.dao.JokeDao
import com.wrecker.cache.entity.JokeEntity

@Database(
    entities = [JokeEntity::class],
    exportSchema = false,
    version = 1
)
abstract class JokeDatabase {

    abstract fun jokeDao(): JokeDao
}