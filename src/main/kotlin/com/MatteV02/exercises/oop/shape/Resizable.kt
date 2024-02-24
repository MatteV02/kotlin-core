package com.MatteV02.exercises.oop.shape

/**
 * A shape is resizable when you can change its dimensions
 */
interface Resizable {
    /**
     * Scale the dimensions of the shape by the specified ratio
     * @param ratio the scale ratio
     * @throws IllegalArgumentException when ratio is negative
     */
    fun resize(ratio: Double)
}