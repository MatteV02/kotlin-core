package com.MatteV02.exercises.generics

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.ints.shouldBeLessThan
import io.kotest.matchers.shouldBe

class BinarySearchKtTest : FunSpec({

    test("valid tests") {
        find(arrayOf(0,1,2,3,4,5), 2) shouldBe 2
        find(arrayOf(0,1,2,3,4,5), 3) shouldBe 3
    }

    test("no matches") {
        find(arrayOf(0,1,2,3,4,5), -2) shouldBeLessThan 0
        find(arrayOf(0,1,2,3,4,5), 10) shouldBeLessThan 0
    }

    test("empty array") {
        find(emptyArray<Int>(), 5) shouldBeLessThan 0
    }

    test("not-sorted array") {
        shouldThrow<IllegalArgumentException> { find(array = arrayOf(5,3,8,4), 6) }
    }

})
