package com.MatteV02.exercises.oop.bankaccount

interface BankAccount {
    fun addInterest()
    fun deposit(amount: Double)
    fun getBalance(): Double
    fun getIBAN(): String
    fun getInterestRate(): Double
    fun getOperationFee(): Double
    fun setBalance(balance: Double)
    fun setIBAN(@Suppress("LocalVariableName") IBAN: String)
    fun setInterestRate(interestRate: Double)
    fun setOperationFee(operationFee: Double)
    fun transfer(payee: BankAccount, amount: Double)
    fun withdraw(amount: Double): Double
    fun getCountryCode(): String
}