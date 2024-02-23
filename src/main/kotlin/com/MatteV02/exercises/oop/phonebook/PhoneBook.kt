package com.MatteV02.exercises.oop.phonebook

interface PhoneBook {
    fun addPerson(person: Person) : Boolean
    fun removePerson(person: Person) : Boolean
    fun searchByLastname(searchLastname : String) : Array<Person>
    fun searchByNameAndLastname(searchName : String, searchLastname: String) : Array<Person>
}