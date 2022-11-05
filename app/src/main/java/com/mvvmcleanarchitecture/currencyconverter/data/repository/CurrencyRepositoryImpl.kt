package com.mvvmcleanarchitecture.currencyconverter.data.repository

import com.mvvmcleanarchitecture.currencyconverter.core.exception.Failure
import com.mvvmcleanarchitecture.currencyconverter.core.functional.Either
import com.mvvmcleanarchitecture.currencyconverter.core.platform.NetworkHandler
import com.mvvmcleanarchitecture.currencyconverter.data.model.CurrencyEntity
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.local.CurrencyLocalDataSource
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.remote.CurrencyRemoteDataSource
import com.mvvmcleanarchitecture.currencyconverter.domain.repository.CurrencyRepository
import kotlinx.coroutines.flow.Flow

class CurrencyRepositoryImpl(
    private val currencyRemoteDataSource: CurrencyRemoteDataSource,
    private val currencyLocalDataSource: CurrencyLocalDataSource,
    private val networkHandler: NetworkHandler
) : CurrencyRepository {
    override suspend fun getCurrencies(): Flow<Either<Failure, CurrencyEntity>> {
        TODO("Not yet implemented")
    }

}