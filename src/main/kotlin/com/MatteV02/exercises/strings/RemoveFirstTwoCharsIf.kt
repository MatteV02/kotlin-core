package com.MatteV02.exercises.strings

fun removeFirstTwoCharsIf(string: String): String {
    val returnString = StringBuilder(string)

    if (string.lastIndex >= 1 && string[1] != 'e') {
        returnString.delete(1, 2)
    }
    if (string.lastIndex >= 0 && string[0] != 'H') {
        returnString.delete(0, 1)
    }

    return returnString.toString()
}