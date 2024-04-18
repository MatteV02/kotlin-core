package com.MatteV02.exercises.functional

fun oneTen(nums : List<Int>) : List<Int> {
    return nums.map { n -> (n + 1) * 10 }
}