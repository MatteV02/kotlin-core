package com.MatteV02.exercises.oop.basic.ClickCounter

open class ClickCounter {
    var value = 0
        private set

    fun click() {
        value++
    }

    fun undo() {
        if (value > 0) {
            value--
        }
    }

    fun reset() {
        value = 0
    }
}