package com.mvvmcleanarchitecture.currencyconverter.presentation.di

import com.mvvmcleanarchitecture.currencyconverter.domain.repository.CurrencyRepository
import com.mvvmcleanarchitecture.currencyconverter.domain.repository.LatestRateRepository
import com.mvvmcleanarchitecture.currencyconverter.domain.usecase.GetCurrenciesUseCase
import com.mvvmcleanarchitecture.currencyconverter.domain.usecase.GetLatestRatesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Singleton
    @Provides
    fun provideCurrenciesUseCase(
        currencyRepository: CurrencyRepository
    ): GetCurrenciesUseCase {
        return GetCurrenciesUseCase(currencyRepository)
    }

    @Singleton
    @Provides
    fun provideLatestRatesUseCase(
        latestRateRepository: LatestRateRepository
    ): GetLatestRatesUseCase {
        return GetLatestRatesUseCase(latestRateRepository)
    }
}


















