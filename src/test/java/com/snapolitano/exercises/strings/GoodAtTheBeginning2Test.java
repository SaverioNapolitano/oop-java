package com.snapolitano.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodAtTheBeginning2Test {

    @Test
    void goodAtTheBeginning() {
        assertTrue(GoodAtTheBeginning2.goodAtTheBeginning("good Sweet"));
        assertFalse(GoodAtTheBeginning2.goodAtTheBeginning(" good Sweet"));
        assertFalse(GoodAtTheBeginning2.goodAtTheBeginning("goo"));
    }
}