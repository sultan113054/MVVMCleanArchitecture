package com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.local

interface LatestRateLocalDataSource {
    suspend fun saveLatestRateData()
    suspend fun getSavedLatestRateByBase()
    suspend fun deleteAllData()
}