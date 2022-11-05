package com.mvvmcleanarchitecture.currencyconverter.domain.usecase

import com.mvvmcleanarchitecture.currencyconverter.core.exception.Failure
import com.mvvmcleanarchitecture.currencyconverter.core.functional.Either
import com.mvvmcleanarchitecture.currencyconverter.core.interactor.BaseUseCase
import com.mvvmcleanarchitecture.currencyconverter.data.model.CurrencyEntity
import com.mvvmcleanarchitecture.currencyconverter.domain.repository.CurrencyRepository
import kotlinx.coroutines.flow.Flow


class GetCurrenciesUseCase(private val currencyRepository: CurrencyRepository) :
    BaseUseCase<Any, Flow<Either<Failure, CurrencyEntity>>> {

    override suspend fun invoke(value: Any): Flow<Either<Failure, CurrencyEntity>> {
        return currencyRepository.getCurrencies()
    }

}