package com.MatteV02.exercises.functional

fun payMore(fees: MutableMap<String, Double>, numberFamily: String, costDelta: Double) {
    fees.filter { (number) -> number.startsWith(numberFamily) }.forEach { (number, fee) -> fees[number] = fee + costDelta}
}