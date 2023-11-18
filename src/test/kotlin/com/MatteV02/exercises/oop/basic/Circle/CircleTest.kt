package com.MatteV02.exercises.oop.basic.Circle

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe
import java.awt.Point

class CircleTest : FunSpec({
    var circle1 = Circle(Point(0,0), 0)
    var circle2 = Circle(Point(0,0), 0)
    var circle3 = Circle(Point(0,0), 0)

    beforeEach {
        circle1 = Circle(Point(0,0), 1)
        circle2 = Circle(Point(0, 3), 3)
        circle3 = Circle(Point(-10, 5), 0)
    }

    test("setters") {
        val circle = Circle(Point(0,0), 0)
        circle.center = Point(10, 10)
        circle.radius = 1

        circle shouldBe Circle(Point(10, 10), 1)
    }

    test("radius cannot be null") {
        shouldThrow<IllegalArgumentException> {
            Circle(Point(0,0), -1)
        }
    }

    test("getPerimeter") {
        circle1.getPerimeter() shouldBe(6.28 plusOrMinus(0.01))
        circle2.getPerimeter() shouldBe(18.84 plusOrMinus(0.01))
        circle3.getPerimeter() shouldBe 0
    }

    test("getArea") {
        circle1.getArea() shouldBe(3.14 plusOrMinus 0.1)
        circle2.getArea() shouldBe(28.26 plusOrMinus 0.1)
        circle3.getArea() shouldBe 0
    }

    test("contains") {
        circle1.contains(Point(0, 2)) shouldBe false
        circle2.contains(Point(0,0)) shouldBe true
        circle2.contains(Point(0,1)) shouldBe true
        circle3.contains(Point(-10, 5)) shouldBe true
    }

    test("translate") {
        circle1.translate(1, -1)
        circle1.center shouldBe Point(1, -1)
    }
})
