package com.MatteV02.exercises.functional

fun noYY(strings : List<String>) : List<String> {
    return strings.map { str -> str + "y" }.filter { str -> !str.endsWith("yy") }
}