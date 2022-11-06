package com.mvvmcleanarchitecture.currencyconverter.data.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mvvmcleanarchitecture.currencyconverter.data.model.CurrencyEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CurrencyDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCurrencies(currencyEntity: CurrencyEntity)

    @Query("SELECT * FROM currency Limit 1")
    fun getCurrencies(): Flow<CurrencyEntity>

    @Query("Delete FROM currency")
    fun deleteAllData()
}