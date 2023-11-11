package com.MatteV02.exercises.warmup

fun main() {
	var balance = 1000.0
	val interestRate = 0.05
	val yearList = listOf("first", "second", "third")

	println("Initial balance = $balance")
	for (i in yearList.indices) {
		balance *= 1 + interestRate
		println("Balance after ${yearList[i]} year = $balance")
	}
}