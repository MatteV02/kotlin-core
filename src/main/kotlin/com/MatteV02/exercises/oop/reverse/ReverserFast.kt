package com.MatteV02.exercises.oop.reverse

class ReverserFast : Reverser {
    override fun reverse(string: String): String {
        val stringBuilder = StringBuilder(string)
        stringBuilder.reverse()

        return stringBuilder.toString()
    }
}