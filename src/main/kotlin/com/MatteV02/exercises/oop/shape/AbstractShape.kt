package com.MatteV02.exercises.oop.shape

abstract class AbstractShape : Computable, Movable, Resizable {
    /**
     * The color of the shape. It must follow the RGB Web Standard #RRGGBB
     * @see checkColor
     * @throws IllegalArgumentException when the color is wrongly formatted
     */
    @Suppress("MemberVisibilityCanBePrivate")
    internal var color: String = "#FFFFFF"
        set(value) {
            if (!checkColor(value)) {
                throw IllegalArgumentException("Wrong color format")
            }
            field = value
        }

    /**
     * The id of the shape
     */
    @Suppress("MemberVisibilityCanBePrivate")
    internal var id: String

    constructor(color: String, id: String) {
        this.color = color
        this.id = id
    }

    @Suppress("unused")
    fun getColor(): String = color

    @Suppress("unused")
    fun getId(): String = id

    fun setColor(color: String) {
        this.color = color
    }

    fun setId(id: String) {
        this.id = id
    }

    companion object {
        /**
         * Checks if the color matches the RGB Web Standard #RRGGBB
         * @see <a href="https://en.wikipedia.org/wiki/Web_colors">wiki</a>
         */
        private fun checkColor(color: String): Boolean {
            return color.matches(Regex("#\\p{XDigit}{6}"))
        }
    }
}