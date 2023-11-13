package com.MatteV02.exercises.warmup

import kotlin.random.Random

fun main() {
    val random = Random.Default
    val computerChoice = random.nextInt(0, 4)

    var userChoice: Int
    do {
        print("Insert a number between 0 and 3: ")
        userChoice = readln().toInt()
        if (userChoice !in 0..3) {
            throw RuntimeException("You can only insert number in [0,3] range")
        }
    } while (userChoice != computerChoice)

    println("User found the right answer!")
}