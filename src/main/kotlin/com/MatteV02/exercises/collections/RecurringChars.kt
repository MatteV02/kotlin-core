package com.MatteV02.exercises.collections

fun recurringChars(string: String): Set<Char> {
    val stringSet = mutableSetOf<Char>()
    val returnSet = mutableSetOf<Char>()

    for (c in string) {
        when (stringSet.contains(c)) {
            true -> returnSet.add(c)
            else -> stringSet.add(c)
        }
    }

    return returnSet
}