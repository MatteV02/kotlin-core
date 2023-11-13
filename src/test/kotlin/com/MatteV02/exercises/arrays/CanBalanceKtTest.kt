package com.MatteV02.exercises.arrays

import io.kotest.assertions.fail
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData

class CanBalanceKtTest : FunSpec({

    context("canBalance") {
        data class CanBalanceInput(val v: Array<Int>) {
            override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (javaClass != other?.javaClass) return false

                other as CanBalanceInput

                return v.contentEquals(other.v)
            }

            override fun hashCode(): Int {
                return v.contentHashCode()
            }
        }

        withData(
            CanBalanceInput(arrayOf(1, 1, 1, 2, 1)),
            CanBalanceInput(arrayOf(2, 1, 1, 2, 1)),
            CanBalanceInput(arrayOf(10, 10))
        ) { (v) ->
            run {
                val returned = canBalance(v)

                var sumFirstHalf = 0
                var sumSecondHalf = v.sum()

                for (num in v) {
                    sumFirstHalf += num
                    sumSecondHalf -= num

                    if (sumFirstHalf == sumSecondHalf) {
                        if (returned) {
                            return@run
                        } else {
                            fail("Function returned that v = $v is not balanced, but v is balanced!")
                        }
                    }
                }

                if (returned) {
                    fail("Function returned that v = $v is balanced, but v is not balanced!")
                } else {
                    return@run
                }
            }
        }
    }
})
