package com.MatteV02.exercises.strings

fun removeFirstLast(string: String): String {
    if (string.length <= 1 || string[0] != string[string.lastIndex]) {
        return string
    }

    return string.substring(1..<string.lastIndex)
}