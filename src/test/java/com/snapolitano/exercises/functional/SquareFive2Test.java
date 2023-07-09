package com.snapolitano.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SquareFive2Test {

    @Test
    void squareFive() {
        assertEquals(3, SquareFive2.squareFive(new ArrayList<>(List.of(3, 1, 4))));
        assertEquals(1, SquareFive2.squareFive(new ArrayList<>(List.of(1))));
        assertEquals(0, SquareFive2.squareFive(new ArrayList<>(List.of(5))));
    }
}