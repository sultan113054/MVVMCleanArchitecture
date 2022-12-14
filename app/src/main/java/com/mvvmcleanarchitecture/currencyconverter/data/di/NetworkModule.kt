package com.mvvmcleanarchitecture.currencyconverter.data.di

import com.mvvmcleanarchitecture.currencyconverter.BuildConfig
import com.mvvmcleanarchitecture.currencyconverter.data.api.CurrencyAPIService
import com.mvvmcleanarchitecture.currencyconverter.data.util.ResultCallAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {
    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(ResultCallAdapterFactory())
            .baseUrl(BuildConfig.BASE_URL)
            .client(
                OkHttpClient.Builder().apply {
                    this.addInterceptor(HttpLoggingInterceptor().apply {
                        this.level = HttpLoggingInterceptor.Level.BODY
                    })
                        .connectTimeout(30, TimeUnit.SECONDS)
                        .readTimeout(30, TimeUnit.SECONDS)
                        .writeTimeout(30, TimeUnit.SECONDS)
                }.addInterceptor { chain ->
                    val url = chain
                        .request()
                        .url
                        .newBuilder()
                        .addQueryParameter("key", BuildConfig.APP_ID)
                        .build()
                    chain.proceed(chain.request().newBuilder().url(url).build())
                }.build()
            )

            .build()
    }

    @Singleton
    @Provides
    fun provideCurrencyAPIService(retrofit: Retrofit): CurrencyAPIService {
        return retrofit.create(CurrencyAPIService::class.java)
    }

}













