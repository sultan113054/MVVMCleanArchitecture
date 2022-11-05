package com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.remote

import com.google.gson.JsonObject
import retrofit2.Response

interface CurrencyRemoteDataSource {
    suspend fun getCurrencies(): Response<JsonObject>
}