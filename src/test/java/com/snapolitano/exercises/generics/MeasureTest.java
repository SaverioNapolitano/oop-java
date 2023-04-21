package com.snapolitano.exercises.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasureTest {

    @Test
    void max() {
        Measure.Measurer<String> measurer = String::length;
        assertEquals("hard disk", Measure.max(new String[]{"cpu", "memory", "hard disk", "case"}, measurer));
        assertEquals("cpu", Measure.min(new String[]{"cpu", "memory", "hard disk", "case"}, measurer));
    }
}