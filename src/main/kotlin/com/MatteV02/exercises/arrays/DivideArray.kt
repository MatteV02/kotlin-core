package com.MatteV02.exercises.arrays

fun divideArray(v: Array<Double>, factor: Double): Array<Double> {
	var copy = v.copyOf()
	copy = copy.map { num -> num / factor }.toTypedArray()

	return copy
}