package com.MatteV02.exercises.generics

fun <K, V> swap(src : Pair<K, V>): Pair<V, K> {
    return Pair(src.value, src.key)
}