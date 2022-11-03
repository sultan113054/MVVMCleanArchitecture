package com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSourceImpl

import com.mvvmcleanarchitecture.currencyconverter.data.api.CurrencyAPIService
import com.mvvmcleanarchitecture.currencyconverter.data.model.articles.model.LatestRateApiResponse
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.XRemoteDataSource
import retrofit2.Response


class XRemoteDataSourceImpl(private val x: CurrencyAPIService) :
    XRemoteDataSource {
    override suspend fun getX(): Response<LatestRateApiResponse> {
        return x.getLatestExchangeRates()
    }
}