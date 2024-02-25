package com.MatteV02.exercises.collections

fun downsize(list: MutableList<String>, n: Int) {
    if (n <= 0) return

    for (i in list.indices.reversed()) {
        if ((i + 1) % n == 0) {
            list.removeAt(i)
        }
    }
}