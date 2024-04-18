package com.MatteV02.exercises.generics

fun <T: Number> divide(a : T, b: T): Double {
    return a.toDouble() / b.toDouble()
}