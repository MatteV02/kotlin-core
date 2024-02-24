package com.MatteV02.exercises.oop.bankaccount

import kotlin.math.min

class BankAccountEasy(
    @Suppress("LocalVariableName")
    IBAN: String,
    balance: Double
) : AbstractBankAccount(IBAN, balance, interestRate = 0.0, operationFee = 0.0) {

    /**
     * International transfers are not allowed.
     * @throws IllegalArgumentException after attempt of international transfer
     */
    override fun transfer(payee: BankAccount, amount: Double) {
        if (this.getCountryCode() != payee.getCountryCode()) {
            throw IllegalArgumentException("Cannot make international transfer")
        }
        super.transfer(payee, amount)
    }

    /**
     * Negative balance is not allowed, so money will be withdrawn until the balance is positive.
     */
    override fun withdraw(amount: Double): Double {
        return super.withdraw(min(amount, balance))
    }
}