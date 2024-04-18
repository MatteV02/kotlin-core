package com.MatteV02.exercises.functional

fun squareFive(nums : List<Int>) : Int {
    return nums.map { n -> n * n + 10 }.count { n -> n % 10 != 5 }
}