package com.MatteV02.exercises.generics

fun <T> appendBounded(dst : MutableList<T>, src : List<out T>) {
    dst.addAll(src)
}