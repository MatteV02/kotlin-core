package com.MatteV02.exercises.arrays

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class IsEverywhereKtTest : FunSpec({

    context("isEverywhere") {
        data class IsEverywhereTestData(val v: Array<Int>, val value: Int, val expected: Boolean) {
            override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (javaClass != other?.javaClass) return false

                other as IsEverywhereTestData

                if (!v.contentEquals(other.v)) return false
                if (value != other.value) return false
                if (expected != other.expected) return false

                return true
            }

            override fun hashCode(): Int {
                var result = v.contentHashCode()
                result = 31 * result + value
                result = 31 * result + expected.hashCode()
                return result
            }
        }

        withData(
            IsEverywhereTestData(arrayOf(1, 2, 1, 3), 1, true),
            IsEverywhereTestData(arrayOf(1, 2, 1, 3), 2, false),
            IsEverywhereTestData(arrayOf(1, 2, 1, 3, 4), 1, false),
        ) { (v, value, expected) ->
            run {
                isEverywhere(v, value) shouldBe expected
            }
        }
    }
})
