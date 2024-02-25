package com.MatteV02.exercises.oop.phonebook

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import kotlin.random.Random
import kotlin.random.nextInt

class PhoneBookTest : FunSpec({
    var phoneBookArrayEmptySize = PhoneBookArray()
    var phoneBookArrayNormalSize = PhoneBookArray()
    var phoneBookArrayFullSize = PhoneBookArray()
    var phoneBookListEmptySize = PhoneBookList()
    var phoneBookListNormalSize = PhoneBookList()
    var phoneBookListFullSize = PhoneBookList()

    fun randomPerson(): Person {
        val randomGenerator = Random.Default
        val name = StringBuilder()
        val lastName = StringBuilder()
        val phone = StringBuilder()

        for (i in 1..10) {
            name.append(randomGenerator.nextInt(97..122).toChar())
            lastName.append(randomGenerator.nextInt(97..122).toChar())
        }

        name[0] = name[0].uppercaseChar()
        lastName[0] = lastName[0].uppercaseChar()

        for (i in 1..9) {
            phone.append(randomGenerator.nextInt(48..57).toChar())
        }

        return Person(name.toString(), lastName.toString(), phone.toString())
    }

    beforeEach {
        phoneBookArrayEmptySize = PhoneBookArray()
        phoneBookArrayNormalSize = PhoneBookArray()
        phoneBookArrayFullSize = PhoneBookArray()
        phoneBookListEmptySize = PhoneBookList()
        phoneBookListNormalSize = PhoneBookList()
        phoneBookListFullSize = PhoneBookList()
        val peopleList = listOf(
            Person("Tanit", "Pavoni", "985725396"),
            Person("Karel", "Ververs", "928806698"),
            Person("Zulfiqar", "Dìez", "477934805"),
            Person("Remo", "Abate", "990448858"),
            Person("Maurizio", "Antonelli", "370560436"),
            Person("Orsino", "Benedetti", "237454313"),
            Person("Benedetto", "Nieddu", "238193022"),
            Person("Gaspare", "Lando", "707019592"),
            Person("Fedora", "Confortola", "176974985"),
            Person("Gualtiero", "Marchegiano", "352229306"),
            Person("Maria Chiara", "Calvo", "770655060"),
            Person("Enrica", "De Santis", "988180885"),
            Person("Aronne", "Capitani", "665092853"),
            Person("Amore", "Aliprandi", "438322778"),
            Person("Pierina", "Agani", "810810078"),
            Person("Arrigo", "Abbate", "956964833"),
            Person("Santina", "Salvatici", "422750532"),
            Person("Teodosio", "Acconci", "958333603"),
            Person("Clarissa", "Panza", "415111391"),
            Person("Massimo", "Germano", "743199410"),
            Person("Nestore", "Tamboia", "173914893"),
            Person("Pia", "Tedesco", "657955343"),
            Person("Fiamma", "Lombardo", "303663248"),
            Person("Ruben", "Zanetti", "913535862")
        )

        for (person in peopleList) {
            phoneBookArrayNormalSize.addPerson(person)
            phoneBookArrayFullSize.addPerson(person)
            phoneBookListNormalSize.addPerson(person)
            phoneBookListFullSize.addPerson(person)
        }

        for (i in peopleList.size..256) {
            phoneBookArrayFullSize.addPerson(randomPerson())
            phoneBookListFullSize.addPerson(randomPerson())
        }
    }

    context("addPerson") {
        fun testInPhonebookWithEmptyCapacity(person: Person, expected : Boolean) {
            phoneBookListEmptySize.addPerson(person) shouldBe expected
            phoneBookListEmptySize.phoneBook.contains(person) shouldBe expected
            phoneBookArrayEmptySize.addPerson(person) shouldBe expected
            phoneBookArrayEmptySize.realArray().contains(person) shouldBe expected
        }

        fun testInPhonebookWithNormalCapacity(person: Person, expected : Boolean) {
            phoneBookArrayNormalSize.addPerson(person) shouldBe expected
            phoneBookArrayNormalSize.realArray().contains(person) shouldBe expected
            phoneBookListNormalSize.addPerson(person) shouldBe expected
            phoneBookListNormalSize.phoneBook.contains(person) shouldBe expected
        }

        fun testInPhonebookWithFullCapacity(person: Person, expected : Boolean) {
            phoneBookArrayFullSize.addPerson(person) shouldBe expected
            phoneBookArrayFullSize.realArray().contains(person) shouldBe expected

            phoneBookListFullSize.addPerson(person) shouldBe expected
            phoneBookListFullSize.phoneBook.contains(person) shouldBe expected
        }

        test("add non existing person in a phonebook with enough capacity") {
            testInPhonebookWithEmptyCapacity(Person("Arnoldo", "Breda", "880123589"), true)
            testInPhonebookWithNormalCapacity(Person("Arnoldo", "Breda", "880123589"), true)
        }

        test("add empty person in a phonebook with enough capacity") {
            testInPhonebookWithEmptyCapacity(Person("", "", ""), false)
            testInPhonebookWithNormalCapacity(Person("", "", ""), false)
        }

        test("add existing person in a phonebook with enough capacity") {
            val person = Person("Amore", "Aliprandi", "438322778")

            phoneBookArrayNormalSize.addPerson(person) shouldBe false
            phoneBookArrayNormalSize.realArray().contains(person) shouldBe true
            phoneBookListNormalSize.addPerson(person) shouldBe false
            phoneBookListNormalSize.phoneBook.contains(person) shouldBe true
        }

        test("add non existing person in phonebook with full capacity") {
            testInPhonebookWithFullCapacity(Person("Arnoldo", "Breda", "880123589"), false)
        }
    }

    context("removePerson") {
        fun testRemove(phoneBook: PhoneBook, person: Person, expected: Boolean) {
            phoneBook.removePerson(person) shouldBe expected
        }

        fun testPhoneBookContainsPerson(phoneBook: PhoneBook, person: Person, expected: Boolean) {
            when (phoneBook) {
                is PhoneBookArray -> {
                    phoneBook.realArray().contains(person) shouldBe expected
                }

                is PhoneBookList -> {
                    phoneBook.phoneBook.contains(person) shouldBe expected
                }

                else -> {
                    true shouldBe false
                }
            }
        }

        test("remove existing person") {
            val person = Person("Amore", "Aliprandi", "438322778")

            testRemove(phoneBookListNormalSize, person, true)
            testRemove(phoneBookArrayNormalSize, person, true)
            testRemove(phoneBookArrayFullSize, person, true)
            testRemove(phoneBookListFullSize, person, true)

            testPhoneBookContainsPerson(phoneBookListNormalSize, person, false)
            testPhoneBookContainsPerson(phoneBookArrayNormalSize, person, false)
            testPhoneBookContainsPerson(phoneBookListFullSize, person, false)
            testPhoneBookContainsPerson(phoneBookArrayFullSize, person, false)
        }

        test("remove non existing person from a phonebook with enough capacity") {
            val person = Person("Arnoldo", "Breda", "880123589")

            testRemove(phoneBookListNormalSize, person, false)
            testRemove(phoneBookArrayNormalSize, person, false)
            testRemove(phoneBookArrayFullSize, person, false)
            testRemove(phoneBookListFullSize, person, false)

            testPhoneBookContainsPerson(phoneBookListNormalSize, person, false)
            testPhoneBookContainsPerson(phoneBookArrayNormalSize, person, false)
            testPhoneBookContainsPerson(phoneBookListFullSize, person, false)
            testPhoneBookContainsPerson(phoneBookArrayFullSize, person, false)
        }

        test("remove empty person from a phonebook with enough capacity") {
            val person = Person("", "", "")

            testRemove(phoneBookListNormalSize, person, false)
            testRemove(phoneBookArrayNormalSize, person, false)
            testRemove(phoneBookArrayFullSize, person, false)
            testRemove(phoneBookListFullSize, person, false)

            testPhoneBookContainsPerson(phoneBookListNormalSize, person, false)
            testPhoneBookContainsPerson(phoneBookArrayNormalSize, person, false)
            testPhoneBookContainsPerson(phoneBookListFullSize, person, false)
            testPhoneBookContainsPerson(phoneBookArrayFullSize, person, false)
        }

        test("remove existing person from an empty phonebook") {
            val person = Person("Arnoldo", "Breda", "880123589")

            testRemove(phoneBookListEmptySize, person, false)
            testRemove(phoneBookArrayEmptySize, person, false)

            testPhoneBookContainsPerson(phoneBookArrayEmptySize, person, false)
            testPhoneBookContainsPerson(phoneBookListEmptySize, person, false)
        }
    }

    context("searchByLastname") {
        fun testSearch(lastName: String, expected: Array<Person>) {
            phoneBookArrayNormalSize.searchByLastname(lastName) shouldBe expected
            phoneBookListNormalSize.searchByLastname(lastName) shouldBe expected
        }

        test("search existing person") {
            val person = Person("Amore", "Aliprandi", "438322778")

            testSearch(person.lastname, arrayOf(person))
        }

        test("search non existing person") {
            val person = Person("Arnoldo", "Breda", "880123589")

            testSearch(person.lastname, emptyArray())
        }

        test("search empty person") {
            val person = Person("", "", "")

            testSearch(person.lastname, emptyArray())
        }
    }

    context("searchByNameAndLastname") {
        fun testSearch(name: String, lastName: String, expected: Array<Person>) {
            phoneBookArrayNormalSize.searchByNameAndLastname(name, lastName) shouldBe expected
            phoneBookListNormalSize.searchByNameAndLastname(name, lastName) shouldBe expected
        }

        test("search existing person") {
            val person = Person("Amore", "Aliprandi", "438322778")

            testSearch(person.name, person.lastname, arrayOf(person))
        }

        test("search person with empty name but existing surname") {
            val person = Person("", "Aliprandi", "438322778")

            testSearch(person.name, person.lastname, emptyArray())
        }

        test("search person with non existing name but existing surname") {
            val person = Person("Fedora", "Aliprandi", "438322778")

            testSearch(person.name, person.lastname, emptyArray())
        }

        test("search person with existing name but empty surname") {
            val person = Person("Amore", "", "438322778")

            testSearch(person.name, person.lastname, emptyArray())
        }

        test("search person with existing name but non existing surname") {
            val person = Person("Amore", "Tamboia", "438322778")

            testSearch(person.name, person.lastname, emptyArray())
        }
    }

})
