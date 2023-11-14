package com.MatteV02.exercises.strings

import java.util.*

fun countYZ(string: String): Int {
    val stringScanner = Scanner(string)

    var count = 0

    for (noun in stringScanner) {
        val lowerCaseNoun = noun.lowercase()

        if (lowerCaseNoun.endsWith("y") || lowerCaseNoun.endsWith("z")) {
            count++
        }
    }

    return count
}