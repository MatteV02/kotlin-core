package com.MatteV02.exercises.strings

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class RemoveFirstLastKtTest : FunSpec({
    data class RemoveFirstLastInput(val string: String)

    context("removeFirstLast") {
        withData(
            RemoveFirstLastInput("google"),
            RemoveFirstLastInput("aenema"),
            RemoveFirstLastInput("FF"),
            RemoveFirstLastInput("F")
        ) { (string) ->
            run {
                val returned = removeFirstLast(string)
                returned shouldBe
                        if (string.length <= 1 || string[0] != string[string.lastIndex]) {
                            string
                        } else {
                            string.substring(1..<string.lastIndex)
                        }
            }
        }
    }
})
