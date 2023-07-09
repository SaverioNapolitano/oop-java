package com.snapolitano.exercises.oop.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccount2Test {

    com.snapolitano.exercises.oop.basic.BankAccount2 bankAccount2 = new com.snapolitano.exercises.oop.basic.BankAccount2();

    @Test
    void deposit() {
        bankAccount2.deposit(1000);
        assertEquals(1000, bankAccount2.getBalance());
    }

    @Test
    void withdraw() {
        bankAccount2.withdraw(500);
        assertEquals(-500, bankAccount2.getBalance());
    }
}