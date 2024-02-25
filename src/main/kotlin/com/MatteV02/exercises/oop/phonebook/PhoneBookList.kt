package com.MatteV02.exercises.oop.phonebook

class PhoneBookList : PhoneBook {
    internal val phoneBook = ArrayList<Person>(MAX_PERSONS)
    override fun addPerson(person: Person): Boolean {
        if (phoneBook.size >= MAX_PERSONS || person == Person("", "", "")) {
            return false
        }

        if (!phoneBook.contains(person)) {
            phoneBook.add(person)
            return true
        }

        return false
    }

    override fun removePerson(person: Person): Boolean {
        return phoneBook.remove(person)
    }

    override fun searchByLastname(searchLastname: String): Array<Person> {
        return phoneBook.filter { person -> searchLastname == person.lastname }.toTypedArray()
    }

    override fun searchByNameAndLastname(searchName: String, searchLastname: String): Array<Person> {
        return phoneBook.filter { person -> searchLastname == person.lastname && searchName == person.name }.toTypedArray()
    }

    companion object {
        const val MAX_PERSONS = 256
    }
}