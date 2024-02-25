package com.MatteV02.exercises.collections

import java.time.LocalDate

data class Account(val amount: Double, val interestRate: Double, val duePayment: LocalDate)

fun sortByAmount(accounts: MutableList<Account>) {
    accounts.sortBy { account -> account.amount }
}

fun sortByInterestRate(accounts: MutableList<Account>) {
    accounts.sortBy { account -> account.interestRate }
}

fun sortByDuePayment(accounts: MutableList<Account>) {
    accounts.sortBy { account -> account.duePayment }
}