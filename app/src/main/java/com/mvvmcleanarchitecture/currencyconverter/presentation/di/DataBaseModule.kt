package com.mvvmcleanarchitecture.currencyconverter.presentation.di

import android.content.Context
import com.mvvmcleanarchitecture.currencyconverter.data.db.XDAO
import com.mvvmcleanarchitecture.currencyconverter.data.db.AppDatabase
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
    fun provideXDatabase(context: Context): AppDatabase {
        return AppDatabase.getInstance(context)
    }

    @Singleton
    @Provides
    fun provideArticleDao(articleDatabase: AppDatabase): XDAO {
        return articleDatabase.getArticleDAO()
    }


}