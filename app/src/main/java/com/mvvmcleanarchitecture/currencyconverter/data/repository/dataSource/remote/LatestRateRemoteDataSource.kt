package com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.remote

import com.mvvmcleanarchitecture.currencyconverter.data.model.LatestRateResponse
import retrofit2.Response

interface LatestRateRemoteDataSource {
    suspend fun getLatestRatesByBase(base:String): Response<LatestRateResponse>
}