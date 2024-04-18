package com.MatteV02.exercises.functional

fun <T> justPrintList(list: List<T>) {
    list.forEach { t -> println("Hello $t!") }
}

fun <K, V> justPrintMap(map: Map<K, V>) {
    map.forEach { (k, v)  -> println("k:$k, v:$v")}
}