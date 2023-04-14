package com.snapolitano.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideArrayTest {

    @Test
    void divideArray() {
        assertArrayEquals(new double[]{0.5, 0.5, 0.5}, DivideArray.divideArray(new double[]{1, 1, 1}, 2));
    }
}