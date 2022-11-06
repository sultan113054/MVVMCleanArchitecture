package com.mvvmcleanarchitecture.currencyconverter.domain.usecase

import com.mvvmcleanarchitecture.currencyconverter.core.exception.Failure
import com.mvvmcleanarchitecture.currencyconverter.core.functional.Either
import com.mvvmcleanarchitecture.currencyconverter.core.interactor.BaseUseCase
import com.mvvmcleanarchitecture.currencyconverter.data.model.LatestRateEntity
import com.mvvmcleanarchitecture.currencyconverter.domain.repository.LatestRateRepository
import kotlinx.coroutines.flow.Flow


class GetLatestRatesUseCase(private val latestRateRepository: LatestRateRepository) :
    BaseUseCase<String, Flow<Either<Failure, LatestRateEntity>>> {

    override suspend fun invoke(value: String): Flow<Either<Failure, LatestRateEntity>> {
        return latestRateRepository.getLatestRatesByBase(value)
    }

}