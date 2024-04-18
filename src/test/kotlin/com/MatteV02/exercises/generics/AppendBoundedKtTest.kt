package com.MatteV02.exercises.generics

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class AppendBoundedKtTest : FunSpec({

    open class Person(val name: String, val surname: String) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other !is Person) return false

            if (name != other.name) return false
            if (surname != other.surname) return false

            return true
        }

        override fun hashCode(): Int {
            var result = name.hashCode()
            result = 31 * result + surname.hashCode()
            return result
        }
    }

    class Student(name: String, surname: String, val mat: String): Person(name, surname) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other !is Student) return false
            if (!super.equals(other)) return false

            if (mat != other.mat) return false

            return true
        }

        override fun hashCode(): Int {
            var result = super.hashCode()
            result = 31 * result + mat.hashCode()
            return result
        }
    }

    test("appendBounded") {
        val mutableList = mutableListOf(
            Person("Marco", "Pini"),
            Person("Carla", "Ricciardi"),
        )
        val list = listOf(
            Student("Matteo", "Veroni", "984651234")
        )

        appendBounded(mutableList, list)
        mutableList shouldBe listOf(
            Person("Marco", "Pini"),
            Person("Carla", "Ricciardi"),
            Student("Matteo", "Veroni", "984651234")
        )
    }
})
