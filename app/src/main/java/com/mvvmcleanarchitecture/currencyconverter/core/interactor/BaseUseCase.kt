package com.mvvmcleanarchitecture.currencyconverter.core.interactor

interface BaseUseCase<out Result> {
    suspend operator fun invoke(): Result
}
