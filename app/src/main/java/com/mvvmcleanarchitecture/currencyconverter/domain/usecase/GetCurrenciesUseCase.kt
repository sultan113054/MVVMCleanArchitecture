package com.mvvmcleanarchitecture.currencyconverter.domain.usecase

import com.mvvmcleanarchitecture.currencyconverter.core.exception.Failure
import com.mvvmcleanarchitecture.currencyconverter.core.functional.Either
import com.mvvmcleanarchitecture.currencyconverter.core.interactor.BaseUseCase
import com.mvvmcleanarchitecture.currencyconverter.data.model.articles.model.CurrenciesApiResponse
import com.mvvmcleanarchitecture.currencyconverter.data.model.articles.model.LatestRateApiResponse
import com.mvvmcleanarchitecture.currencyconverter.domain.repository.CurrencyConversionRepository
import kotlinx.coroutines.flow.Flow


class GetCurrenciesUseCase(private val x: CurrencyConversionRepository) :
    BaseUseCase<Flow<Either<Failure, List<CurrenciesApiResponse>>>> {

    override suspend fun invoke() =
        x.getCurrencies()

}