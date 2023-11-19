package com.MatteV02.exercises.oop.basic.Letter

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class LetterTest : FunSpec({

    test("letter test - 1") {
        val letter = Letter("me", "myself")
        letter.from shouldBe "me"
        letter.to shouldBe "myself"

        letter.addLine("Hello, how are you?")
        letter.addLine("Personally, I'm fine. Everything seems to go well so let's go on")

        letter.getText() shouldBe "Hello, how are you?\nPersonally, I'm fine. Everything seems to go well so let's go on\n"
    }
})
