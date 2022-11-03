package com.mvvmcleanarchitecture.currencyconverter.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mvvmcleanarchitecture.currencyconverter.domain.usecase.GetCurrenciesUseCase


class XViewModelFactory(
    private val x: GetCurrenciesUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return XViewModel(x) as T
    }
}









