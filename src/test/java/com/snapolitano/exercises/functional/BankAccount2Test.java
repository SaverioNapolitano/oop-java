package com.snapolitano.exercises.functional;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccount2Test {

    @Test
    void applyInterest() {
        List<BankAccount2.Account> accounts = new ArrayList<>(List.of(
                new BankAccount2.Account(1000, 10, LocalDateTime.of(2023, 7, 23, 14, 45)),
                new BankAccount2.Account(2000, 0.20, LocalDateTime.of(2022, 3, 17, 12, 24)),
                new BankAccount2.Account(500, 0.02, LocalDateTime.of(2023, 7, 1, 11, 43))
        ));
        List<BankAccount2.Account> expected = List.of(
                new BankAccount2.Account(510, 0.02, LocalDateTime.of(2023, 7, 1, 11, 43)),
                new BankAccount2.Account(2400, 0.20, LocalDateTime.of(2022, 3, 17, 12, 24)));
        assertEquals(expected, BankAccount2.applyInterest(accounts));
    }
}