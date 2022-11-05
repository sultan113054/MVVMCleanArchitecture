package com.mvvmcleanarchitecture.currencyconverter.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(
    tableName = "latest_rates"
)
data class LatestRateEntity(
    @PrimaryKey
    val id: Int,
    val disclaimer: String,
    val license: String,
    val base: String,
    val date: String?,
    val rates: Map<String, String>,
)