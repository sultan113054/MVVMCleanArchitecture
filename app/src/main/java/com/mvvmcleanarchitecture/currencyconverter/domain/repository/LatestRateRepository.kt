package com.mvvmcleanarchitecture.currencyconverter.domain.repository

import com.mvvmcleanarchitecture.currencyconverter.core.exception.Failure
import com.mvvmcleanarchitecture.currencyconverter.core.functional.Either
import com.mvvmcleanarchitecture.currencyconverter.data.model.LatestRateEntity
import com.mvvmcleanarchitecture.currencyconverter.data.model.LatestRateResponse
import kotlinx.coroutines.flow.Flow


interface LatestRateRepository {
    suspend fun getLatestRatesByBase(base: String): Flow<Either<Failure, LatestRateEntity>>

}