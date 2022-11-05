package com.mvvmcleanarchitecture.currencyconverter.presentation.di

import com.mvvmcleanarchitecture.currencyconverter.data.api.CurrencyAPIService
import com.mvvmcleanarchitecture.currencyconverter.data.repository.LatestRateRepositoryImpl
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.remote.CurrencyRemoteDataSource
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.remote.LatestRateRemoteDataSource
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSourceImpl.remote.CurrencyRemoteDataSourceImpl
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSourceImpl.remote.LatestRateRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideCurrencyRemoteDataSource(
        currencyAPIService: CurrencyAPIService
    ): CurrencyRemoteDataSource {
        return CurrencyRemoteDataSourceImpl(currencyAPIService)
    }

    @Singleton
    @Provides
    fun provideLatestRateRemoteDataSource(
        currencyAPIService: CurrencyAPIService
    ): LatestRateRemoteDataSource {
        return LatestRateRemoteDataSourceImpl(currencyAPIService)
    }

}












