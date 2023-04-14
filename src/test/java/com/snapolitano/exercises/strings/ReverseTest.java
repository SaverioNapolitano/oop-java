package com.snapolitano.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    void reverse() {
        String test = "String test";
        assertEquals("tset gnirtS", Reverse.reverse(test));
    }
}