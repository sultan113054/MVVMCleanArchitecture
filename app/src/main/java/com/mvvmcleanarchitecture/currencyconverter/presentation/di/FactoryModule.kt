package com.mvvmcleanarchitecture.currencyconverter.presentation.di

import com.mvvmcleanarchitecture.currencyconverter.domain.usecase.GetCurrenciesUseCase
import com.mvvmcleanarchitecture.currencyconverter.domain.usecase.GetLatestRatesUseCase
import com.mvvmcleanarchitecture.currencyconverter.presentation.viewmodel.CurrencyConversionViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {
    @Singleton
    @Provides
    fun provideCurrencyConversionViewModelFactory(
        getCurrenciesUseCase: GetCurrenciesUseCase,
        getLatestRatesUseCase: GetLatestRatesUseCase
    ): CurrencyConversionViewModelFactory {
        return CurrencyConversionViewModelFactory(
            getCurrenciesUseCase, getLatestRatesUseCase
        )
    }

}








