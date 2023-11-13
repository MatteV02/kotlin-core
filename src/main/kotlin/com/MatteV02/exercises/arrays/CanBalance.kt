package com.MatteV02.exercises.arrays

fun canBalance(v: Array<Int>): Boolean {
    if (v.isEmpty()) {
        throw IllegalArgumentException("Expected ")
    }

    for (i in 1..v.lastIndex) {
        val firstSlice = v.slice(0..<i)
        val secondSlice = v.slice(i..v.lastIndex)

        if (firstSlice.sum() == secondSlice.sum()) {
            return true
        }
    }

    return false
}