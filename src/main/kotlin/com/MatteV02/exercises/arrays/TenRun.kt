package com.MatteV02.exercises.arrays

fun tenRun(v: Array<Int>): Array<Int> {
    val returnArray = v.copyOf()

    var lastTenMultipleFound = 1

    for ((index, num) in returnArray.withIndex()) {
        if (num % 10 == 0) {
            lastTenMultipleFound = num
        } else returnArray[index] = if (lastTenMultipleFound == 1) returnArray[index] else lastTenMultipleFound
    }

    return returnArray
}