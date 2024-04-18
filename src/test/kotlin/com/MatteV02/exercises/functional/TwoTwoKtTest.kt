package com.MatteV02.exercises.functional

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class TwoTwoKtTest : FunSpec({

    test("twoTwo") {
        twoTwo(listOf(1,2,3)) shouldBe listOf(4,6)
        twoTwo(listOf(2,6,11)) shouldBe listOf(4)
        twoTwo(listOf(0)) shouldBe listOf(0)
    }
})
