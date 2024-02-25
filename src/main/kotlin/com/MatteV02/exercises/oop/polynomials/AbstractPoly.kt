package com.MatteV02.exercises.oop.polynomials

abstract class AbstractPoly : Poly {
    internal fun derive(): Array<Double> {
        val coefficients = coefficients()
        if (coefficients.size <= 1) {
            return emptyArray()
        }

        val returnArray = Array(coefficients.size - 1){ 0.0 }

        for ((index, coefficient) in coefficients.withIndex().filter { indexedValue -> indexedValue.index != 0 }) {
            returnArray[index - 1] = coefficient * index
        }

        return returnArray
    }

    abstract override fun equals(other: Any?): Boolean

    abstract override fun hashCode(): Int

    abstract override fun toString(): String

}