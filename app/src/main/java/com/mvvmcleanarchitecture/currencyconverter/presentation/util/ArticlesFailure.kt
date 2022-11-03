package com.mvvmcleanarchitecture.currencyconverter.presentation.util

import com.mvvmcleanarchitecture.currencyconverter.core.exception.Failure


class ArticlesFailure {
    class NoDataAvailable : Failure.FeatureFailure()
}

