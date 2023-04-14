package com.snapolitano.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenateTest {

    @Test
    void concatenate() {
        String[] str = {"Hello", " ", "World!"};
        assertEquals("Hello World!", Concatenate.concatenate(str));
    }
}