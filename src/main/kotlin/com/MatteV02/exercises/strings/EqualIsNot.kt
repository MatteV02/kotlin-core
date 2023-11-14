package com.MatteV02.exercises.strings

fun equalIsNot(string: String): Boolean {
    fun count(string: String, search: String): Int {
        var returnCount = 0

        var lastIndex = 0

        while (true) {
            lastIndex = string.indexOf(search, lastIndex)
            if (lastIndex == -1) {
                break
            }
            lastIndex += search.length
            returnCount++
        }

        return returnCount
    }


    return count(string, "is") == count(string, "not")
}