package com.MatteV02.exercises.generics

fun <E> iterableToString(src: Iterable<E>): String {
    val stringBuilder = StringBuilder()
    for (e in src) {
        stringBuilder.append(e).append(", ")
    }
    return stringBuilder.toString()
}