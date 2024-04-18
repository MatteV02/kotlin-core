package com.MatteV02.exercises.generics

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class CountOccurrenceKtTest : FunSpec({

    test("numeric array") {
        countOccurrences(arrayOf(1, 2, 2, 2), 2) shouldBe 3
    }

    test("numeric array with null values") {
        countOccurrences(arrayOf(null, null, 3, 4), null) shouldBe 2
    }

    test("string array with null values") {
        countOccurrences(arrayOf("hello", "world", null, null), "hello") shouldBe 1
    }

    test("no matches") {
        countOccurrences(arrayOf(1, 2, null, 2), 3) shouldBe 0
    }
})
