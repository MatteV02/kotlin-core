package com.MatteV02.exercises.arrays

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class FibonacciKtTest : FunSpec({

    context("fibonacci") {
        data class FibonacciInput(val n: Int)

        withData(
            FibonacciInput(1),
            FibonacciInput(2),
            FibonacciInput(5)
        ) { (n) ->
            run {
                if (n <= 0) {
                    shouldThrow<IllegalArgumentException> {
                        fibonacci(n)
                    }
                }

                val returned = fibonacci(n)
                returned[0] shouldBe 0
                if (n >= 2) {
                    returned[1] shouldBe 1
                    if (n > 2) {
                        for (i in 2..returned.lastIndex) {
                            returned[i] shouldBe returned[i - 2] + returned[i - 1]
                        }
                    }
                }
            }
        }
    }
})
