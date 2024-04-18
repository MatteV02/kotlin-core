package com.MatteV02.exercises.functional

import io.kotest.core.spec.style.FunSpec

class JustPrintKtTest : FunSpec({

    test("justPrintList") {
        val list = listOf("Marco", "Matteo", "Luca", "Giovanni")

        justPrintList(list)
    }

    test("justPrintMap") {
        val map = mapOf(
            Pair(1, "nicola"),
            Pair(2, "agata"),
            Pair(3, "darma"),
            Pair(4, "marzia")
        )

        justPrintMap(map)
    }
})
