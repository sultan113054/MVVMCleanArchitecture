package com.mvvmcleanarchitecture.currencyconverter.core.interactor

interface BaseUseCase<in T, out Result> {
    suspend operator fun invoke(value: T): Result
}
