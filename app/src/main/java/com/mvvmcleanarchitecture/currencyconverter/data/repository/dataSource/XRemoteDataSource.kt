package com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource

import com.mvvmcleanarchitecture.currencyconverter.data.model.articles.model.LatestRateApiResponse
import retrofit2.Response

interface XRemoteDataSource {
    suspend fun getX(): Response<LatestRateApiResponse>
}