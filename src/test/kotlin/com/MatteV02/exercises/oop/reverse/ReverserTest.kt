package com.MatteV02.exercises.oop.reverse

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

@Suppress("SpellCheckingInspection")
class ReverserTest : FunSpec({
    val reverserFast: Reverser = ReverserFast()
    val reverserSlow: Reverser = ReverserSlow()

    data class ReverserTestData(val input: String, val expected: String) {
        fun test() {
            reverserSlow.reverse(input) shouldBe expected
            reverserFast.reverse(input) shouldBe expected
        }
    }

    test("Empty string") {
        ReverserTestData("", "").test()
    }

    test("One character string") {
        ReverserTestData("a", "a").test()
    }

    test("Medium length string") {
        ReverserTestData("mbgA6bApWe", "eWpAb6Agbm").test()
    }

    test("Long length string") {
        ReverserTestData("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")
            .test()
    }
})
