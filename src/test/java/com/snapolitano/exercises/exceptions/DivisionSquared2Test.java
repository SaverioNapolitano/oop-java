package com.snapolitano.exercises.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionSquared2Test {

    @Test
    void divisionSquared() {
        assertEquals(0, DivisionSquared2.divisionSquared(2, 0));
        assertEquals(4, DivisionSquared.divisionSquared(4, 2));
    }
}