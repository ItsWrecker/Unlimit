package com.wrecker.data.mappers

interface DataMapper<E, D> {

    fun mapFromEntity(type: E): D

    fun mapToEntity(type:D): E
}