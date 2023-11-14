package com.MatteV02.exercises.strings

fun sumDigits(string: String): Int {
    var sum = 0

    string.forEach { ch: Char ->
        if (ch.isDigit()) {
            sum += ch.digitToInt()
        }
    }

    return sum
}