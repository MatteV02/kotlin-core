package com.MatteV02.exercises.collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class RecurringCharsKtTest : FunSpec({

    context("recurringChars") {
        test("Empty string") {
            recurringChars("") shouldBe emptySet()
        }

        test("No recurring chars") {
            recurringChars("Ciao, cmest?") shouldBe emptySet()
        }

        test("With recurring chars") {
            recurringChars("Ciao, come stai?") shouldBe setOf('a', 'i', 'o', ' ')
        }
    }
})
