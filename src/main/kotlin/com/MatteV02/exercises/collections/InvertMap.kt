package com.MatteV02.exercises.collections

fun invertMap(src: Map<Int, String>): Map<String, Int> {
    val dst = mutableMapOf<String, Int>()

    src.forEach { (n, str) -> dst[str] = n }

    return dst
}