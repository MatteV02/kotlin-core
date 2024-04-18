package com.MatteV02.exercises.generics

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class PairTest : FunSpec({

    test("test instantiation") {
        val p1 = Pair(2, 7)
        val p2 = Pair(2, "ciao")

        p1 shouldBe Pair(2, 7)
        p2 shouldBe Pair(2, "ciao")
    }

})
