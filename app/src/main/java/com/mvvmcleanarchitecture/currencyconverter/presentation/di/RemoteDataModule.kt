package com.mvvmcleanarchitecture.currencyconverter.presentation.di

import android.content.Context
import com.mvvmcleanarchitecture.currencyconverter.data.api.CurrencyAPIService
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.XRemoteDataSource
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSourceImpl.XRemoteDataSourceImpl
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
    fun provideCarsRemoteDataSource(
        carsAPIService: CurrencyAPIService
    ): XRemoteDataSource {
        return XRemoteDataSourceImpl(carsAPIService)
    }

//    @Singleton
//    @Provides
//    fun provideApiCarsMapper(context: Context): ApiArticleMapper {
//       // return ApiArticleMapper(context)
//    }

}












