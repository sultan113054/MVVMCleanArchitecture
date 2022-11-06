package com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSourceImpl.local

import com.mvvmcleanarchitecture.currencyconverter.data.db.dao.CurrencyDAO
import com.mvvmcleanarchitecture.currencyconverter.data.model.CurrencyEntity
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.local.CurrencyLocalDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class CurrencyLocalDataSourceImpl(
    private val currencyDAO: CurrencyDAO,
) : CurrencyLocalDataSource {
    override suspend fun saveCurrencies(currencyEntity: CurrencyEntity) {
        currencyDAO.insertCurrencies(currencyEntity)
    }

    override suspend fun getSavedCurrencies(): Flow<CurrencyEntity> {
        return currencyDAO.getCurrencies()
    }

    override suspend fun deleteCurrencies() {
        currencyDAO.deleteAllData()
    }

}