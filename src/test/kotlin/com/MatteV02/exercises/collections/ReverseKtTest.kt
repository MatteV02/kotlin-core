package com.MatteV02.exercises.collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ReverseKtTest : FunSpec({

    test("reverse") {
        val emptyList = emptyList<String>()
        val mediumList =
            listOf("AKurx", "Yjpv5", "0qrUG", "Wv0jK", "N8GY8", "PAnCx", "kbbBi", "sZ4Z9", "i1wq8", "pIt2F")

        reverse(emptyList) shouldBe emptyList()
        reverse(mediumList) shouldBe listOf(
            "pIt2F",
            "i1wq8",
            "sZ4Z9",
            "kbbBi",
            "PAnCx",
            "N8GY8",
            "Wv0jK",
            "0qrUG",
            "Yjpv5",
            "AKurx",
        )
    }

})
