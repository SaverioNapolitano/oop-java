package com.snapolitano.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountYZTest {

    @Test
    void countYZ() {
        assertEquals(2, CountYZ.countYZ("feZ daY"));
        assertEquals(2, CountYZ.countYZ("day fez"));
        assertEquals(2, CountYZ.countYZ("day fyyyz"));
        assertEquals(0, CountYZ.countYZ("yellow mellow zellow"));
    }
}