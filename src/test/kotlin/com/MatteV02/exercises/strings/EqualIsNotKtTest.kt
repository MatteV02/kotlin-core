package com.MatteV02.exercises.strings

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class EqualIsNotKtTest : FunSpec({
    data class TestData(val string: String, val expected: Boolean)

    context("equalIsNot") {
        withData(
            TestData("This is not", false),
            TestData("This is notnot", true),
            TestData("noisxxnotyynotxisi", true)
        ) { (string, expected) ->
            run {
                equalIsNot(string) shouldBe expected
            }
        }
    }
})
