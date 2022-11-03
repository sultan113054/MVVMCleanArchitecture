package com.mvvmcleanarchitecture.currencyconverter.data.model.articles.model



data class LatestRateApiResponse(
    val disclaimer: String,
    val license: String,
    val base: String,
    val date: String,
    val rates: Map<String, Double>,

)