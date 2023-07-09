package com.snapolitano.exercises.oop.bankaccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountPro2Test {

    BankAccountPro2 bankAccountPro2;
    BankAccountPro2 other;
    
    @BeforeEach
    void setUp(){
        bankAccountPro2 = new BankAccountPro2(-5, "IT1234567890123456789012345");
        other = new BankAccountPro2(500, "EN0987654321098765432109876");
    }

    @Test
    void transfer() {
        bankAccountPro2.transfer(other, 10);
        assertEquals(-16, bankAccountPro2.getBalance());
        assertEquals(510, other.getBalance());
    }

    @Test
    void withdraw() {
        bankAccountPro2.withdraw(20);
        assertEquals(-26, bankAccountPro2.getBalance());

    }
}