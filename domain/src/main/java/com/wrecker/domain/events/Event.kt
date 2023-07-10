package com.wrecker.domain.events

sealed interface Event<out R> {
    data class Loading(val message: String): Event<Nothing>
    data class Errors(val message: String, val cause: Exception?=null): Event<Nothing>
    data class Success<R>(val data: R): Event<R>
}