package com.MatteV02.exercises.generics

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class AppendKtTest : FunSpec({

    fun <T> testFunction(dst : MutableList<T>, src: List<T>): List<T> {
        append(dst, src)

        return dst
    }

    test("append") {
        testFunction(mutableListOf(), listOf(1, 2)) shouldBe listOf(1, 2)

        testFunction(mutableListOf(1, 2), emptyList()) shouldBe listOf(1, 2)

        testFunction(mutableListOf("a", "b"), listOf("c", "d")) shouldBe listOf("a", "b", "c", "d")
    }
})
