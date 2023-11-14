package com.MatteV02.exercises.strings

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class DuplicateCharsKtTest : FunSpec({
    data class DuplicateCharsInput(val string: String)

    context("duplicateChars") {
        withData(
            DuplicateCharsInput("whistleblower"),
            DuplicateCharsInput("ss"),
            DuplicateCharsInput("s"),
            DuplicateCharsInput("")
        ) { (string: String) ->
            run {
                val returned = duplicateChars(string)

                val charSet = mutableSetOf<Char>()
                val expected = mutableSetOf<Char>()

                string.forEach { ch: Char ->
                    if (!charSet.add(ch)) {
                        expected.add(ch)
                    }
                }

                returned shouldBe expected.toTypedArray().sortedArray()
            }
        }
    }
})
