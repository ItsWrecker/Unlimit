package com.wrecker.domain.interacters

abstract class BaseUseCase<in Prams, out Result> {

    abstract suspend operator fun invoke(params: Prams): Result
}