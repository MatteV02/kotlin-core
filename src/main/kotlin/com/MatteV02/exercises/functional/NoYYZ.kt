package com.MatteV02.exercises.functional

fun noYYZ(strings : List<String>) : List<String> {
    return strings.map { str -> str + "y" }.filter { str -> !str.endsWith("yy") || str.startsWith("z") }
}