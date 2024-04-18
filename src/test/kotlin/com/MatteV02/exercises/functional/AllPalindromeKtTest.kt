package com.MatteV02.exercises.functional

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class AllPalindromeKtTest : FunSpec({

    test("allPalindrome") {
        allPalindrome(listOf("kayak", "deed", "noon")) shouldBe true
        allPalindrome(listOf("kayak", "hello")) shouldBe false
        allPalindrome(listOf("hello", "world")) shouldBe false
    }
})
