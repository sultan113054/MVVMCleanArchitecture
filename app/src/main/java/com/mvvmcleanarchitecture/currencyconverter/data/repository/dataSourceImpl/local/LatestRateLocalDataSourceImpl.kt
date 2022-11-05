package com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSourceImpl.local

import com.mvvmcleanarchitecture.currencyconverter.data.db.dao.CurrencyDAO
import com.mvvmcleanarchitecture.currencyconverter.data.db.dao.LatestRateDAO
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.local.LatestRateLocalDataSource

class LatestRateLocalDataSourceImpl(
    private val latestRateDAO: LatestRateDAO
) : LatestRateLocalDataSource {
    override suspend fun saveLatestRateData() {
        TODO("Not yet implemented")
    }

    override suspend fun getSavedLatestRateByBase() {
        TODO("Not yet implemented")
    }

    override suspend fun deleteAllData() {
        TODO("Not yet implemented")
    }


}