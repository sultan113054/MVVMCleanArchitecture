package com.mvvmcleanarchitecture.currencyconverter.presentation.di

import com.mvvmcleanarchitecture.currencyconverter.domain.usecase.GetCurrenciesUseCase
import com.mvvmcleanarchitecture.currencyconverter.presentation.viewmodel.XViewModelFactory
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
    fun provideCarsViewModelFactory(
        getXUseCase: GetCurrenciesUseCase
    ): XViewModelFactory {
        return XViewModelFactory(
            getXUseCase
        )
    }

}








