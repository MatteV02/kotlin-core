package com.MatteV02.exercises.strings

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class ConcatenateKtTest : FunSpec({
    data class ConcatenateInput(val strings: Array<String>) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as ConcatenateInput

            return strings.contentEquals(other.strings)
        }

        override fun hashCode(): Int {
            return strings.contentHashCode()
        }
    }

    context("concatenate") {
        withData(
            ConcatenateInput(arrayOf("Hello", " ", "World!")),
            ConcatenateInput(arrayOf("H", "e", "llo", " ", "World!")),
            ConcatenateInput(arrayOf("Hello World", "!"))
        ) { (strings) ->
            run {
                val returned = concatenate(strings)

                val expected = strings.joinToString(separator = "")

                returned shouldBe expected
            }
        }
    }
})
