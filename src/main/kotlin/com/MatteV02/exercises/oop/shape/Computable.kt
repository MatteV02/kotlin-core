package com.MatteV02.exercises.oop.shape

/**
 * A shape is computable when you can compute its area and its perimeter
 */
interface Computable {
    /**
     * Computes the area of the shape
     * @return The area of the shape
     */
    fun getArea(): Double

    /**
     * Computes the perimeter of the shape
     * @return The perimeter of the shape
     */
    fun getPerimeter(): Double
}