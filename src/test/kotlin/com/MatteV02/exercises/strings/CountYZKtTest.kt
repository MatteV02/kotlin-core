package com.MatteV02.exercises.strings

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class CountYZKtTest : FunSpec({
    data class TestData(val string: String, val expected: Int)

    context("countYZ") {
        withData(
            TestData("fez day", 2),
            TestData("day fez", 2),
            TestData("day fyyyz", 2)
        ) { (string, expected) ->
            run {
                countYZ(string) shouldBe expected
            }
        }
    }
})
