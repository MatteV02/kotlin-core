package com.MatteV02.exercises.oop.phonebook

class PhoneBookArray : PhoneBook {
    @Suppress("MemberVisibilityCanBePrivate")
    internal val phoneBookArray = Array(MAX_PERSONS){Person("", "", "")}

    private var size = 0

    internal fun realArray() = phoneBookArray.sliceArray(0..<size)

    override fun addPerson(person: Person): Boolean {
        if (size >= MAX_PERSONS || person == Person("", "", "")) {
            return false
        }

        if (!realArray().contains(person)) {
            phoneBookArray[size++] = person
            return true
        }
        return false
    }

    private fun shiftBackFromPosition(position : Int) {
        for (i in position ..<phoneBookArray.lastIndex) {
            phoneBookArray[i] = phoneBookArray[i + 1]
        }
    }

    override fun removePerson(person: Person): Boolean {
        val removeIndex = realArray().indexOf(person)
        if (removeIndex < 0) {
            return false
        }

        shiftBackFromPosition(removeIndex)
        size--
        return true
    }

    override fun searchByLastname(searchLastname: String): Array<Person> {
        return realArray().filter { person -> person.lastname == searchLastname }.toTypedArray()
    }

    override fun searchByNameAndLastname(searchName: String, searchLastname: String): Array<Person> {
        return realArray().filter { person -> person.name == searchName && person.lastname == searchLastname }.toTypedArray()
    }

    companion object {
        const val MAX_PERSONS = 256
    }
}