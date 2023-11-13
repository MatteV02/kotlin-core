package com.MatteV02.exercises.arrays

fun containsBruteForce(strings: Array<String>, searched: String): Boolean {
    strings.forEach { str -> if (str == searched) return true }
    return false
}

fun containsBinary(strings: Array<String>, searched: String): Boolean {
    val sortedStrings = strings.copyOf()
    sortedStrings.sort()


    fun containsBinaryRecursive(strings: Array<String>, searched: String, start: Int, end: Int): Boolean {
        if (start > end) {
            return false
        }

        val half = (start + end) / 2
        return if (strings[half] == searched) {
            true
        } else {
            containsBinaryRecursive(strings, searched, start, half - 1) ||
                    containsBinaryRecursive(strings, searched, half + 1, end)
        }
    }

    return containsBinaryRecursive(strings, searched, 0, strings.lastIndex)
}