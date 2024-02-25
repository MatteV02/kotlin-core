package com.MatteV02.exercises.oop.library

import java.time.LocalDate

class Library() {
    internal val rents = mutableSetOf<Rent>()

    fun addRent(rent: Rent): Boolean {
        return rents.add(rent)
    }

    fun removeRent(rent: Rent): Boolean {
        return rents.remove(rent)
    }

    fun getExpired(date: LocalDate): Set<Rent> {
        return rents
            .filter { rent -> rent.isExpired(date) }
            .toSet()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Library) return false

        if (rents != other.rents) return false

        return true
    }

    override fun hashCode(): Int {
        return rents.hashCode()
    }

    override fun toString(): String {
        return "Library(rents=$rents)"
    }

}
