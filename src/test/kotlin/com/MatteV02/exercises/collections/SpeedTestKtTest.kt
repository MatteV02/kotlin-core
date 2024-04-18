package com.MatteV02.exercises.collections

import io.kotest.core.spec.style.FunSpec
import java.util.*

class SpeedTestKtTest : FunSpec({

    test("SpeedTest - insertBeginning") {
        val linkedList = LinkedList<String>()
        val arrayList = ArrayList<String>()

        val testString = "testString"
        val times = 100_000

        println("\nSpeedTest - insertBeginning\nArrayList: ${insertBeginning(arrayList, testString, times)}" +
                "\nLinkedList: ${insertBeginning(linkedList, testString, times)}")
    }

    test("SpeedTest - insertEnd") {
        val linkedList = LinkedList<String>()
        val arrayList = ArrayList<String>()

        val testString = "testString"
        val times = 100_000

        println("\nSpeedTest - insertEnd\nArrayList: ${insertEnd(arrayList, testString, times)}" +
                "\nLinkedList: ${insertEnd(linkedList, testString, times)}")
    }

})
