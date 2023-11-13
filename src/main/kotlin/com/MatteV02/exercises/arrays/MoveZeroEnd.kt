package com.MatteV02.exercises.arrays

fun moveZerosEnd(v: Array<Int>): Array<Int> {
    val returnArray = Array(v.size) { 0 }
    var returnArrayIndex = 0

    v.forEach { num ->
        if (num != 0) {
            returnArray[returnArrayIndex++] = num
        }
    }

    return returnArray
}