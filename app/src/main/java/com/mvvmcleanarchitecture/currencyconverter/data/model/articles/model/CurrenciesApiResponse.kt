package com.mvvmcleanarchitecture.currencyconverter.data.model.articles.model

import androidx.room.Entity

@Entity
data class CurrenciesApiResponse(
    val currencies: Map<String, Map<String, Double>>,
)
