package com.MatteV02.exercises.oop.shape

import java.awt.Point
import kotlin.math.PI

/**
 * Concrete implementation of a circle
 */
@Suppress("unused")
class Circle : AbstractShape {
    /**
     * The center of the circle
     */
    internal var center: Point

    /**
     * The radius of the circle. It cannot be negative.
     * @throws IllegalArgumentException when a procedure tries to set radius to a negative value
     */
    internal var radius: Double = 0.0
        set(value) {
            if (value < 0) {
                throw IllegalArgumentException("negative radius")
            }
            field = value
        }

    constructor(color: String, id: String, center: Point, radius: Double) : super(color, id) {
        this.center = center
        this.radius = radius
    }

    override fun getArea(): Double = PI * radius * radius

    override fun getPerimeter(): Double = 2 * PI * radius

    override fun move(vector: Point) {
        center.translate(vector.x, vector.y)
    }

    override fun resize(ratio: Double) {
        if (ratio < 0) {
            throw IllegalArgumentException("negative ratio")
        }
        radius *= ratio
    }

    fun getCenter(): Point = center
    fun getRadius(): Double = radius
    fun setCenter(center: Point) {
        this.center = center
    }
    fun setRadius(radius: Double) {
        this.radius = radius
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Circle

        if (center != other.center) return false
        if (radius != other.radius) return false

        return true
    }

    override fun hashCode(): Int {
        var result = center.hashCode()
        result = 31 * result + radius.hashCode()
        return result
    }

    override fun toString(): String {
        return "Circle(center=$center, radius=$radius)"
    }

}