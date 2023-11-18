package com.MatteV02.exercises.oop.basic.BankAccount

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class BankAccountTest : FunSpec({
    var bankAccount1 = BankAccount()
    var bankAccount2 = BankAccount()

    beforeEach {
        bankAccount1 = BankAccount()
        bankAccount2 = BankAccount(1000.0)
    }

    test("negative balance") {
        shouldThrow<BankAccount.NegativeBalanceException> {
            BankAccount(-1.0)
        }
    }

    test("deposit") {
        bankAccount1.deposit(10.0)
        bankAccount1.balance shouldBe 10.0

        bankAccount2.deposit(100.0)
        bankAccount2.balance shouldBe 1100.0

        shouldThrow<BankAccount.DepositNegativeAmountException> {
            bankAccount1.deposit(-10.0)
        }
        bankAccount1.balance shouldBe 10.0
    }

    test("withdraw") {
        shouldThrow<BankAccount.WithdrawAmountGreaterThanBalanceException> { bankAccount1.withdraw(10.0) }
        shouldThrow<BankAccount.WithdrawNegativeAmountException> { bankAccount2.withdraw(-100.0) }

        bankAccount2.withdraw(100.0)
        bankAccount2.balance shouldBe 900
    }
})
