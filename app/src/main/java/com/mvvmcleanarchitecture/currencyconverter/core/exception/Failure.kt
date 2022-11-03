package com.mvvmcleanarchitecture.currencyconverter.core.exception

sealed class Failure {
    object NetworkConnection : Failure()
    object ServerError : Failure()
    object DBError : Failure()
    abstract class FeatureFailure : Failure()
}