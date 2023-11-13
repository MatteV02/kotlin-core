package com.MatteV02.exercises.arrays

import io.kotest.assertions.fail
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData

class MoveZeroEndKtTest : FunSpec({

    context("moveZerosEnd") {
        data class MoveZeroEndInput(val v: Array<Int>) {
            override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (javaClass != other?.javaClass) return false

                other as MoveZeroEndInput

                return v.contentEquals(other.v)
            }

            override fun hashCode(): Int {
                return v.contentHashCode()
            }
        }

        withData(
            MoveZeroEndInput(arrayOf(0, 0, 4, 2)),
            MoveZeroEndInput(arrayOf(9, 0, 0, 4)),
            MoveZeroEndInput(arrayOf(1, 0, 0, 0))
        ) { (v) ->
            run {
                val returned = moveZerosEnd(v)

                var firstZeroFound = false
                for ((i, num) in returned.withIndex()) {
                    if (firstZeroFound && num != 0) {
                        fail("In the array $v, in position $i has been found an element != 0")
                    }
                    if (!firstZeroFound && returned[i] == 0) {
                        firstZeroFound = true
                    }
                }
            }
        }
    }
})
