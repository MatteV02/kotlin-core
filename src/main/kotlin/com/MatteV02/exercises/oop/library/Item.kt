package com.MatteV02.exercises.oop.library

/**
 * Represents a rentable item of the library
 */
abstract class Item(open var title: String, open var year: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Item) return false

        if (title != other.title) return false
        if (year != other.year) return false

        return true
    }

    override fun hashCode(): Int {
        var result = title.hashCode()
        result = 31 * result + year
        return result
    }

    override fun toString(): String {
        return "Item(title='$title', year=$year)"
    }
}