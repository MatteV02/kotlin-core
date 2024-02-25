package com.MatteV02.exercises.collections

import kotlin.math.roundToInt
import kotlin.math.sqrt

fun eratosthenes(n: Int): Set<Int> {
    if (n < 0) return emptySet()

    val returnSet = mutableSetOf<Int>()

    returnSet.addAll(1..n)

    for (i in 2..sqrt(n.toDouble()).roundToInt()) {
        returnSet.removeAll { num -> num != i && num % i == 0 }
    }

    return returnSet
}