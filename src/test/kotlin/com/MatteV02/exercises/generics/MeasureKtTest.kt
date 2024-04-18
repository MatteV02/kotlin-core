package com.MatteV02.exercises.generics

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class MeasureKtTest : FunSpec({
    val array = arrayOf(1,2,3,4,5,6,7,8,9,10)

    class IntMeasurer : Measurer<Int> {
        override fun measure(obj: Int): Double {
            return obj.toDouble()
        }

    }

    test("max") {
        max(array, IntMeasurer()) shouldBe 10
    }

    test("min") {
        min(array, IntMeasurer()) shouldBe 1
    }
})
