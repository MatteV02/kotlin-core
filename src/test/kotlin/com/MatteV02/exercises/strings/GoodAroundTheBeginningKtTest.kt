package com.MatteV02.exercises.strings

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class GoodAroundTheBeginningKtTest : FunSpec({
    data class TestData(val string: String, val expected: Boolean)

    context("goodAroundTheBeginning") {
        withData(
            TestData("good Sweet", true),
            TestData("_good Sweet", true),
            TestData("__good Sweet", false),
            TestData("goo", false)
        ) { (string, expected) ->
            run {
                goodAroundTheBeginning(string) shouldBe expected
            }
        }
    }
})
