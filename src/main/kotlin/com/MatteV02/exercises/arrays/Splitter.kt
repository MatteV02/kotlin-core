package com.MatteV02.exercises.arrays

fun splitter(input: Int): Array<Int> {
    val inputString = input.toString()
    val returnArray = Array(inputString.length) {0}

    for ((index, c) in inputString.withIndex()) {
        returnArray[index] = c.digitToInt()
    }

    return returnArray
}