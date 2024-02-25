package com.MatteV02.exercises.collections

fun valuesKeys(map: Map<String, String>): Boolean {
    val keySet = map.keys
    val values = map.values

    return values.any { value -> keySet.contains(value) }
}