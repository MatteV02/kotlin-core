package com.MatteV02.exercises.functional

fun allPalindrome(strings : List<String>) : Boolean {
    return strings.all { s -> s.isPalindrome() }
}

private fun String.isPalindrome() = this == this.reversed()