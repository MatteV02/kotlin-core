package com.MatteV02.exercises.strings

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class GoodAtTheBeginningKtTest : FunSpec({
    data class GoodAtTheBeginningInput(val string: String)

    context("goodAtTheBeginning") {
        withData(
            GoodAtTheBeginningInput("good Sweet"),
            GoodAtTheBeginningInput(" good Sweet"),
            GoodAtTheBeginningInput("goo")
        ) { (string) ->
            run {
                val expected = goodAtTheBeginning(string)
                expected shouldBe string.startsWith("good")
            }
        }
    }
})
