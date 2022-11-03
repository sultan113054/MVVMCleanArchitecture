package com.mvvmcleanarchitecture.currencyconverter.presentation.di

import com.mvvmcleanarchitecture.currencyconverter.presentation.adapter.XAdapter
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
    fun provideXAdapter(): XAdapter {
        return XAdapter()
    }
}