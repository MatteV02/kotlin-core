package com.MatteV02.exercises.oop.library

import java.time.LocalDate

/**
 * Represents a rent
 */
data class Rent(var begin: LocalDate, var end: LocalDate, var item: Item, var person: Person) {
    fun isExpired(date: LocalDate): Boolean {
        return date.isAfter(end)
    }

}