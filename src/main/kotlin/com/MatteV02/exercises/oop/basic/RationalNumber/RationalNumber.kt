package com.MatteV02.exercises.oop.basic.RationalNumber

import kotlin.math.absoluteValue
import kotlin.math.max
import kotlin.math.min

class RationalNumber(numerator: Int, denominator: Int) {
    var numerator: Int = numerator
        private set
    var denominator: Int = denominator
        private set

    init {
        if (this.denominator == 0) {
            throw IllegalArgumentException("Denominator of a rational number cannot be 0")
        }
        @Suppress("LocalVariableName") val GCD = greatestCommonDivisor(numerator, denominator)
        this.numerator /= GCD
        this.denominator /= GCD
    }

    fun add(o: RationalNumber): RationalNumber {
        val returnDenominator = leastCommonMultiple(this.denominator, o.denominator)
        val returnNumerator = this.numerator * this.denominator / returnDenominator +
                o.numerator * o.denominator / returnDenominator

        return RationalNumber(returnNumerator, returnDenominator)
    }

    fun multiply(o: RationalNumber): RationalNumber {
        return RationalNumber(this.numerator * o.numerator, this.denominator * o.denominator)
    }

    private fun greatestCommonDivisor(a: Int, b: Int): Int {
        if (a == 0) {
            if (b == 0) {
                throw IllegalArgumentException("cannot pass (0,0) to greatestCommonDivisor")
            }
            return b
        }

        if (b == 0) {
            return a
        }

        val max = max(a, b)
        val min = min(a, b)

        val rest = max % min
        return if (max % min == 0) {
            min
        } else {
            greatestCommonDivisor(min, rest)
        }
    }

    private fun leastCommonMultiple(a: Int, b: Int): Int {
        return (a * b).absoluteValue / greatestCommonDivisor(a, b)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as RationalNumber

        if (numerator != other.numerator) return false
        if (denominator != other.denominator) return false

        return true
    }

    override fun hashCode(): Int {
        var result = numerator
        result = 31 * result + denominator
        return result
    }

    override fun toString(): String {
        return "RationalNumber(numerator=$numerator, denominator=$denominator)"
    }
}