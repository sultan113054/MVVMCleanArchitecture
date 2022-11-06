package com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.local

import com.mvvmcleanarchitecture.currencyconverter.data.model.CurrencyEntity
import kotlinx.coroutines.flow.Flow

interface CurrencyLocalDataSource {
    suspend fun saveCurrencies(currencyEntity: CurrencyEntity):Flow<CurrencyEntity>
    suspend fun getSavedCurrencies(): Flow<CurrencyEntity>
    suspend fun deleteCurrencies()
}