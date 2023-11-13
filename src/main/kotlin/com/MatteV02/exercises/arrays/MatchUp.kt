package com.MatteV02.exercises.arrays

import kotlin.math.absoluteValue

fun matchUp(v1: Array<Int>, v2: Array<Int>): Int {
    if (v1.size != v2.size) {
        throw IllegalArgumentException("v1 and v2 should not have different sizes")
    }

    var returnValue = 0

    for (i in v1.indices) {
        if ((v1[i] - v2[i]).absoluteValue <= 2) {
            returnValue++
        }
    }

    return returnValue
}