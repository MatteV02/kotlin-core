package com.MatteV02.exercises.warmup

import kotlin.math.PI
import kotlin.math.pow
import kotlin.random.Random

fun approximatePI(n: Int): Double {
	val random = Random.Default

	var c = 0

	for (i in 1..n) {
		val pointX = random.nextDouble(-1.0, 1.0)
		val pointY = random.nextDouble(-1.0, 1.0)

		if ((pointX.pow(2) + pointY.pow(2)).pow(1.0/2) <= 1) {
			c++
		}
	}

	return 4 * c.toDouble() / n
}

fun main() {
	var n = 250_000
	var approximatedPI = approximatePI(n)
	println("Approximation with n = $n: $approximatedPI; error = ${PI - approximatedPI}")

	n = 500_000
	approximatedPI = approximatePI(n)
	println("Approximation with n = $n: $approximatedPI; error = ${PI - approximatedPI}")

	n = 750_000
	approximatedPI = approximatePI(n)
	println("Approximation with n = $n: $approximatedPI; error = ${PI - approximatedPI}")

	n = 1_000_000
	approximatedPI = approximatePI(n)
	println("Approximation with n = $n: $approximatedPI; error = ${PI - approximatedPI}")
}