package com.MatteV02.exercises.strings

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class SumDigitsKtTest : FunSpec({
    data class TestData(val string: String, val expected: Int)

    context("sumDigits") {
        withData(
            TestData("aa1bc2d3", 6),
            TestData("aa11b33", 8),
            TestData("Chocolate", 0)
        ) { (string, expected) ->
            run {
                sumDigits(string) shouldBe expected
            }
        }
    }
})
