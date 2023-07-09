package com.snapolitano.exercises.oop.bankaccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountEasy2Test {
    BankAccountEasy2 bankAccountEasy2;
    BankAccountEasy2 other;
    @BeforeEach
    void setUp(){
        bankAccountEasy2 = new BankAccountEasy2(5, "IT1234567890123456789012345");
        other = new BankAccountEasy2(500, "IT0987654321098765432109876");
    }

    @Test
    void transfer() {
        bankAccountEasy2.transfer(other, 2);
        assertEquals(3, bankAccountEasy2.getBalance());
        assertEquals(502, other.getBalance());
    }

    @Test
    void withdraw() {
        bankAccountEasy2.withdraw(50);
        assertEquals(0, bankAccountEasy2.getBalance());
    }
}