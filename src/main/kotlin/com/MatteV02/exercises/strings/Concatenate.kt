package com.MatteV02.exercises.strings

fun concatenate(strings: Array<String>): String {
    val returnString = StringBuilder()

    strings.forEach { str -> returnString.append(str) }

    return returnString.toString()
}