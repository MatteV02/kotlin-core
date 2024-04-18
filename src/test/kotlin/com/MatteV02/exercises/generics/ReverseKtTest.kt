package com.MatteV02.exercises.generics

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ReverseKtTest : FunSpec({

    fun <T> testFunction(list: MutableList<T>) : List<T> {
        reverse(list)

        return list
    }

    test("numeric list") {
        testFunction(mutableListOf(1, 2)) shouldBe listOf(2,1)
    }

    test("long numeric list") {
        testFunction(mutableListOf(1,2,3,4)) shouldBe listOf(4,3,2,1)
    }

    test("string list") {
        testFunction(mutableListOf("hello", "world")) shouldBe listOf("world", "hello")
    }

    test("empty list") {
        testFunction(mutableListOf<String>()) shouldBe emptyList()
    }
})
