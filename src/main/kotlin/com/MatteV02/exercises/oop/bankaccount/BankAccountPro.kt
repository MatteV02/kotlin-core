package com.MatteV02.exercises.oop.bankaccount

class BankAccountPro(
    @Suppress("LocalVariableName") IBAN: String,
    balance: Double
) : AbstractBankAccount(IBAN, balance, interestRate = 0.02, operationFee = 1.0) {
    override fun deposit(amount: Double) {
        applyFee()
        super.deposit(amount)
    }

    override fun withdraw(amount: Double): Double {
        applyFee()
        return super.withdraw(amount)
    }
}