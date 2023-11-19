package com.MatteV02.exercises.oop.reverse

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class ReverserTest : FunSpec({
    data class ReverserInput(val string: String)

    context("reverse") {
        val reverserFast: Reverser = ReverserFast()
        val reverserSlow: Reverser = ReverserSlow()

        withData(
            ReverserInput("hello"),
            ReverserInput("1823yn9c187y1r87324tb2v893n "),
            ReverserInput("")
        ) { (string) ->
            run {
                reverserFast.reverse(string) shouldBe string.reversed()
                reverserSlow.reverse(string) shouldBe string.reversed()
            }
        }
    }
})
