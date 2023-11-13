package com.MatteV02.exercises.arrays

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class FizzBuzzKtTest : FunSpec({

    context("fizzBuzz") {
        data class FizzBuzzInput(val start: Int, val end: Int)

        withData(
            FizzBuzzInput(1, 6),
            FizzBuzzInput(1, 8),
            FizzBuzzInput(1, 11)
        ) { (start, end) ->
            run {
                val returned = fizzBuzz(start, end)
                returned.forEachIndexed { index, str ->
                    run {
                        val sequenceIndex = index + start
                        if (sequenceIndex % 15 == 0) {
                            str shouldBe "FizzBuzz"
                        } else if (sequenceIndex % 3 == 0) {
                            str shouldBe "Fizz"
                        } else if (sequenceIndex % 5 == 0) {
                            str shouldBe "Buzz"
                        } else {
                            str shouldBe sequenceIndex.toString()
                        }
                    }
                }
            }
        }
    }
})
