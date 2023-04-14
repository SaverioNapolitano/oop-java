package com.snapolitano.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodAtTheBeginningTest {

    @Test
    void goodAtTheBeginning() {
        assertTrue(GoodAtTheBeginning.goodAtTheBeginning("good Sweet"));
        assertFalse(GoodAtTheBeginning.goodAtTheBeginning(" good Sweet"));
        assertFalse(GoodAtTheBeginning.goodAtTheBeginning("goo"));
        assertFalse(GoodAtTheBeginning.goodAtTheBeginning("goo d"));
        assertFalse(GoodAtTheBeginning.goodAtTheBeginning("go od"));
        assertFalse(GoodAtTheBeginning.goodAtTheBeginning("g ood"));
    }
}