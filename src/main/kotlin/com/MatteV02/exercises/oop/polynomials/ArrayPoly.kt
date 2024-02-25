package com.MatteV02.exercises.oop.polynomials

import com.MatteV02.exercises.arrays.copyArray

class ArrayPoly(internal val coefficients: Array<Double>) : AbstractPoly() {
    override fun coefficient(n: Int): Double {
        return coefficients[n]
    }

    override fun coefficients(): Array<Double> {
        return copyArray(coefficients)
    }

    override fun degree(): Int {
        return coefficients.size - 1
    }

    override fun derivative(): Poly {
        return ArrayPoly(derive())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ArrayPoly

        return coefficients.contentEquals(other.coefficients)
    }

    override fun hashCode(): Int {
        return coefficients.contentHashCode()
    }

    override fun toString(): String {
        return "ArrayPoly(coefficients=${coefficients.contentToString()})"
    }
}