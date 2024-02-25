package com.MatteV02.exercises.collections

fun removeDuplicates(list: List<Int>): List<Int> {
    return list.toSet().toList()
}