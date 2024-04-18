package com.MatteV02.exercises.generics

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class DivideKtTest : FunSpec({

    test("divide") {
        divide(4, 2) shouldBe 2.0
        divide(4.0, 2) shouldBe 2.0
        divide(4, 2.0) shouldBe 2.0
    }
})
