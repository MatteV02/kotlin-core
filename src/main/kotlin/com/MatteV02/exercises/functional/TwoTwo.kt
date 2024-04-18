package com.MatteV02.exercises.functional

fun twoTwo(nums : List<Int>) : List<Int> {
    return nums.map { n -> n * 2 }.filter { n -> n % 10 != 2 }
}