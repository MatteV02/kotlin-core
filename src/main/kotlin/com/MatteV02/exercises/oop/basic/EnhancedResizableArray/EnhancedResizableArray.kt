package com.MatteV02.exercises.oop.basic.EnhancedResizableArray

class EnhancedResizableArray {
    class NegativeIndexException : IllegalArgumentException("Index cannot be negative")

    private val DEFAULT_CAPACITY = 4

    private var array = Array(DEFAULT_CAPACITY) { 0 }

    fun get(index: Int): Int {
        if (index < 0) {
            throw NegativeIndexException()
        }
        return array[index]
    }

    fun set(index: Int, value: Int) {
        if (index < 0) {
            throw NegativeIndexException()
        }

        if (index >= length()) {
            val newArray = Array(index * 2) { 0 }
            array.copyInto(newArray)
            array = newArray
        }

        array[index] = value
    }

    fun contains(value: Int) = array.contains(value)

    fun fill(value: Int) {
        array.fill(value)
    }

    fun toArray(): Array<Int> = array.copyOf()

    fun length() = array.size
}