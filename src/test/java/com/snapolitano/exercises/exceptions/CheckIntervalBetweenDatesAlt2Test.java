package com.snapolitano.exercises.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIntervalBetweenDatesAlt2Test {

    @Test
    void checkIntervalBetweenDatesAlt() {
        assertTrue(CheckIntervalBetweenDatesAlt2.checkIntervalBetweenDatesAlt("2022-07-21", "2024-09-21"));
        assertFalse(CheckIntervalBetweenDatesAlt2.checkIntervalBetweenDatesAlt("2025-07-08", "2023/09/02"));
    }
}