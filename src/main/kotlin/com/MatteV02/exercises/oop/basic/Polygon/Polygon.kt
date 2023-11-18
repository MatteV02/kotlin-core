package com.MatteV02.exercises.oop.basic.Polygon

import java.awt.Point
import kotlin.math.absoluteValue
import kotlin.math.pow
import kotlin.math.sqrt

data class Polygon(val vertices: Array<Point>) {
    init {
        if (getVerticesCount() <= 2) {
            throw IllegalArgumentException("A polygon should have at least 3 vertices")
        }

        if (vertices.toSet().size != getVerticesCount()) {
            throw IllegalArgumentException("A polygon cannot have duplicated vertices")
        }
    }

    fun getVerticesCount() = vertices.size

    fun getPerimeter(): Double {
        var perimeter = 0.0

        for (i in vertices.indices) {
            val firstPoint = vertices[i]
            val secondPoint = vertices[(i + 1) % getVerticesCount()]

            perimeter += sqrt(
                (firstPoint.getX() - secondPoint.getX()).pow(2) + (firstPoint.getY() - secondPoint.getY()).pow(2)
            )
        }

        return perimeter
    }

    fun getArea(): Double {
        var area = 0.0

        for (i in vertices.indices) {
            val firstPoint = vertices[i]
            val secondPoint = vertices[(i + 1) % getVerticesCount()]

            area += secondPoint.getX() * firstPoint.getY() - secondPoint.getY() * firstPoint.getX()
        }

        return area.absoluteValue / 2
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Polygon

        return vertices.contentEquals(other.vertices)
    }

    override fun hashCode(): Int {
        return vertices.contentHashCode()
    }
}