package com.mvvmcleanarchitecture.currencyconverter

import org.junit.rules.TestRule
import org.mockito.MockitoAnnotations

object InjectMocksRule {
    fun create(testClass: Any) = TestRule { statement, _ ->
        MockitoAnnotations.openMocks(testClass)
        statement
    }
}