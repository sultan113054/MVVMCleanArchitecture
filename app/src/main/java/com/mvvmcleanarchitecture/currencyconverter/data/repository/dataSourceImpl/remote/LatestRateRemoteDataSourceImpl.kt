package com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSourceImpl.remote

import com.mvvmcleanarchitecture.currencyconverter.data.api.CurrencyAPIService
import com.mvvmcleanarchitecture.currencyconverter.data.model.LatestRateResponse
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.remote.LatestRateRemoteDataSource
import retrofit2.Response


class LatestRateRemoteDataSourceImpl(private val currencyAPIService: CurrencyAPIService) :
    LatestRateRemoteDataSource {
    override suspend fun getLatestRatesByBase(base: String): Response<LatestRateResponse> {
        return currencyAPIService.getLatestRatesByBase(base)
    }
}