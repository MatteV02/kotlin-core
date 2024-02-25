package com.MatteV02.exercises.oop.polynomials

class ListPoly(coefficients: Array<Double>) : AbstractPoly() {
    internal val coefficients: ArrayList<Double> = arrayListOf()

    init {
        this.coefficients.addAll(coefficients)
    }

    override fun coefficient(n: Int): Double {
        return coefficients[n]
    }

    override fun coefficients(): Array<Double> {
        return coefficients.toTypedArray()
    }

    override fun degree(): Int {
        return coefficients.size - 1
    }

    override fun derivative(): Poly {
        return ListPoly(derive())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ListPoly

        return coefficients == other.coefficients
    }

    override fun hashCode(): Int {
        return coefficients.hashCode()
    }

    override fun toString(): String {
        return "ListPoly(coefficients=$coefficients)"
    }
}