package com.MatteV02.exercises.arrays

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class TenRunKtTest : FunSpec({

    context("tenRun") {
        data class TenRunInput(val v: Array<Int>) {
            override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (javaClass != other?.javaClass) return false

                other as TenRunInput

                return v.contentEquals(other.v)
            }

            override fun hashCode(): Int {
                return v.contentHashCode()
            }
        }

        withData(
            TenRunInput(arrayOf(2, 10, 3, 4, 20, 5)),
            TenRunInput(arrayOf(10, 1, 20, 2)),
            TenRunInput(arrayOf(10, 1, 9, 20))
        ) { (v) ->
            run {
                val returned = tenRun(v)
                var lastTenMultiple = 1
                for ((index, i) in returned.withIndex()) {
                    if (i % 10 == 0) {
                        lastTenMultiple = i
                    }
                    if (lastTenMultiple != 1) {
                        i shouldBe lastTenMultiple
                    } else {
                        i shouldBe v[index]
                    }
                }
            }
        }
    }
})
