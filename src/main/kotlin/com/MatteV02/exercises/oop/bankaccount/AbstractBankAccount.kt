package com.MatteV02.exercises.oop.bankaccount

abstract class AbstractBankAccount : BankAccount {
    /**
     * IBAN is checked each time it is edited
     * @see checkIBAN
     * @throws IllegalArgumentException when IBAN is not correct or if the first two characters aren't a country code
     */
    @Suppress("MemberVisibilityCanBePrivate", "PropertyName")
    internal var IBAN: String = "GB82WEST12345698765432"
        set(value) {
            if (!checkIBAN(value)) {
                throw IllegalArgumentException("Wrong IBAN")
            }
            if (!IBAN.substring(0..1).all { c -> c.isLetter() }) {
                throw IllegalArgumentException("Wrong IBAN")
            }
            field = value
            countryCode = IBAN.substring(0..1)
        }

    @Suppress("MemberVisibilityCanBePrivate")
    internal var countryCode: String = ""

    internal var balance: Double

    /**
     * The interest rate cannot be negative
     */
    @Suppress("MemberVisibilityCanBePrivate")
    internal var interestRate = 0.0
        set(value) {
            if (value < 0) {
                throw IllegalArgumentException("value cannot be negative")
            }
            field = value
        }

    /**
     * Operation fee must be positive
     * @throws IllegalArgumentException when something try to set operationFee to negative values
     */
    @Suppress("MemberVisibilityCanBePrivate")
    internal var operationFee = 0.0
        set(value) {
            if (value < 0) {
                throw IllegalArgumentException("operationFee cannot be negative")
            }
            field = value
        }


    @Suppress("LocalVariableName")
    constructor(IBAN: String, balance: Double, interestRate: Double, operationFee: Double) {
        this.IBAN = IBAN
        this.balance = balance
        this.interestRate = interestRate
        this.operationFee = operationFee
    }

    override fun getCountryCode(): String {
        return countryCode
    }

    /**
     * Apply the interest rate to the balance.
     */
    override fun addInterest() {
        balance += balance * interestRate
    }

    /**
     * Apply the fee
     * @throws RuntimeException after applying the fee, the balance is negative
     */
    internal fun applyFee() {
        balance -= operationFee
        if (balance < 0) throw RuntimeException("Negative balance")
    }

    /**
     * Deposit the specified amount on the account
     * @param amount Deposited amount
     * @throws IllegalArgumentException when the deposited amount is < 0
     */
    override fun deposit(amount: Double) {
        if (amount < 0) {
            throw IllegalArgumentException("Deposited amount cannot be negative")
        }

        balance += amount
    }

    override fun getBalance(): Double {
        return balance
    }

    override fun getIBAN(): String {
        return IBAN
    }

    override fun getInterestRate(): Double {
        return interestRate
    }

    override fun getOperationFee(): Double {
        return operationFee
    }

    override fun setBalance(balance: Double) {
        this.balance = balance
    }

    override fun setIBAN(@Suppress("LocalVariableName") IBAN: String) {
        this.IBAN = IBAN
    }

    override fun setInterestRate(interestRate: Double) {
        this.interestRate = interestRate
    }

    override fun setOperationFee(operationFee: Double) {
        this.operationFee = operationFee
    }

    /**
     * Transfers the specified amount to the specified BankAccount
     * @param payee the BankAccount that will receive the amount
     * @param amount the transferred amount
     */
    override fun transfer(payee: BankAccount, amount: Double) {
        val withdrawnAmount = withdraw(amount)
        payee.deposit(withdrawnAmount)
    }

    /**
     * Withdraws the specified amount from the balance
     * @param amount the amount to withdraw
     * @return the withdrawn amount
     */
    override fun withdraw(amount: Double): Double {
        balance -= amount
        return amount
    }

    companion object {
        /**
         * Check the validity of the IBAN
         * @see <a href="https://en.wikipedia.org/wiki/International_Bank_Account_Number#Modulo_operation_on_IBAN">wiki</a>
         */
        internal fun checkIBAN(input: String): Boolean {
            val workingString = StringBuilder(input)

            workingString.append(workingString.substring(0, 4))
            workingString.deleteRange(0, 4)

            val numericIBAN =
                workingString.map { c ->
                    if (c.isLetter()) {
                        val num = c.uppercaseChar() - 'A' + 10
                        num.toString()
                    } else {
                        c
                    }
                }.joinToString(separator = "")
                    .toBigInteger()

            return numericIBAN.rem(97.toBigInteger()).toInt() == 1
        }
    }
}