package com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSourceImpl.local

import com.mvvmcleanarchitecture.currencyconverter.data.db.dao.CurrencyDAO
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.local.CurrencyLocalDataSource

class CurrencyLocalDataSourceImpl(
    private val articleDAO: CurrencyDAO
) : CurrencyLocalDataSource {
    override suspend fun saveCurrencies() {
        TODO("Not yet implemented")
    }

    override suspend fun getSavedCurrencies() {
        TODO("Not yet implemented")
    }

    override suspend fun deleteCurrencies() {
        TODO("Not yet implemented")
    }

}