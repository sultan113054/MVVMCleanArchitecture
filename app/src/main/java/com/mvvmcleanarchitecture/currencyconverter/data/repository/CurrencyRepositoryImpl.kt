package com.mvvmcleanarchitecture.currencyconverter.data.repository

import com.google.gson.JsonObject
import com.mvvmcleanarchitecture.currencyconverter.core.exception.Failure
import com.mvvmcleanarchitecture.currencyconverter.core.extensions.toMap
import com.mvvmcleanarchitecture.currencyconverter.core.functional.Either
import com.mvvmcleanarchitecture.currencyconverter.core.platform.NetworkHandler
import com.mvvmcleanarchitecture.currencyconverter.data.model.CurrencyEntity
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.local.CurrencyLocalDataSource
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.remote.CurrencyRemoteDataSource
import com.mvvmcleanarchitecture.currencyconverter.domain.repository.CurrencyRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import org.json.JSONObject
import retrofit2.Response

class CurrencyRepositoryImpl(
    private val currencyRemoteDataSource: CurrencyRemoteDataSource,
    private val currencyLocalDataSource: CurrencyLocalDataSource,
    private val networkHandler: NetworkHandler,
) : CurrencyRepository {
    override suspend fun getCurrencies(updateFromRemote: Boolean): Flow<Either<Failure, CurrencyEntity>> =
        flow {
            when (networkHandler.isNetworkAvailable()) {
                true -> emit(responseToResource(currencyRemoteDataSource.getCurrencies()))
                false ->
                    getSavedData().collect {
                        emit(Either.Right(it))
                    }


            }
        }


    private suspend fun getSavedData(): Flow<CurrencyEntity> {
        return currencyLocalDataSource.getSavedCurrencies()
    }

    private suspend fun responseToResource(response: Response<JsonObject>): Flow<Either<Failure, CurrencyEntity>> {


        when (response.isSuccessful) {
            true -> response.body()
                ?.let {

                    var response = JSONObject(it.toString()).toMap()


                }
        }


    }
}