package com.MatteV02.exercises.oop.basic.BankAccount

class BankAccount {
    class NegativeBalanceException : IllegalArgumentException("Balance of a BankAccount cannot be negative")
    class DepositNegativeAmountException : IllegalArgumentException("Cannot deposit a negative amount")
    class WithdrawNegativeAmountException : IllegalArgumentException("Cannot withdraw a negative amount")
    class WithdrawAmountGreaterThanBalanceException :
        IllegalArgumentException("You tried to withdraw an amount greater than your balance")


    constructor(balance: Double = 0.0) {
        this.balance = balance
    }

    var balance = 0.0
        private set(value) {
            if (value < 0) {
                throw NegativeBalanceException()
            }
            field = value
        }

    fun deposit(amount: Double) {
        if (amount < 0) {
            throw DepositNegativeAmountException()
        }

        balance += amount
    }

    fun withdraw(amount: Double) {
        if (amount < 0) {
            throw WithdrawNegativeAmountException()
        }

        try {
            balance -= amount
        } catch (e: NegativeBalanceException) {
            throw WithdrawAmountGreaterThanBalanceException()
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as BankAccount

        return balance == other.balance
    }

    override fun hashCode(): Int {
        return balance.hashCode()
    }

    override fun toString(): String {
        return "BankAccount(balance=$balance)"
    }
}