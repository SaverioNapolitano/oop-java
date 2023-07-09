package com.snapolitano.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Concatenate2Test {

    @Test
    void concatenate() {
        assertEquals("Hello World!", Concatenate2.concatenate(new String[]{"Hello", " ", "World!"}));
        assertEquals("Hello World!", Concatenate2.concatenate(new String[]{"H", "e", "llo", " ", "World!"}));
        assertEquals("Hello World!", Concatenate2.concatenate(new String[]{"Hello World", "!"}));
    }
}