package com.MatteV02.exercises.oop.polynomials

/**
 * Represents a polynomial which can perform common operations over its coefficients
 */
interface Poly {
    /**
     * @return The coefficient of the polynomial of n-th degree
     */
    fun coefficient(n: Int): Double

    /**
     * @return An array of Double containing all the coefficients
     */
    fun coefficients(): Array<Double>

    /**
     * @return The degree of the polynomial
     */
    fun degree(): Int

    /**
     * @return The derivative of this polynomial
     */
    fun derivative(): Poly
}