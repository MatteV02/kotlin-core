package com.MatteV02.exercises.generics

fun <T : Comparable<T>>  find(array: Array<T>, key: T): Int {
    if (array.isEmpty()) {
        return -1
    }

    if (!array.isSorted()) {
        throw IllegalArgumentException("The array is not sorted")
    }

    var begin = 0
    var end = array.lastIndex


    while (begin <= end) {
        val mid = (begin + end) / 2

        if (array[mid] < key) {
            begin = mid + 1
        } else if (array[mid] > key) {
            end = mid - 1
        } else {
            return mid
        }
    }

    return -1
}

private fun <T: Comparable<T>> Array<T>.isSorted(): Boolean {
    if (this.isEmpty()) {
        return true
    }

    var previous = this[0]
    forEach { t ->
        if (t < previous) {
            return false
        }

        previous = t
    }

    return true
}