package com.MatteV02.exercises.functional

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class OneTenKtTest : FunSpec({

    test("oneTen") {
        oneTen(listOf(1, 2, 3)) shouldBe listOf(20, 30, 40)
        oneTen(listOf(6, 8, 6, 8, 1)) shouldBe listOf(70, 90, 70, 90, 20)
        oneTen(listOf(10)) shouldBe listOf(110)
    }
})
