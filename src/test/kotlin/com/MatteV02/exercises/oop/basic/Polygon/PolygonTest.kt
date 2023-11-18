package com.MatteV02.exercises.oop.basic.Polygon

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe
import java.awt.Point

class PolygonTest : FunSpec({
    val polygon1 = Polygon(
        arrayOf(
            Point(0, 0),
            Point(1, 0),
            Point(1, 1),
            Point(0, 1),
        )
    )
    val polygon2 = Polygon(
        arrayOf(
            Point(0, 0),
            Point(6, 2),
            Point(0, 6),
            Point(-2, 4),
            Point(-2, 2)
        )
    )

    test("few vertices") {
        shouldThrow<IllegalArgumentException> {
            Polygon(arrayOf())
        }

        shouldThrow<IllegalArgumentException> {
            Polygon(arrayOf(Point(1, 1)))
        }

        shouldThrow<IllegalArgumentException> {
            Polygon(
                arrayOf(
                    Point(1, 1),
                    Point(0, 0)
                )
            )
        }
    }

    test("duplicated vertices") {
        shouldThrow<IllegalArgumentException> {
            Polygon(
                arrayOf(
                    Point(0, 0),
                    Point(1, 1),
                    Point(0, 0)
                )
            )
        }
    }

    test("getVerticesCount") {
        polygon1.getVerticesCount() shouldBe 4
        polygon2.getVerticesCount() shouldBe 5
    }

    test("getPerimeter") {
        polygon1.getPerimeter() shouldBe 4
        polygon2.getPerimeter() shouldBe (21.192_512 plusOrMinus 0.000_001)
    }

    test("getArea") {
        polygon1.getArea() shouldBe 1
        polygon2.getArea() shouldBe 26
    }
})
