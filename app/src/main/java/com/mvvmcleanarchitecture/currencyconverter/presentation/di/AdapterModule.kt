package com.mvvmcleanarchitecture.currencyconverter.presentation.di

import com.mvvmcleanarchitecture.currencyconverter.presentation.adapter.CurrencyConversionListAdapter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AdapterModule {
    @Singleton
    @Provides
    fun provideCurrencyConversionListAdapter(): CurrencyConversionListAdapter {
        return CurrencyConversionListAdapter()
    }
}