package com.snapolitano.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Reverse2Test {

    @Test
    void reverse() {
        assertEquals("tset gnirtS", Reverse2.reverse("String test"));
        assertEquals("eoD nhoJ", Reverse2.reverse("John Doe"));
        assertEquals("!dlroW olleH", Reverse2.reverse("Hello World!"));
    }
}