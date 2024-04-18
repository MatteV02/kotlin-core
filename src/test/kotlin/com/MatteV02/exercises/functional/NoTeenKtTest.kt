package com.MatteV02.exercises.functional

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class NoTeenKtTest : FunSpec({

    test("noTeen") {
        noTeen(listOf(12, 13, 19, 20)) shouldBe listOf(12, 20)
        noTeen(listOf(1, 14, 1)) shouldBe listOf(1, 1)
        noTeen(listOf(15)) shouldBe emptyList()
    }
})
