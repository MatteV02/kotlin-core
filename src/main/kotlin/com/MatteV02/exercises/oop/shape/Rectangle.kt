package com.MatteV02.exercises.oop.shape

import java.awt.Point
import kotlin.math.abs
import kotlin.math.roundToInt

/**
 * Concrete implementation of a rectangle
 */
@Suppress("unused")
class Rectangle : AbstractShape {

    /**
     * The bottom right vertex of the rectangle.
     * @throws IllegalArgumentException when it is set into a position that is incompatible with the upper left vertex
     */
    internal var bottomRight: Point = Point(Int.MAX_VALUE, Int.MIN_VALUE)
        set(value) {
            if (!checkVertices(value, upperLeft)) {
                throw IllegalArgumentException("Misplaced vertices")
            }
            field = value
        }

    /**
     * The upper left vertex of the rectangle.
     * @throws IllegalArgumentException when it is set into a position that is incompatible with the bottom right vertex
     */
    internal var upperLeft: Point = Point(Int.MAX_VALUE, Int.MAX_VALUE)
        set(value) {
            if (!checkVertices(bottomRight, value)) {
                throw IllegalArgumentException("Misplaced vertices")
            }
            field = value
        }

    constructor(color: String, id: String, bottomRight: Point, upperLeft: Point) : super(color, id) {
        this.bottomRight = bottomRight
        this.upperLeft = upperLeft
    }

    override fun getArea(): Double = height() * width()

    override fun getPerimeter(): Double = 2 * (height() + width())

    override fun move(vector: Point) {
        bottomRight.translate(vector.x, vector.y)
        upperLeft.translate(vector.x, vector.y)
    }

    /**
     * Scale the rectangle while keeping fixed the upper left vertex
     * @see Resizable.resize
     */
    override fun resize(ratio: Double) {
        if (ratio < 0) {
            throw IllegalArgumentException("negative ratio")
        }

        val scaledWidth = (this.width() * ratio).roundToInt()
        val scaledHeight = (this.height() * ratio).roundToInt()

        bottomRight.move(upperLeft.x + scaledHeight, upperLeft.y + scaledWidth)
    }

    fun getBottomRight() = bottomRight
    fun getUpperLeft() = upperLeft
    fun setBottomRight(bottomRight: Point) {
        this.bottomRight = bottomRight
    }
    fun setUpperLeft(upperLeft: Point) {
        this.upperLeft = upperLeft
    }

    /**
     * Compute the width of the rectangle
     * @return the width of the rectangle
     */
    private fun width(): Double = abs(bottomRight.getX() - upperLeft.getX())

    /**
     * Compute the height of the rectangle
     * @return the height of the rectangle
     */
    private fun height(): Double = abs(bottomRight.getY() - upperLeft.getY())
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Rectangle

        if (bottomRight != other.bottomRight) return false
        if (upperLeft != other.upperLeft) return false

        return true
    }

    override fun hashCode(): Int {
        var result = bottomRight.hashCode()
        result = 31 * result + upperLeft.hashCode()
        return result
    }

    override fun toString(): String {
        return "Rectangle(bottomRight=$bottomRight, upperLeft=$upperLeft)"
    }

    companion object {
        /**
         * Checks the correct placement of the vertices
         * @return true if the vertices are correctly set, false otherwise
         */
        private fun checkVertices(bottomRight: Point, upperLeft: Point): Boolean {
            return bottomRight.x >= upperLeft.x && bottomRight.y <= upperLeft.y
        }
    }

}