package com.mvvmcleanarchitecture.currencyconverter.data.api

import com.google.gson.JsonObject
import com.mvvmcleanarchitecture.currencyconverter.data.model.LatestRateResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyAPIService {

    @GET("latest.json")
    suspend fun getLatestRatesByBase(@Query("base") base: String): Response<LatestRateResponse>

    @GET("currencies.json")
    suspend fun getCurrencies(): Response<JsonObject>

}