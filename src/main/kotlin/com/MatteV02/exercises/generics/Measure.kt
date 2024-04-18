package com.MatteV02.exercises.generics

interface Measurer<T> {
    fun measure(obj: T): Double
}

fun <T> max(array: Array<T>, measurer: Measurer<T>): T {
    return array.maxBy { t -> measurer.measure(t) }
}

fun <T> min(array: Array<T>, measurer: Measurer<T>): T {
    return array.minBy { t -> measurer.measure(t) }
}
