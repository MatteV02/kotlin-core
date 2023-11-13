package com.MatteV02.exercises.arrays

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class CopyArrayKtTest : FunSpec({

	context("copyArray") {
		data class CopyArrayInput(val v: Array<Double>) {
			override fun equals(other: Any?): Boolean {
				if (this === other) return true
				if (javaClass != other?.javaClass) return false

				other as CopyArrayInput

				return v.contentEquals(other.v)
			}

			override fun hashCode(): Int {
				return v.contentHashCode()
			}
		}

		withData(
			CopyArrayInput(arrayOf(1.0,2.0,3.0)),
			CopyArrayInput(arrayOf(2.0,1.0,1.0))
		) {
			(v) ->	copyArray(v) shouldBe v
		}
	}
})
