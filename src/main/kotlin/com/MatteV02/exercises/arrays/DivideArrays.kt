package com.MatteV02.exercises.arrays

fun divideArrays(v1: Array<Double>, v2: Array<Double>): Array<Double>? {
	if (v1.size != v2.size) {
		return null
	}

	var returnArray = v1.copyOf()
	returnArray = returnArray.mapIndexed {index, num -> num / v2[index] }.toTypedArray()

	return returnArray
}