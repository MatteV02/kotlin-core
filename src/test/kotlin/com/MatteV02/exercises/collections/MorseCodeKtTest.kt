package com.MatteV02.exercises.collections

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class MorseCodeKtTest : FunSpec({

    context("morseCode") {
        test("empty string") {
            morseCode("") shouldBe ""
        }

        test("invalid string") {
            shouldThrow<IllegalArgumentException> { morseCode("hello1a") }
            shouldThrow<IllegalArgumentException> { morseCode("hello ") }
            shouldThrow<IllegalArgumentException> { morseCode("hello.a") }
        }

        test("valid string") {
            morseCode("hello") shouldBe ".... . ._.. ._.. ___"
            morseCode("world") shouldBe ".__ ___ ._. ._.. _.."
        }
    }
})
