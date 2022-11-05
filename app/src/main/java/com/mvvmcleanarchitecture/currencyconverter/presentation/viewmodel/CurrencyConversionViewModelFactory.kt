package com.mvvmcleanarchitecture.currencyconverter.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mvvmcleanarchitecture.currencyconverter.domain.usecase.GetCurrenciesUseCase
import com.mvvmcleanarchitecture.currencyconverter.domain.usecase.GetLatestRatesUseCase


class CurrencyConversionViewModelFactory(
    private val getCurrenciesUseCase: GetCurrenciesUseCase,
    private val getLatestRatesUseCase: GetLatestRatesUseCase

) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CurrencyConversionViewModel(getCurrenciesUseCase, getLatestRatesUseCase) as T
    }
}









