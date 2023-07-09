package com.snapolitano.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountYZ2Test {

    @Test
    void countYZ() {
        assertEquals(2, CountYZ2.countYZ("fez day"));
        assertEquals(2, CountYZ2.countYZ("day fez"));
        assertEquals(2, CountYZ2.countYZ("day fyyyz"));
        assertEquals(1, CountYZ2.countYZ("heavy yellow"));

    }
}