package com.mvvmcleanarchitecture.currencyconverter.presentation.util

import com.mvvmcleanarchitecture.currencyconverter.core.exception.Failure
import com.mvvmcleanarchitecture.currencyconverter.data.model.LatestRateResponse


sealed class UIState {
    object Loading : UIState()
    data class Error(val failure: Failure) : UIState()
    data class Success(val data: List<LatestRateResponse>) : UIState()

}