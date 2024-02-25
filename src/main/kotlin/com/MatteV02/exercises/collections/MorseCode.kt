package com.MatteV02.exercises.collections

fun morseCode(string: String): String {
    if (!string.all { c -> c.isLetter() }) throw IllegalArgumentException("invalid string passed to morseCode")

    val returnStringBuilder = StringBuilder()

    val morseMap = mapOf(
        Pair('A', "._"),
        Pair('B', "_..."),
        Pair('C', "_._."),
        Pair('D', "_.."),
        Pair('E', "."),
        Pair('F', ".._."),
        Pair('G', "__."),
        Pair('H', "...."),
        Pair('I', ".."),
        Pair('J', ".___"),
        Pair('K', "_._"),
        Pair('L', "._.."),
        Pair('M', "__"),
        Pair('N', "_."),
        Pair('O', "___"),
        Pair('P', ".__."),
        Pair('Q', "__._"),
        Pair('R', "._."),
        Pair('S', "..."),
        Pair('T', "_"),
        Pair('U', ".._"),
        Pair('V', "..._"),
        Pair('W', ".__"),
        Pair('X', "_.._"),
        Pair('Y', "_.__"),
        Pair('Z', "__.."),
    )

    for (c in string.uppercase()) {
        returnStringBuilder.append(morseMap[c]).append(' ')
    }

    return returnStringBuilder.trim().toString()
}