package com.MatteV02.exercises.strings

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class RemoveFirstTwoCharsKtTest : FunSpec({
    data class RemoveFirstTwoCharsInput(val string: String)

    context("removeFirstTwoChars") {
        withData(
            RemoveFirstTwoCharsInput("Hello World!"),
            RemoveFirstTwoCharsInput("No"),
            RemoveFirstTwoCharsInput("Y")
        ) { (string) ->
            run {
                val returned = removeFirstTwoChars(string)

                returned shouldBe string.slice(2..string.lastIndex)
            }
        }
    }
})
