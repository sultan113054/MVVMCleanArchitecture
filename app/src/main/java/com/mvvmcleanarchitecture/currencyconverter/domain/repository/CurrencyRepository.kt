package com.mvvmcleanarchitecture.currencyconverter.domain.repository

import com.mvvmcleanarchitecture.currencyconverter.core.exception.Failure
import com.mvvmcleanarchitecture.currencyconverter.core.functional.Either
import com.mvvmcleanarchitecture.currencyconverter.data.model.CurrencyEntity
import kotlinx.coroutines.flow.Flow


interface CurrencyRepository {
    suspend fun getCurrencies(updateFromRemote: Boolean): Flow<Either<Failure, CurrencyEntity>>
}