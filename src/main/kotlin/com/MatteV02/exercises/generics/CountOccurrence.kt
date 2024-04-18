package com.MatteV02.exercises.generics

fun <T> countOccurrences(src : Array<T?>, item: T?) : Int {
    var i = 0

    for (el in src) {
        if (el == item) {
            i++
        }
    }

    return i
}