package com.MatteV02.exercises.oop.reverse

class ReverserSlow : Reverser {
    override fun reverse(string: String): String {
        val array = string.toCharArray()
        array.reverse()

        return array.joinToString(separator = "")
    }
}