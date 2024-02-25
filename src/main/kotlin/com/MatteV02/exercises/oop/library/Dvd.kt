package com.MatteV02.exercises.oop.library

/**
 * Represents a rentable DVD of the library
 */
data class Dvd(override var title: String, override var year: Int, var length: Int) : Item(title, year)