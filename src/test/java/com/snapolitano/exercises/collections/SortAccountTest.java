package com.snapolitano.exercises.collections;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortAccountTest {

    SortAccount.Account account = new SortAccount.Account(1000, 50, LocalDateTime.of(2023, 3, 24, 15, 39));
    SortAccount.Account account1 = new SortAccount.Account(1200, 70, LocalDateTime.of(2023, 3, 24, 15, 5));
    SortAccount.Account account2 = new SortAccount.Account(1500, 10, LocalDateTime.of(2023, 3, 24, 15, 10));

    List<SortAccount.Account> accountList = new ArrayList<>(List.of(account, account1, account2));
    @Test
    void sortByAmount() {
        SortAccount.sortByAmount(accountList);
        assertEquals(List.of(account, account1, account2), accountList);
    }

    @Test
    void sortByInterestRate() {
        SortAccount.sortByInterestRate(accountList);
        assertEquals(List.of(account2, account, account1), accountList);
    }

    @Test
    void sortByDuePayment() {
        SortAccount.sortByDuePayment(accountList);
        assertEquals(List.of(account1, account2, account), accountList);
    }
}