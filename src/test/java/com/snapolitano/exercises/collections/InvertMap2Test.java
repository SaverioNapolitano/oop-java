package com.snapolitano.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class InvertMap2Test {

    @Test
    void invertMap() {
        assertEquals(Map.of(
                "Hello", 1,
                "World", 3), InvertMap2.invertMap(Map.of(
                        1, "Hello",
                        3, "World"
        )));
        assertEquals(Map.of(
                "Hello", 3), InvertMap2.invertMap(Map.of(
                1, "Hello",
                3, "Hello"
        )));
    }
}