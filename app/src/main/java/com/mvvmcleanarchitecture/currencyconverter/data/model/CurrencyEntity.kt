package com.mvvmcleanarchitecture.currencyconverter.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "currency"
)
data class CurrencyEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val currencies: Map<String, String>,
)