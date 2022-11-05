package com.mvvmcleanarchitecture.currencyconverter.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mvvmcleanarchitecture.currencyconverter.core.exception.Failure
import com.mvvmcleanarchitecture.currencyconverter.domain.usecase.GetCurrenciesUseCase
import com.mvvmcleanarchitecture.currencyconverter.domain.usecase.GetLatestRatesUseCase
import com.mvvmcleanarchitecture.currencyconverter.presentation.util.UIState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class XViewModel(
    private val getCurrenciesUseCase: GetCurrenciesUseCase,
    private val getLatestRatesUseCase: GetLatestRatesUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow<UIState>(UIState.Loading)
    val uiState: StateFlow<UIState> = _uiState

    init {
        viewModelScope.launch(Dispatchers.IO) {
//            getCarsUseCase().collect {
//             //   it.fold(::handleFailure, ::handleSuccess)
//            }
        }
    }


    private fun handleFailure(failure: Failure) {
        _uiState.value = UIState.Error(failure)
    }

//    private fun handleSuccess(articles: List<ArticleModel>) {
//        _uiState.value = UIState.Success(articles)
//    }
}














