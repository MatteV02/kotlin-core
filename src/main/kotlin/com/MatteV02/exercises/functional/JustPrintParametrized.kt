package com.MatteV02.exercises.functional

fun <T> justPrintParametrizedList(list: List<T>, printFunction : (T) -> Unit) {
    list.forEach(printFunction)
}

fun <K, V> justPrintParametrizedMap(map: Map<K, V>, printFunction : (K, V) -> Unit) {
    map.forEach(printFunction)
}