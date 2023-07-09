package com.snapolitano.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideArrays2Test {

    @Test
    void divideArrays() {
        assertArrayEquals(new double[]{1/3.0, 1/3.0, 1/3.0}, DivideArrays2.divideArrays(new double[]{1, 1, 1},
                new double[]{3, 3, 3}));
        assertArrayEquals(new double[]{0.2, 0.1, 0.1}, DivideArrays2.divideArrays(new double[]{2, 1, 1},
                new double[]{10, 10, 10}));
        assertArrayEquals(new double[]{2.0, 2.0}, DivideArrays2.divideArrays(new double[]{10, 10}, new double[]{5, 5}));
    }
}