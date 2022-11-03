package com.mvvmcleanarchitecture.currencyconverter.core.functional

import com.mvvmcleanarchitecture.currencyconverter.UnitTest
import org.amshove.kluent.shouldBe
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeInstanceOf
import org.junit.Test

class EitherTest : UnitTest() {

    @Test
    fun `Either Right should return correct type`() {
        val result = Either.Right("sultan")

        result shouldBeInstanceOf Either::class.java
        result.isRight shouldBe true
        result.isLeft shouldBe false
        result.fold({},
            { right ->
                right shouldBeInstanceOf String::class.java
                right shouldBeEqualTo "sultan"
            })
    }

    @Test
    fun `Either Left should return correct type`() {
        val result = Either.Left("sultan")

        result shouldBeInstanceOf Either::class.java
        result.isLeft shouldBe true
        result.isRight shouldBe false
        result.fold(
            { left ->
                left shouldBeInstanceOf String::class.java
                left shouldBeEqualTo "sultan"
            }, {})
    }


}