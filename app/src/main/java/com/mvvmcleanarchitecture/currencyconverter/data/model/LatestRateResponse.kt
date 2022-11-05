package com.mvvmcleanarchitecture.currencyconverter.data.model


data class LatestRateResponse(
    val id: Int,
    val disclaimer: String,
    val license: String,
    val base: String,
    val date: String?,
    val rates: Map<String, String>,
)