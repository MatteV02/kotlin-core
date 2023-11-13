package com.MatteV02.exercises.strings

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class ReverseKtTest : FunSpec({
    data class ReverseInput(val string: String)

    context("reverse") {
        withData(
            ReverseInput("String test"),
            ReverseInput("John Doe"),
            ReverseInput("Hello World!")
        ) { (str) ->
            run {
                val returned = reverse(str)
                returned shouldBe str.reversed()
            }
        }
    }
})
