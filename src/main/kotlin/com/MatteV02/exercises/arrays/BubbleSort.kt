package com.MatteV02.exercises.arrays

fun bubbleSort(v: Array<Int>) {
	var ordered = false
	while (!ordered) {
		ordered = true

		for (i in 0..<v.lastIndex) {
			if (v[i] > v[i + 1]) {
				ordered = false

				val temp = v[i]
				v[i] = v[i+1]
				v[i+1] = temp
			}
		}
	}
}

fun bubbleSortCopy(v: Array<Int>): Array<Int> {
	val array = v.copyOf()
	bubbleSort(array)

	return array
}