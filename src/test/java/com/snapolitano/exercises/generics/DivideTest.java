package com.snapolitano.exercises.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideTest {

    @Test
    void divide() {
        assertEquals(2.0, Divide.divide(4, 2));
        assertEquals(2.0, Divide.divide(4.0, 2));
        assertEquals(2.0, Divide.divide(4, 2.0));
    }
}