package com.MatteV02.exercises.arrays

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldNotBeSameInstanceAs

class DeepCopyKtTest : FunSpec({
    data class DeepCopyInput(val original: Array<Array<Int>>) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as DeepCopyInput

            return original.contentDeepEquals(other.original)
        }

        override fun hashCode(): Int {
            return original.contentDeepHashCode()
        }
    }

    context("deepCopy") {
        withData(
            DeepCopyInput(arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))),
            DeepCopyInput(arrayOf(arrayOf(0, 0, 0), arrayOf(0, 0, 0), arrayOf(0, 0, 0)))
        ) { (original) ->
            run {
                val returned = deepCopy(original)

                returned.forEachIndexed { i, ints ->
                    ints.forEachIndexed { j, num ->
                        num shouldBe original[i][j]
                        num shouldNotBeSameInstanceAs original[i][j]
                    }
                }
            }
        }
    }
})
