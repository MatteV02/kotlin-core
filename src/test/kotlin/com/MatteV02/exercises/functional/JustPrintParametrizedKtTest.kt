package com.MatteV02.exercises.functional

import io.kotest.core.spec.style.FunSpec

class JustPrintParametrizedKtTest : FunSpec({

    test("justPrintParametrizedList") {
        val list = listOf("Marco", "Matteo", "Luca", "Giovanni")

        justPrintParametrizedList(list){s: String -> println("Hello $s!") }
    }

    test("justPrintParametrizedMap") {
        val map = mapOf(
            Pair(1, "nicola"),
            Pair(2, "agata"),
            Pair(3, "darma"),
            Pair(4, "marzia")
        )

        justPrintParametrizedMap(map){k, v -> println("k:$k, v:$v") }
    }
})
