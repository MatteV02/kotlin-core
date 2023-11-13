package com.MatteV02.exercises.arrays

fun fibonacci(n: Int): Array<Long> {
	if (n <= 0) {
		throw IllegalArgumentException("You cannot pass numbers lower than 1 to fibonacci algorithm")
	}
	var array = arrayOf(0L, 1L)

	for (i in 2..<n) {
		array += (array[i - 2] + array[i - 1])
	}

	return array.copyOfRange(0, n)
}