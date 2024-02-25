package com.MatteV02.exercises.collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ValuesKeysKtTest : FunSpec({

    context("valuesKeys") {
        test("empty map") {
            valuesKeys(emptyMap()) shouldBe false
        }

        test("no value used as key") {
            val map = mapOf(
                Pair("1", "a"),
                Pair("2", "b"),
                Pair("3", "c"),
                Pair("4", "d"),
                Pair("5", "e"),
                Pair("6", "f"),
                Pair("7", "g"),
                Pair("8", "h"),
                Pair("9", "i"),
                Pair("10", "j"),
            )

            valuesKeys(map) shouldBe false
        }

        test("one value used as key") {
            val map = mapOf(
                Pair("1", "a"),
                Pair("2", "b"),
                Pair("j", "c"),
                Pair("4", "d"),
                Pair("5", "e"),
                Pair("6", "f"),
                Pair("7", "g"),
                Pair("8", "h"),
                Pair("9", "i"),
                Pair("10", "j"),
            )

            valuesKeys(map) shouldBe true
        }
    }
})
