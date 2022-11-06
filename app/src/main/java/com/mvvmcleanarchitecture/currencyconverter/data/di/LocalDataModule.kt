package com.mvvmcleanarchitecture.currencyconverter.data.di

import com.mvvmcleanarchitecture.currencyconverter.data.db.dao.CurrencyDAO
import com.mvvmcleanarchitecture.currencyconverter.data.db.dao.LatestRateDAO
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.local.CurrencyLocalDataSource
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.local.LatestRateLocalDataSource
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSourceImpl.local.CurrencyLocalDataSourceImpl
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSourceImpl.local.LatestRateLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {
    @Singleton
    @Provides
    fun provideCurrencyLocalDataSource(currencyDAO: CurrencyDAO): CurrencyLocalDataSource {
        return CurrencyLocalDataSourceImpl(currencyDAO)
    }

    @Singleton
    @Provides
    fun provideLatestRateLocalDataSource(latestRateDAO: LatestRateDAO): LatestRateLocalDataSource {
        return LatestRateLocalDataSourceImpl(latestRateDAO)
    }

}













