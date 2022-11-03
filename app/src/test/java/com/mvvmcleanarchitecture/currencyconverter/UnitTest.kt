package com.mvvmcleanarchitecture.currencyconverter

import org.junit.Rule

abstract class UnitTest {

    @Suppress("LeakingThis")
    @get:Rule
    val injectMocks = InjectMocksRule.create(this@UnitTest)

    fun fail(message: String): Nothing = throw AssertionError(message)
}