package com.snapolitano.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Splitter2Test {

    @Test
    void splitter() {
        assertArrayEquals(new int[]{3, 2, 1}, Splitter2.splitter(321));
        assertArrayEquals(new int[]{1, 2, 3}, Splitter2.splitter(123));
    }
}