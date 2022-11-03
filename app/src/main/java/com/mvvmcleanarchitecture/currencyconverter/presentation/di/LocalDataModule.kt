package com.mvvmcleanarchitecture.currencyconverter.presentation.di

import com.mvvmcleanarchitecture.currencyconverter.data.db.XDAO
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.XLocalDataSource
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSourceImpl.XLocalDataSourceImpl
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
    fun provideLocalDataSource(articleDAO: XDAO): XLocalDataSource {
        return XLocalDataSourceImpl(articleDAO)
    }

}













