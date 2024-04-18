package com.MatteV02.exercises.functional

fun noTeen(nums : List<Int>) : List<Int> {
    return nums.filter { num -> num !in 13..19 }
}