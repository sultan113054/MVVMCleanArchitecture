package com.mvvmcleanarchitecture.currencyconverter.domain.repository

import com.mvvmcleanarchitecture.currencyconverter.core.exception.Failure
import com.mvvmcleanarchitecture.currencyconverter.core.functional.Either
import com.mvvmcleanarchitecture.currencyconverter.data.model.articles.model.CurrenciesApiResponse
import com.mvvmcleanarchitecture.currencyconverter.data.model.articles.model.LatestRateApiResponse
import kotlinx.coroutines.flow.Flow


interface CurrencyConversionRepository {
    suspend fun getCurrencies(): Flow<Either<Failure, List<CurrenciesApiResponse>>>
    suspend fun getLatestRatesByBase(): Flow<Either<Failure, List<LatestRateApiResponse>>>
}