package com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSourceImpl.remote

import com.google.gson.JsonObject
import com.mvvmcleanarchitecture.currencyconverter.data.api.CurrencyAPIService
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.remote.CurrencyRemoteDataSource
import retrofit2.Response


class CurrencyRemoteDataSourceImpl(private val currencyAPIService: CurrencyAPIService) :
    CurrencyRemoteDataSource {
    override suspend fun getCurrencies(): Response<JsonObject> {
        return currencyAPIService.getCurrencies()
    }
}