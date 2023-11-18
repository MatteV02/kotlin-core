package com.MatteV02.exercises.arrays

fun deepCopy(original: Array<Array<Int>>): Array<Array<Int>> {
    val returnArray = Array(original.size) { emptyArray<Int>() }

    for (i in original.indices) {
        returnArray[i] = original[i].copyOf()
    }

    return returnArray
}