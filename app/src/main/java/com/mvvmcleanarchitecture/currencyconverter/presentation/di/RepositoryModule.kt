package com.mvvmcleanarchitecture.currencyconverter.presentation.di

import com.mvvmcleanarchitecture.currencyconverter.core.platform.NetworkHandler
import com.mvvmcleanarchitecture.currencyconverter.data.repository.XRepositoryImpl
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.XLocalDataSource
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.XRemoteDataSource
import com.mvvmcleanarchitecture.currencyconverter.domain.repository.CurrencyConversionRepository
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
    fun provideCarsRepository(
        carsRemoteDataSource: XRemoteDataSource, xLocalDataSource: XLocalDataSource,
        networkHandler: NetworkHandler,
    ): CurrencyConversionRepository {
        return XRepositoryImpl(
            carsRemoteDataSource,
            xLocalDataSource,
           // apiCarsMapper,
            networkHandler
        )
    }

}














