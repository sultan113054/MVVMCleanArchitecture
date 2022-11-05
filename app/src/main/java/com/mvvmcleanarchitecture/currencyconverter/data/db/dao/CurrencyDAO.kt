package com.mvvmcleanarchitecture.currencyconverter.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mvvmcleanarchitecture.currencyconverter.data.model.CurrencyEntity

@Dao
interface CurrencyDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCurrencies(currencyEntity: CurrencyEntity)

    @Query("SELECT * FROM currency")
    fun getCurrencies(): CurrencyEntity
}