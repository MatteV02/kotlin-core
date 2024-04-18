package com.MatteV02.exercises.functional

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SquareFiveKtTest : FunSpec({

    test("squareFive") {
        squareFive(listOf(3,1,4)) shouldBe 3
        squareFive(listOf(1)) shouldBe 1
        squareFive(listOf(5)) shouldBe 0
    }
})
