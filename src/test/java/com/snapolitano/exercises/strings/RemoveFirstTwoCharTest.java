package com.snapolitano.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstTwoCharTest {

    @Test
    void removeFirstTwoChars() {
        assertEquals("", RemoveFirstTwoChar.removeFirstTwoChars("No"));
        assertEquals("", RemoveFirstTwoChar.removeFirstTwoChars("Y"));
        assertEquals("llo World!", RemoveFirstTwoChar.removeFirstTwoChars("Hello World!"));
        assertEquals("", RemoveFirstTwoChar.removeFirstTwoChars(""));
    }
}