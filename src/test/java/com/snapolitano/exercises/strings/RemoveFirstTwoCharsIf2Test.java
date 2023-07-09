package com.snapolitano.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstTwoCharsIf2Test {

    @Test
    void removeFirstTwoCharsIf() {
        assertEquals("Hello World!", RemoveFirstTwoCharsIf2.removeFirstTwoCharsIf("Hello World!"));
        assertEquals("od World!", RemoveFirstTwoCharsIf2.removeFirstTwoCharsIf("Good World!"));
        assertEquals("H", RemoveFirstTwoCharsIf2.removeFirstTwoCharsIf("Ho"));
        assertEquals("e", RemoveFirstTwoCharsIf2.removeFirstTwoCharsIf("Ne"));
        assertEquals("", RemoveFirstTwoCharsIf2.removeFirstTwoCharsIf("Y"));
    }
}