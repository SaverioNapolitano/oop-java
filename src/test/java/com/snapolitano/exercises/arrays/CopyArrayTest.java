package com.snapolitano.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CopyArrayTest {

    @Test
    void copyArray() {
        assertArrayEquals(new double[]{1, 2, 3, 4, 5}, CopyArray.copyArray(new double[]{1, 2, 3, 4, 5}));
    }
}