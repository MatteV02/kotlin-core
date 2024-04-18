package com.MatteV02.exercises.generics

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class IterableToStringKtTest : FunSpec({

    test("non-empty iterable") {
        iterableToString(listOf(1, 2, 3)) shouldBe "1, 2, 3, "
        iterableToString(listOf("a", "b", "c")) shouldBe "a, b, c, "
    }

    test("empty iterable") {
        iterableToString(emptyList<Int>()) shouldBe ""
    }
})
