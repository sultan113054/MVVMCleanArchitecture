package com.mvvmcleanarchitecture.currencyconverter.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.mvvmcleanarchitecture.currencyconverter.data.model.LatestRateEntity

@Dao
interface LatestRateDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertLatestRate(latestRateEntity: LatestRateEntity)
}