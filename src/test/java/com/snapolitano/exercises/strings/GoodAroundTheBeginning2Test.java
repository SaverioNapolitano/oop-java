package com.snapolitano.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodAroundTheBeginning2Test {

    @Test
    void goodAroundTheBeginning() {
        assertTrue(GoodAroundTheBeginning2.goodAroundTheBeginning("good Sweet"));
        assertTrue(GoodAroundTheBeginning2.goodAroundTheBeginning("_good Sweet"));
        assertFalse(GoodAroundTheBeginning2.goodAroundTheBeginning("__good Sweet"));
        assertFalse(GoodAroundTheBeginning2.goodAroundTheBeginning("goo"));
    }
}