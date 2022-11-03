package com.mvvmcleanarchitecture.currencyconverter.data.repository

import com.mvvmcleanarchitecture.currencyconverter.core.exception.Failure
import com.mvvmcleanarchitecture.currencyconverter.core.functional.Either
import com.mvvmcleanarchitecture.currencyconverter.core.platform.NetworkHandler
import com.mvvmcleanarchitecture.currencyconverter.data.model.articles.model.CurrenciesApiResponse
import com.mvvmcleanarchitecture.currencyconverter.data.model.articles.model.LatestRateApiResponse
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.XLocalDataSource
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.XRemoteDataSource
import com.mvvmcleanarchitecture.currencyconverter.domain.repository.CurrencyConversionRepository
import kotlinx.coroutines.flow.Flow

class XRepositoryImpl(
    private val x: XRemoteDataSource,
    private val carsLocalDataSource: XLocalDataSource,
   // private val apiMapper: ApiArticleMapper,
    private val networkHandler: NetworkHandler
) : CurrencyConversionRepository {

//    override suspend fun getCurrencies(): Flow<Either<Failure, List<ArticleModel>>> {
//
//        return when (networkHandler.isNetworkAvailable()) {
//            true ->
//                responseToResource(
//                    x.getX()
//                )
//          //  false -> getArticlesFromDB()
//
//        }
//    }

    //    private suspend fun responseToResource(response: Response<LatestRateApiResponse>):Flow< Either<Failure, List<ArticleModel>>> =flow{
//
//            try {
//                when (response.isSuccessful) {
//                    true -> response.body()
//                        ?.let {
//                            if (it.content.isEmpty())
//                                Either.Left(ArticlesFailure.NoDataAvailable())
//                            else {
//                                saveResponseToDB(it.content)
//                                Either.Right(it.content.map { article ->
//                                    apiMapper.mapToDomain(article)
//                                })
//                            }
//                        }
//                        ?: getArticlesFromDB()
//                    false -> getArticlesFromDB()
//                }
//            } catch (exception: Exception) {
//                Either.Left(Failure.ServerError)
//            }
//        }
    override suspend fun getCurrencies(): Flow<Either<Failure, List<CurrenciesApiResponse>>> {
        TODO("Not yet implemented")
    }

    override suspend fun getLatestRatesByBase(): Flow<Either<Failure, List<LatestRateApiResponse>>> {
        TODO("Not yet implemented")
    }


}