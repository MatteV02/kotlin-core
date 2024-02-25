package com.MatteV02.exercises.collections

import kotlin.time.Duration
import kotlin.time.measureTime

fun insertBeginning(list: MutableList<String>, item: String, times: Int): Duration {
    return measureTime {
        repeat(times) {
            list.add(0, item)
        }
    }
}

fun insertEnd(list: MutableList<String>, item: String, times: Int): Duration {
    return measureTime {
        repeat(times) {
            list.add(item)
        }
    }
}