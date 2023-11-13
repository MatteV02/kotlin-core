package com.MatteV02.exercises.strings

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class RemoveFirstTwoCharsIfKtTest : FunSpec({
    data class RemoveFirstTwoCharsIfInput(val string: String)

    context("removeFirstTwoCharsIf") {
        withData(
            RemoveFirstTwoCharsIfInput("Hello World!"),
            RemoveFirstTwoCharsIfInput("Good World!"),
            RemoveFirstTwoCharsIfInput("Ho"),
            RemoveFirstTwoCharsIfInput("Ne"),
            RemoveFirstTwoCharsIfInput("Y")
        ) { (string) ->
            run {
                val returned = removeFirstTwoCharsIf(string)

                if (string.isEmpty()) {
                    returned shouldBe ""
                    return@run
                }

                if (string.length == 1) {
                    if (string[0] == 'H') {
                        returned shouldBe "H"
                    } else {
                        returned shouldBe ""
                    }
                    return@run
                }

                if (string[0] == 'H' && string[1] == 'e') {
                    returned shouldBe string
                } else if (string[0] == 'H' && string[1] != 'e') {
                    returned shouldBe "H" + string.substring(2..string.lastIndex)
                } else if (string[0] != 'H' && string[1] == 'e') {
                    returned shouldBe string.substring(1..string.lastIndex)
                } else {
                    returned shouldBe string.substring(2..string.lastIndex)
                }
            }
        }
    }
})
