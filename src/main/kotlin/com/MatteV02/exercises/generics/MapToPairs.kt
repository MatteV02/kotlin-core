package com.MatteV02.exercises.generics

fun <K, V> mapToPairs(src: Map<K, V>): List<Pair<K, V>> {
    val returnList = mutableListOf<Pair<K, V>>()
    src.entries.forEach{
        (key, value) -> returnList.add(Pair(key, value))
    }

    return returnList
}