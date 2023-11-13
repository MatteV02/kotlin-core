package com.MatteV02.exercises.strings

fun reverse(string: String): String {
    val returnString = StringBuilder()

    for (i in string.lastIndex downTo 0) {
        returnString.append(string[i])
    }

    return returnString.toString()
}