package com.MatteV02.exercises.arrays

import kotlin.random.Random

fun fillArray(size: Int, value: Double, addNoise: Boolean): Array<Double> {
    var returnArray = Array(size) { value }

    if (addNoise) {
        val randomGenerator = Random.Default
        returnArray = returnArray.map { randomGenerator.nextDouble(value * 0.95, value * 1.05) }.toTypedArray()
    }

    return returnArray
}
