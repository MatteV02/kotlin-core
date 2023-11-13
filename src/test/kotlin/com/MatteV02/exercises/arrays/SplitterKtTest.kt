package com.MatteV02.exercises.arrays

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class SplitterKtTest : FunSpec({

    context("splitter") {
        data class SplitterInput(val input: Int)

        withData(
            SplitterInput(321),
            SplitterInput(123)
        ) { (num) ->
            run {
                var string = ""
                val returned = splitter(num)

                returned.forEach { num -> string += num }
                string shouldBe num.toString()
            }
        }
    }
})
