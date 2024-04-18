package com.MatteV02.exercises.generics

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class MapToPairsKtTest : FunSpec({

    test("empty map") {
        mapToPairs(emptyMap<Int, String>()) shouldBe emptyList()
    }

    test("filled map") {
        mapToPairs(mapOf(
            kotlin.Pair("Matteo", 10),
            kotlin.Pair("Luca", 20)
        )) shouldBe listOf(
            Pair("Matteo", 10),
            Pair("Luca", 20)
        )
    }

})
