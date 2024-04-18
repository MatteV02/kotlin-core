package com.MatteV02.exercises.generics

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class PairUtilKtTest : FunSpec({

    test("swap") {
        val pair = Pair("ciao", 6)

        swap(pair) shouldBe Pair(6, "ciao")
    }
})
