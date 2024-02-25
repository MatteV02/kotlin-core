package com.MatteV02.exercises.collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class RemoveDuplicatesKtTest : FunSpec({

    context("removeDuplicates") {
        test("empty list") {
            removeDuplicates(emptyList()) shouldBe emptyList()
        }

        test("no duplicates") {
            removeDuplicates(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) shouldBe listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        }

        test("with duplicates") {
            removeDuplicates(listOf(1, 1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9)) shouldBe listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        }
    }
})
