package com.mvvmcleanarchitecture.currencyconverter.presentation.di

import com.mvvmcleanarchitecture.currencyconverter.domain.repository.CurrencyConversionRepository
import com.mvvmcleanarchitecture.currencyconverter.domain.usecase.GetCurrenciesUseCase
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
    fun provideCarssUseCase(
        xRepository: CurrencyConversionRepository
    ): GetCurrenciesUseCase {
        return GetCurrenciesUseCase(xRepository)
    }
}


















