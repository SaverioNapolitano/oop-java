package com.snapolitano.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanBalanceTest {

    @Test
    void canBalance() {
        assertTrue(CanBalance.canBalance(new int[]{1, 1, 1, 2, 1}));
        assertTrue(CanBalance.canBalance(new int[]{10, 10}));
        assertFalse(CanBalance.canBalance(new int[]{2, 1, 1, 2, 1}));
        assertTrue(CanBalance.canBalance(new int[]{1, 1, 1, 1, 4}));
        assertTrue(CanBalance.canBalance(new int[]{1, -5, 1, -2, -1}));
        assertTrue(CanBalance.canBalance(new int[]{-1, -2, -3, -6}));
    }
}