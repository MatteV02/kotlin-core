package com.MatteV02.exercises.generics

fun <T> append(dst : MutableList<T>, src : List<T>) {
    dst.addAll(src)
}