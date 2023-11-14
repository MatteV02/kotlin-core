package com.MatteV02.exercises.strings

fun goodAroundTheBeginning(string: String): Boolean {
    return string.startsWith("good") || string.startsWith("good", startIndex = 1)
}