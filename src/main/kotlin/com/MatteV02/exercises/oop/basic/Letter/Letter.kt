package com.MatteV02.exercises.oop.basic.Letter

class Letter(val from: String, val to: String) {
    private val content = StringBuilder()

    fun addLine(line: String) {
        content.append(line + "\n")
    }

    fun getText(): String {
        return content.toString()
    }
}