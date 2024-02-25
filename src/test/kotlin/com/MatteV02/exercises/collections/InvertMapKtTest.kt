package com.MatteV02.exercises.collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class InvertMapKtTest : FunSpec({

    context("invertMap") {
        test("empty map") {
            invertMap(emptyMap()) shouldBe emptyMap()
        }

        test("no repeated values") {
            invertMap(
                mapOf(
                    Pair(1, "Hello"),
                    Pair(3, "World")
                )
            ) shouldBe mapOf(
                Pair("Hello", 1),
                Pair("World", 3)
            )
        }

        test("repeated values") {
            invertMap(
                mapOf(
                    Pair(1, "Hello"),
                    Pair(3, "Hello")
                )
            ) shouldBe mapOf(
                Pair("Hello", 3)
            )
        }
    }
})
