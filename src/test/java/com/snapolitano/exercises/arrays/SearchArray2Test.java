package com.snapolitano.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchArray2Test {

    @Test
    void containsBruteForce() {
        assertTrue(SearchArray2.containsBruteForce(new String[]{"car", "boat", "bike", "plane"}, "bike"));
        assertFalse(SearchArray2.containsBruteForce(new String[]{"car", "boat", "bike", "plane"}, "helicopter"));
    }

    @Test
    void containsBinary() {
        assertTrue(SearchArray2.containsBinary(new String[]{"car", "boat", "bike", "plane"}, "bike"));
        assertFalse(SearchArray2.containsBinary(new String[]{"car", "boat", "bike", "plane"}, "helicopter"));
    }
}