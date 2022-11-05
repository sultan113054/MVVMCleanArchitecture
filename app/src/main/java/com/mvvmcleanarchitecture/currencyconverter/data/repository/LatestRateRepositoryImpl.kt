package com.mvvmcleanarchitecture.currencyconverter.data.repository

import com.mvvmcleanarchitecture.currencyconverter.core.exception.Failure
import com.mvvmcleanarchitecture.currencyconverter.core.functional.Either
import com.mvvmcleanarchitecture.currencyconverter.core.platform.NetworkHandler
import com.mvvmcleanarchitecture.currencyconverter.data.model.LatestRateEntity
import com.mvvmcleanarchitecture.currencyconverter.data.model.LatestRateResponse
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.local.LatestRateLocalDataSource
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.remote.LatestRateRemoteDataSource
import com.mvvmcleanarchitecture.currencyconverter.domain.repository.LatestRateRepository
import kotlinx.coroutines.flow.Flow

class LatestRateRepositoryImpl(
    private val latestRateRemoteDataSource: LatestRateRemoteDataSource,
    private val latestRateLocalDataSource: LatestRateLocalDataSource,
    private val networkHandler: NetworkHandler
) : LatestRateRepository {
    override suspend fun getLatestRatesByBase(base: String): Flow<Either<Failure, LatestRateEntity>> {
        TODO("Not yet implemented")
    }


}