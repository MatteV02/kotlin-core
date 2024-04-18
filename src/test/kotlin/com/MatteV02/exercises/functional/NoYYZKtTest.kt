package com.MatteV02.exercises.functional

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class NoYYZKtTest : FunSpec({

    test("noYYZ") {
        noYYZ(listOf("a", "b", "c")) shouldBe listOf("ay", "by", "cy")
        noYYZ(listOf("a", "b", "cy")) shouldBe listOf("ay", "by")
        noYYZ(listOf("xx", "ya", "zz")) shouldBe listOf("xxy", "yay", "zzy")
    }
})
