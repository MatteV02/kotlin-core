package com.MatteV02.exercises.arrays

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class BubbleSortKtTest : FunSpec({
	data class BubbleSortInput(val v: Array<Int>) {
		override fun equals(other: Any?): Boolean {
			if (this === other) return true
			if (javaClass != other?.javaClass) return false

			other as BubbleSortInput

			return v.contentEquals(other.v)
		}

		override fun hashCode(): Int {
			return v.contentHashCode()
		}
	}

	var bubbleSortInput = emptyList<BubbleSortInput>()

	beforeAny {
		bubbleSortInput = listOf(
			BubbleSortInput(arrayOf(6, 3, 4, 2)),
			BubbleSortInput(arrayOf(9, 8, 7, 4)),
			BubbleSortInput(arrayOf(1, 0, 0, 0))
		)
	}

	context("bubbleSort") {
		withData(bubbleSortInput) { (v) ->
			run {
				val arrayCopy = v.copyOf().sortedArray()
				bubbleSort(v)
				v shouldBe arrayCopy
			}
		}
	}

	context("bubbleSortCopy") {
		withData(bubbleSortInput) {
			(v) ->
				run {
					bubbleSortCopy(v) shouldBe v.sortedArray()
				}
		}
	}
})
