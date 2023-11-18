package com.MatteV02.exercises.oop.basic.Circle

import java.awt.Point
import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

class Circle(var center: Point, radius: Int) {

    var radius: Int = 0
        set(value) {
            if (value < 0) {
                throw IllegalArgumentException("radius cannot be negative")
            }
            field = value
        }

    init {
        this.radius = radius
    }

    fun getPerimeter() = PI * 2 * radius

    fun getArea() = PI * radius.toDouble().pow(2)

    fun contains(point: Point) = sqrt(
        (center.getX() - point.getX()).pow(2) +
                (center.getY() - point.getY()).pow(2)
    ) <= radius

    fun translate(dx: Int, dy: Int) {
        center.translate(dx, dy)
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
        result = 31 * result + radius
        return result
    }

    override fun toString(): String {
        return "Circle(center=$center, radius=$radius)"
    }
}