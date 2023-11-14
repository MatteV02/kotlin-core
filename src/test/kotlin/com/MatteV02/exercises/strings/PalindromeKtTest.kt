package com.MatteV02.exercises.strings

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class PalindromeKtTest : FunSpec({
    data class PalindromeInput(val string: String)

    context("isPalindrome") {
        withData(
            PalindromeInput("whistleblower"),
            PalindromeInput("radar"),
            PalindromeInput("r"),
            PalindromeInput("")
        ) { (string: String) ->
            run {
                val returned = isPalindrome(string)

                returned shouldBe (string == string.reversed())
            }
        }
    }
})
