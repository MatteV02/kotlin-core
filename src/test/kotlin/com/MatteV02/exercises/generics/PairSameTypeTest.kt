package com.MatteV02.exercises.generics

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class PairSameTypeTest : FunSpec({

    test("swap") {
        val pair = PairSameType(1, 5)
        pair.swap()

        pair shouldBe PairSameType(5, 1)
    }
})
