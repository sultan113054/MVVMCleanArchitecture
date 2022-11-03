package com.mvvmcleanarchitecture.currencyconverter.data.api
import com.mvvmcleanarchitecture.currencyconverter.data.model.articles.model.LatestRateApiResponse
import com.mvvmcleanarchitecture.currencyconverter.data.model.articles.model.CurrenciesApiResponse
import retrofit2.Response
import retrofit2.http.GET

interface CurrencyAPIService {

    @GET("latest")
    suspend fun getLatestExchangeRates(): Response<LatestRateApiResponse>

    @GET("currencies.json")
    suspend fun getCurrencies(): Response<CurrenciesApiResponse>

}