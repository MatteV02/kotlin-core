package com.MatteV02.exercises.collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class IntersectionKtTest : FunSpec({

    context("intersection") {
        test("non-overlapping sets") {
            val setA = setOf(1, 2, 3, 4, 5, 6, 7, 8)
            val setB = setOf(9, 10, 11, 12)

            intersection(setB, setA) shouldBe emptySet()
        }

        test("empty set - set") {
            val setA = emptySet<Int>()
            val setB = setOf(1, 2, 3, 4, 5, 6, 7, 8)

            intersection(setA, setB) shouldBe intersection(setB, setA)
            intersection(setA, setB) shouldBe emptySet()
        }

        test("overlapping sets") {
            val setA = setOf(1, 2, 3, 4, 5, 6)
            val setB = setOf(2, 5, 8, 9, 10)

            intersection(setA, setB) shouldBe setOf(2, 5)
        }
    }
})
