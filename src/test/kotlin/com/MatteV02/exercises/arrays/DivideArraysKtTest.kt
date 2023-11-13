package com.MatteV02.exercises.arrays

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

data class DivideArrayInput(val v1: Array<Double>, val v2: Array<Double>) {
	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (javaClass != other?.javaClass) return false

		other as DivideArrayInput

		if (!v1.contentEquals(other.v1)) return false
		if (!v2.contentEquals(other.v2)) return false

		return true
	}

	override fun hashCode(): Int {
		var result = v1.contentHashCode()
		result = 31 * result + v2.contentHashCode()
		return result
	}
}

class DivideArraysKtTest : FunSpec({

	context("divideArrays") {
		withData(
			DivideArrayInput(arrayOf(1.0, 1.0, 1.0), arrayOf(3.0, 3.0, 3.0)),
			DivideArrayInput(arrayOf(2.0, 1.0, 1.0), arrayOf(10.0, 10.0, 10.0)),
			DivideArrayInput(arrayOf(10.0, 10.0), arrayOf(5.0, 5.0)),
			DivideArrayInput(arrayOf(10.0, 10.0), arrayOf(5.0))
		) { (v1, v2) ->
			run {
				val returned = divideArrays(v1, v2)

				returned?.forEachIndexed { index, num -> num shouldBe v1[index] / v2[index] }
					?: (v1.size shouldNotBe v2.size)
			}
		}
	}
})
