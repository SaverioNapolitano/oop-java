package com.snapolitano.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateChars2Test {

    @Test
    void duplicateChars() {
        assertArrayEquals(new char[]{'e', 'h', 'i', 's'}, DuplicateChars2.duplicateChars("headmistressship"));
        assertArrayEquals(new char[]{'e', 'l', 'w'}, DuplicateChars2.duplicateChars("whistleblower"));
        assertArrayEquals(new char[]{'s'}, DuplicateChars2.duplicateChars("ss"));
        assertArrayEquals(new char[]{}, DuplicateChars2.duplicateChars("s"));
        assertArrayEquals(new char[]{}, DuplicateChars2.duplicateChars(""));
    }
}