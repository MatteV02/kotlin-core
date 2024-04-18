package com.MatteV02.exercises.functional

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class PayMoreKtTest : FunSpec({

    test("increase fees") {
        val fees = mutableMapOf(
            Pair("34745949843", 11.75),
            Pair("33367849896", 9.75),
            Pair("34833687822", 7.75),
            Pair("33188178162", 7.75),
            Pair("33112872801", 7.95)
        )

        payMore(fees, "331", .5)

        fees shouldBe mapOf(
            Pair("34745949843", 11.75),
            Pair("33367849896", 9.75),
            Pair("34833687822", 7.75),
            Pair("33188178162", 8.25),
            Pair("33112872801", 8.45)
        )
    }

    test("no matches") {
        val fees = mutableMapOf(
            Pair("34745949843", 11.75),
            Pair("33367849896", 9.75),
            Pair("34833687822", 7.75),
            Pair("33188178162", 7.75),
            Pair("33112872801", 7.95)
        )

        payMore(fees, "330", .5)

        fees shouldBe mapOf(
            Pair("34745949843", 11.75),
            Pair("33367849896", 9.75),
            Pair("34833687822", 7.75),
            Pair("33188178162", 7.75),
            Pair("33112872801", 7.95)
        )
    }
})
