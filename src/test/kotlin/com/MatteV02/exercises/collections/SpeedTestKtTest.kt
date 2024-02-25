package com.MatteV02.exercises.collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.comparables.shouldBeLessThan
import java.util.*

class SpeedTestKtTest : FunSpec({

    test("SpeedTest - insertBeginning") {
        val linkedList = LinkedList<String>()
        val arrayList = ArrayList<String>()

        val testString = "testString"
        val times = 1_000_000

        insertBeginning(linkedList, testString, times) shouldBeLessThan
                insertBeginning(arrayList, testString, times)
    }

    test("SpeedTest - insertEnd") {
        val linkedList = LinkedList<String>()
        val arrayList = ArrayList<String>()

        val testString = "testString"
        val times = 1_000_000

        insertEnd(arrayList, testString, times) shouldBeLessThan
                insertEnd(linkedList, testString, times)
    }

})
