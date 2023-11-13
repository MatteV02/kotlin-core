package com.MatteV02.exercises.warmup

import kotlin.math.absoluteValue
import kotlin.random.Random

fun main() {
    val random = Random.Default
    val randomPrice = random.nextInt(0, 101)


    print("User A choice: ")
    val userA = readln().toInt()

    print("User B choice: ")
    val userB = readln().toInt()

    val deltaA = (randomPrice - userA).absoluteValue
    val deltaB = (randomPrice - userB).absoluteValue

    print("Match result: ")
    if (deltaA == deltaB) {
        println("draw")
    } else if (deltaA < deltaB) {
        println("A wins!")
    } else {
        println("B wins")
    }
}