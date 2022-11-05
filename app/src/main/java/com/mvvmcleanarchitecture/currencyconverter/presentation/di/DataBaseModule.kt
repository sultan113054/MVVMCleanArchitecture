package com.mvvmcleanarchitecture.currencyconverter.presentation.di

import android.content.Context
import com.mvvmcleanarchitecture.currencyconverter.data.db.dao.CurrencyDAO
import com.mvvmcleanarchitecture.currencyconverter.data.db.CurrencyDatabase
import com.mvvmcleanarchitecture.currencyconverter.data.db.dao.LatestRateDAO
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataBaseModule {
    @Singleton
    @Provides
    fun provideCurrencyDatabase(context: Context): CurrencyDatabase {
        return CurrencyDatabase.getInstance(context)
    }

    @Singleton
    @Provides
    fun provideCurrencyDao(currencyDatabase: CurrencyDatabase): CurrencyDAO {
        return currencyDatabase.getCurrencyDAO()
    }

    @Singleton
    @Provides
    fun provideLatestRateDao(articleDatabase: CurrencyDatabase): LatestRateDAO {
        return articleDatabase.getLatestRateDAO()
    }

}