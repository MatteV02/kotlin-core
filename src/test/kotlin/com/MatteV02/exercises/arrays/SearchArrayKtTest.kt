package com.MatteV02.exercises.arrays

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class SearchArrayKtTest : FunSpec({
    data class SearchArrayInput(val strings: Array<String>, val searched: String) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as SearchArrayInput

            if (!strings.contentEquals(other.strings)) return false
            if (searched != other.searched) return false

            return true
        }

        override fun hashCode(): Int {
            var result = strings.contentHashCode()
            result = 31 * result + searched.hashCode()
            return result
        }
    }

    val inputList = mutableListOf<SearchArrayInput>()

    beforeSpec {
        inputList.add(SearchArrayInput(arrayOf("car", "boat", "bike", "plane"), "bike"))
        inputList.add(SearchArrayInput(arrayOf("car", "boat", "bike", "plane"), "helicopter"))
    }

    context("containsBruteForce") {
        withData(inputList) { (strings, searched) ->
            run {
                val returned = containsBruteForce(strings, searched)
                returned shouldBe strings.contains(searched)
            }
        }
    }

    context("containsBinary") {
        withData(inputList) { (strings, searched) ->
            run {
                val returned = containsBinary(strings, searched)
                returned shouldBe strings.contains(searched)
            }
        }
    }
})
