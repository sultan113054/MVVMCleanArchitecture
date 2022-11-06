package com.mvvmcleanarchitecture.currencyconverter.data.repository

import com.google.gson.JsonObject
import com.mvvmcleanarchitecture.currencyconverter.core.exception.Failure
import com.mvvmcleanarchitecture.currencyconverter.core.extensions.toObjectMap
import com.mvvmcleanarchitecture.currencyconverter.core.functional.Either
import com.mvvmcleanarchitecture.currencyconverter.core.platform.NetworkHandler
import com.mvvmcleanarchitecture.currencyconverter.data.model.CurrencyEntity
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.local.CurrencyLocalDataSource
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.remote.CurrencyRemoteDataSource
import com.mvvmcleanarchitecture.currencyconverter.domain.repository.CurrencyRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
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
                true ->
                    responseToResource(currencyRemoteDataSource.getCurrencies())
                false ->
                    getSavedData().map {
                        emit(Either.Right(it))
                    }

            }
        }


    private suspend fun getSavedData(): Flow<CurrencyEntity> {
        return currencyLocalDataSource.getSavedCurrencies()
    }

    private suspend fun responseToResource(response: Response<JsonObject>): Flow<Either.Right<CurrencyEntity>> {

        when (response.isSuccessful) {
            true -> response.body()
                ?.let { jsonObject ->

                    when (val result = JSONObject(jsonObject.toString()).toObjectMap()) {
                        null -> return getSavedData().map {
                            Either.Right(it)

                        }
                        else -> return currencyLocalDataSource.saveCurrencies(CurrencyEntity(1,
                            result as Map<String, String>)).map {
                            Either.Right(it)
                        }
                    }

                } ?: return getSavedData().map {
                Either.Right(it)

            }
            false -> return getSavedData().map {
                Either.Right(it)

            }
        }
    }
}