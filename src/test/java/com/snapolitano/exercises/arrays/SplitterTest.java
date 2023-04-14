package com.snapolitano.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitterTest {

    @Test
    void splitter() {
        assertArrayEquals(new int[]{3, 2, 1}, Splitter.splitter(321));
        assertArrayEquals(new int[]{1, 2, 3}, Splitter.splitter(123));
    }
}