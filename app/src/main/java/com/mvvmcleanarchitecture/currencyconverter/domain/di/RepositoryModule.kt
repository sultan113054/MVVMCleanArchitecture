package com.mvvmcleanarchitecture.currencyconverter.domain.di

import com.mvvmcleanarchitecture.currencyconverter.core.platform.NetworkHandler
import com.mvvmcleanarchitecture.currencyconverter.data.repository.CurrencyRepositoryImpl
import com.mvvmcleanarchitecture.currencyconverter.data.repository.LatestRateRepositoryImpl
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.local.CurrencyLocalDataSource
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.local.LatestRateLocalDataSource
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.remote.CurrencyRemoteDataSource
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.remote.LatestRateRemoteDataSource
import com.mvvmcleanarchitecture.currencyconverter.domain.repository.CurrencyRepository
import com.mvvmcleanarchitecture.currencyconverter.domain.repository.LatestRateRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Singleton
    @Provides
    fun provideCurrencyRepository(
        currencyRemoteDataSource: CurrencyRemoteDataSource,
        currencyLocalDataSource: CurrencyLocalDataSource,
        networkHandler: NetworkHandler,
    ): CurrencyRepository {
        return CurrencyRepositoryImpl(
            currencyRemoteDataSource,
            currencyLocalDataSource,
            networkHandler
        )
    }

    @Singleton
    @Provides
    fun provideLatestRateRepository(
        latestRateRemoteDataSource: LatestRateRemoteDataSource,
        latestRateLocalDataSource: LatestRateLocalDataSource, networkHandler: NetworkHandler,
    ): LatestRateRepository {
        return LatestRateRepositoryImpl(
            latestRateRemoteDataSource,
            latestRateLocalDataSource,
            networkHandler
        )
    }

}














