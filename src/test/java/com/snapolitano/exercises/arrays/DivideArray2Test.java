package com.snapolitano.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideArray2Test {

    @Test
    void divideArray() {
        assertArrayEquals(new double[]{0.5, 0.5, 0.5}, DivideArray2.divideArray(new double[]{1, 1, 1}, 2.0));
        assertArrayEquals(new double[]{2.0, 1.0, 1.0}, DivideArray2.divideArray(new double[]{2, 1, 1}, 1.0));
        assertArrayEquals(new double[]{1.0, 1.0}, DivideArray2.divideArray(new double[]{10, 10}, 10.0));
    }
}