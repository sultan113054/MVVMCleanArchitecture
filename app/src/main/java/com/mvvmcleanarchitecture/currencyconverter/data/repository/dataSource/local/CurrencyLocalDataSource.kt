package com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.local

interface CurrencyLocalDataSource {
    suspend fun saveCurrencies()
    suspend fun getSavedCurrencies()
    suspend fun deleteCurrencies()
}