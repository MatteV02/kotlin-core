package com.MatteV02.exercises.oop.basic.ClickCounter

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ClickCounterTest : FunSpec({
    var clickCounter = ClickCounter()

    beforeEach {
        clickCounter = ClickCounter()
    }


    test("click") {
        clickCounter.click()
        clickCounter.value shouldBe 1
    }

    test("undo") {
        clickCounter.click()
        clickCounter.undo()
        clickCounter.value shouldBe 0
        clickCounter.undo()
        clickCounter.value shouldBe 0
    }

    test("reset") {
        clickCounter.click()
        clickCounter.click()
        clickCounter.reset()
        clickCounter.value shouldBe 0
    }
})
