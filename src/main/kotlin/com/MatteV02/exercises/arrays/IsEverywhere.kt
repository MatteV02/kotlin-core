package com.MatteV02.exercises.arrays

fun isEverywhere(v: Array<Int>, value: Int): Boolean {
    v.forEachIndexed { index, num ->
        if (index != v.lastIndex && num != value && v[index + 1] != value) return false
    }
    return true
}