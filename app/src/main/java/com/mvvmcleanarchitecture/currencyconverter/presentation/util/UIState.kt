package com.mvvmcleanarchitecture.currencyconverter.presentation.util

import com.mvvmcleanarchitecture.currencyconverter.core.exception.Failure
import com.mvvmcleanarchitecture.currencyconverter.data.model.articles.model.LatestRateApiResponse


sealed class UIState {
    object Loading : UIState()
    data class Error(val failure: Failure) : UIState()
    data class Success(val data: List<LatestRateApiResponse>) : UIState()

}