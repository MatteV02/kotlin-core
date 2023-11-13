package com.MatteV02.exercises.strings

fun removeFirstTwoChars(string: String): String {
    val returnString = StringBuilder()
    for (i in 2..string.lastIndex) {
        returnString.append(string[i])
    }
    return returnString.toString()
}