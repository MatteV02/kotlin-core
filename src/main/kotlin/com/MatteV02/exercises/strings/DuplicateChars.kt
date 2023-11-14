package com.MatteV02.exercises.strings

fun duplicateChars(string: String): Array<Char> {
    val charSet = mutableSetOf<Char>()

    string.forEachIndexed { index: Int, ch: Char ->
        if (string.substring((index + 1)..string.lastIndex).contains(ch)) {
            charSet.add(ch)
        }
    }

    return charSet.toTypedArray().sortedArray()
}