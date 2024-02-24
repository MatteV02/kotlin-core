package com.MatteV02.exercises.oop.shape

import java.awt.Point

/**
 * A shape is movable when you can change its location
 */
interface Movable {
    /**
     * Moves the shape by the specified vector
     * @param vector the displacement vector
     */
    fun move(vector: Point)
}