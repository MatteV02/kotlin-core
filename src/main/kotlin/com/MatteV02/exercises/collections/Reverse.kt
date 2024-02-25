package com.MatteV02.exercises.collections

fun reverse(sentence: List<String>): List<String> {
    val arrayDeque = ArrayDeque<String>()
    arrayDeque.addAll(sentence)

    val returnList = mutableListOf<String>()
    for (i in 1..sentence.size) {
        returnList.add(arrayDeque.removeLast())
    }

    return returnList
}