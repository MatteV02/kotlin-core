package com.MatteV02.exercises.arrays

import io.kotest.assertions.fail
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import kotlin.math.absoluteValue

class MatchUpKtTest : FunSpec({

    context("matchUp") {
        data class MatchUpInput(val v1: Array<Int>, val v2: Array<Int>) {
            override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (javaClass != other?.javaClass) return false

                other as MatchUpInput

                if (!v1.contentEquals(other.v1)) return false
                if (!v2.contentEquals(other.v2)) return false

                return true
            }

            override fun hashCode(): Int {
                var result = v1.contentHashCode()
                result = 31 * result + v2.contentHashCode()
                return result
            }
        }

        withData(
            MatchUpInput(arrayOf(1, 2, 3), arrayOf(2, 3, 10)),
            MatchUpInput(arrayOf(1, 2, 3), arrayOf(2, 3, 5)),
            MatchUpInput(arrayOf(1, 2, 3), arrayOf(2, 3, 3)),
            MatchUpInput(arrayOf(1, 2, 3), arrayOf(1, 2))
        ) { (v1, v2) ->
            run {
                if (v1.size != v2.size) {
                    shouldThrow<IllegalArgumentException> { matchUp(v1, v2) }
                    return@run
                }

                val returned = matchUp(v1, v2)

                var count = returned

                for (i in v1.indices) {
                    if ((v1[i] - v2[i]).absoluteValue <= 2) {
                        count--
                    }
                }

                if (count != 0) {
                    fail("Match Up with argument v1 = $v1, v2 = $v2 produced output = ${returned}, but ${returned + count}")
                }
            }
        }
    }
})
