package com.MatteV02.exercises.functional

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class NoYYKtTest : FunSpec({

    test("noYY") {
        noYY(listOf("a", "b", "c")) shouldBe listOf("ay", "by", "cy")
        noYY(listOf("a", "b", "cy")) shouldBe listOf("ay", "by")
        noYY(listOf("xx", "ya", "zz")) shouldBe listOf("xxy", "yay", "zzy")
    }
})
