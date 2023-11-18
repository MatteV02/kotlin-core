package com.MatteV02.exercises.oop.basic.RationalNumber

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class RationalNumberTest : FunSpec({
    val rationalNumber1 = RationalNumber(1, 2)
    val rationalNumber2 = RationalNumber(2, 4)

    test("add") {
        rationalNumber1.add(rationalNumber2) shouldBe RationalNumber(1, 1)

        rationalNumber1.add(RationalNumber(0,1)) shouldBe rationalNumber1
    }

    test("multiply") {
        rationalNumber1.multiply(rationalNumber2) shouldBe RationalNumber(1, 4)

        rationalNumber1.multiply(RationalNumber(0, 1)) shouldBe RationalNumber(0, 1)
    }

    test("simplification") {
        RationalNumber(24, 60) shouldBe RationalNumber(2, 5)
    }

    test("denominator = 0") {
        shouldThrow<IllegalArgumentException> {
            RationalNumber(1, 0)
        }
    }

    test("numerator = 0") {
        RationalNumber(0, 4) shouldBe RationalNumber(0, 1)
    }
})
