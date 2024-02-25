package com.MatteV02.exercises.collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import java.time.LocalDate

class SortAccountKtTest : FunSpec({
    val mediumAccountListContent = listOf(
        Account(10.0, 20.0, LocalDate.of(2024, 2, 25)),
        Account(1.0, 2.0, LocalDate.of(2023, 1, 1)),
        Account(0.01, 100.0, LocalDate.of(2023, 2, 1)),
        Account(70.0, 0.01, LocalDate.of(2025, 1, 1)),
        Account(42.0, 0.02, LocalDate.of(2021, 1, 1)),
        Account(1.0, 2.0, LocalDate.of(2023, 1, 1)),
        Account(1000.0, 2.0, LocalDate.of(2023, 1, 1)),
        Account(1.0, 15.0, LocalDate.of(2023, 1, 1)),
        Account(1.0, 2.0, LocalDate.of(2024, 1, 1)),
        Account(76.0, 14.1, LocalDate.of(2011, 1, 1))
    )

    val emptyAccountList = mutableListOf<Account>()
    val mediumAccountList = mutableListOf<Account>()

    beforeEach {
        emptyAccountList.removeAll(emptyAccountList)
        mediumAccountList.removeAll(mediumAccountList)
        mediumAccountList.addAll(mediumAccountListContent)
    }

    test("sortByAmount") {
        sortByAmount(emptyAccountList)
        emptyAccountList shouldBe emptyList()

        sortByAmount(mediumAccountList)
        mediumAccountList shouldBe listOf(
            Account(0.01, 100.0, LocalDate.of(2023, 2, 1)),
            Account(1.0, 2.0, LocalDate.of(2023, 1, 1)),
            Account(1.0, 2.0, LocalDate.of(2023, 1, 1)),
            Account(1.0, 15.0, LocalDate.of(2023, 1, 1)),
            Account(1.0, 2.0, LocalDate.of(2024, 1, 1)),
            Account(10.0, 20.0, LocalDate.of(2024, 2, 25)),
            Account(42.0, 0.02, LocalDate.of(2021, 1, 1)),
            Account(70.0, 0.01, LocalDate.of(2025, 1, 1)),
            Account(76.0, 14.1, LocalDate.of(2011, 1, 1)),
            Account(1000.0, 2.0, LocalDate.of(2023, 1, 1)),
        )
    }

    test("sortByInterestRate") {
        sortByInterestRate(emptyAccountList)
        emptyAccountList shouldBe emptyList()

        sortByInterestRate(mediumAccountList)
        mediumAccountList shouldBe listOf(
            Account(70.0, 0.01, LocalDate.of(2025, 1, 1)),
            Account(42.0, 0.02, LocalDate.of(2021, 1, 1)),
            Account(1.0, 2.0, LocalDate.of(2023, 1, 1)),
            Account(1.0, 2.0, LocalDate.of(2023, 1, 1)),
            Account(1000.0, 2.0, LocalDate.of(2023, 1, 1)),
            Account(1.0, 2.0, LocalDate.of(2024, 1, 1)),
            Account(76.0, 14.1, LocalDate.of(2011, 1, 1)),
            Account(1.0, 15.0, LocalDate.of(2023, 1, 1)),
            Account(10.0, 20.0, LocalDate.of(2024, 2, 25)),
            Account(0.01, 100.0, LocalDate.of(2023, 2, 1))
        )
    }

    test("sortByDuePayment") {
        sortByDuePayment(emptyAccountList)
        emptyAccountList shouldBe emptyList()

        sortByDuePayment(mediumAccountList)
        mediumAccountList shouldBe listOf(
            Account(76.0, 14.1, LocalDate.of(2011, 1, 1)),
            Account(42.0, 0.02, LocalDate.of(2021, 1, 1)),
            Account(1.0, 2.0, LocalDate.of(2023, 1, 1)),
            Account(1.0, 2.0, LocalDate.of(2023, 1, 1)),
            Account(1000.0, 2.0, LocalDate.of(2023, 1, 1)),
            Account(1.0, 15.0, LocalDate.of(2023, 1, 1)),
            Account(0.01, 100.0, LocalDate.of(2023, 2, 1)),
            Account(1.0, 2.0, LocalDate.of(2024, 1, 1)),
            Account(10.0, 20.0, LocalDate.of(2024, 2, 25)),
            Account(70.0, 0.01, LocalDate.of(2025, 1, 1))
        )
    }
})
