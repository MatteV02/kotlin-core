package com.MatteV02.exercises.oop.library

/**
 * Represents a rentable book of the library
 */
data class Book(override var title: String, override var year: Int, var pages: Int) : Item(title, year)