package com.MatteV02.exercises.generics

data class PairSameType<T>(var key : T, var value: T) {

    fun swap() {
        val tmp = value
        value = key
        key = tmp
    }
}