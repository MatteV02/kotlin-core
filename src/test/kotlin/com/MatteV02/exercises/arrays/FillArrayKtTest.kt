package com.MatteV02.exercises.arrays

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe

class FillArrayKtTest : FunSpec({
	context("fillArray") {
		data class FillArrayInput(val size: Int, val value: Double, val addNoise: Boolean)

		withData(
			FillArrayInput(3, 0.0, false),
			FillArrayInput(5, 1.0, false),
			FillArrayInput(5, 1.0, true),
			FillArrayInput(5,1.0,true),
			FillArrayInput(5,100.0, true)
		) {
			(size, value, addNoise) -> run {
				val returned = fillArray(size, value, addNoise)
				if (addNoise) {
					returned.forEach { num -> num.shouldBe(value plusOrMinus (0.05 * value)) }
				} else {
					returned.forEach { num -> num shouldBe value }
				}
			}
		}
	}
})
