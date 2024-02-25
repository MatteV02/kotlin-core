package com.MatteV02.exercises.collections

fun intersection(first: Set<Int>, second: Set<Int>): Set<Int> {
    val returnSet = mutableSetOf<Int>()

    for (num in first) {
        if (second.contains(num)) {
            returnSet.add(num)
        }
    }

    return returnSet
}