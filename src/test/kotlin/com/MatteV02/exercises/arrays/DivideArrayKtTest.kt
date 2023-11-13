package com.MatteV02.exercises.arrays

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class DivideArrayKtTest : FunSpec({
    context("divideArray") {
        data class DivideArrayInput(val v: Array<Double>, val factor: Double) {
            override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (javaClass != other?.javaClass) return false

                other as DivideArrayInput

                if (!v.contentEquals(other.v)) return false
                if (factor != other.factor) return false

                return true
            }

            override fun hashCode(): Int {
                var result = v.contentHashCode()
                result = 31 * result + factor.hashCode()
                return result
            }
        }

        withData(
            DivideArrayInput(arrayOf(1.0, 1.0, 1.0), 2.0),
            DivideArrayInput(arrayOf(2.0, 1.0, 1.0), 1.0),
            DivideArrayInput(arrayOf(10.0, 10.0), 10.0)
        ) { (v, factor) ->
            run {
                val returned = divideArray(v, factor)
                for (i in returned.indices) {
                    returned[i] shouldBe v[i] / factor
                }
            }
        }
    }
})
