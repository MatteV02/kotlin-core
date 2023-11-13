package com.MatteV02.exercises.arrays

fun fizzBuzz(start: Int, end: Int): Array<String> {
    val returnArray = Array(end - start) { "" }

    for (i in start..<end) {
        val arrayIndex = i - start

        if (i % 3 == 0) {
            returnArray[arrayIndex] = "Fizz"
        }

        if (i % 5 == 0) {
            returnArray[arrayIndex] += "Buzz"
        }

        if (returnArray[arrayIndex] == "") {
            returnArray[arrayIndex] = i.toString()
        }
    }

    return returnArray
}