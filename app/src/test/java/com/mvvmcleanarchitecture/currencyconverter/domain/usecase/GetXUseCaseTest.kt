package com.mvvmcleanarchitecture.currencyconverter.domain.usecase

import com.google.common.truth.Truth
import com.mvvmcleanarchitecture.currencyconverter.core.exception.Failure
import com.mvvmcleanarchitecture.currencyconverter.core.functional.Either
import com.mvvmcleanarchitecture.currencyconverter.domain.repository.CurrencyRepository
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class GetXUseCaseTest {

    private lateinit var testSubject: GetCurrenciesUseCase

    @Mock
    private lateinit var mockCarsRepository: CurrencyRepository

    @Before
    fun setup() {

        testSubject = GetCurrenciesUseCase(mockCarsRepository)
    }

    @Test
    fun getProducts_Success() {
        runBlocking {
            Mockito.`when`(mockCarsRepository.getCurrencies())
                .thenReturn(flow {
                   // emit(Either.Right())
                })

            val resource = testSubject.invoke()
            resource.collect {
             //   it.fold(::handleFailure, ::handleSuccess)
            }
        }
    }

    @Test
    fun getProducts_Failure() {
        runBlocking {

            Mockito.`when`(mockCarsRepository.getCurrencies())
                .thenReturn(flow {
                    emit(Either.Left(Failure.ServerError))
                })

            val resource = testSubject.invoke()

            resource.collect {
             //   it.fold(::handleFailure, ::handleSuccess)
            }
        }
    }

    private fun handleFailure(failure: Failure) {
        Truth.assertThat(failure).isEqualTo(Failure.ServerError)

    }

//    private fun handleSuccess(articles: List<ArticleModel>) {
//      //  Truth.assertThat(articles[0]).isEqualTo(Fakes.getArticles()[0])
//    }
}