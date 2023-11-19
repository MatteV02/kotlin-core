package com.MatteV02.exercises.oop.basic.EnhancedResizableArray

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import kotlin.math.PI

class EnhancedResizableArrayTest : FunSpec({

    test("get & set & length") {
        val array1 = EnhancedResizableArray()
        for (i in 2..12) {
            val string = PI.toString()
            array1.set(i - 2, string[i].digitToInt())
        }

        array1.get(0) shouldBe 1
        array1.get(1) shouldBe 4
        array1.length() shouldBe 16

        shouldThrow<EnhancedResizableArray.NegativeIndexException> { array1.get(-1) }
        shouldThrow<EnhancedResizableArray.NegativeIndexException> { array1.set(-1, 1) }
    }

    test("contains") {
        val array1 = EnhancedResizableArray()
        array1.contains(0) shouldBe true
        array1.contains(1) shouldBe false

        for (i in 0..<array1.length()) {
            array1.set(i, i + 1)
            array1.contains(i + 1) shouldBe true
        }
        array1.contains(0) shouldBe false
    }

    test("fill") {
        val array1 = EnhancedResizableArray()
        for (i in 2..12) {
            val string = PI.toString()
            array1.set(i - 2, string[i].digitToInt())
        }

        array1.fill(0)

        for (i in 0..<array1.length()) {
            array1.get(i) shouldBe 0
        }
    }

    test("toArray") {
        val array1 = EnhancedResizableArray()
        for (i in 2..12) {
            val string = PI.toString()
            array1.set(i - 2, string[i].digitToInt())
        }

        array1.toArray() shouldBe arrayOf(1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 0, 0, 0, 0, 0)
    }
})
