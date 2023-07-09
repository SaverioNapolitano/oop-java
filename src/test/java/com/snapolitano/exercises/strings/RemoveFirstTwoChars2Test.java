package com.snapolitano.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstTwoChars2Test {

    @Test
    void removeFirstTwoChars() {
        assertEquals("llo World!", RemoveFirstTwoChars2.removeFirstTwoChars("Hello World!"));
        assertEquals("", RemoveFirstTwoChars2.removeFirstTwoChars("No"));
        assertEquals("", RemoveFirstTwoChars2.removeFirstTwoChars("Y"));
    }
}