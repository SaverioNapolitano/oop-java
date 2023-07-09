package com.snapolitano.exercises.oop.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RationalNumber2Test {

    RationalNumber2 rationalNumber2;
    RationalNumber2 o;
    @Test
    void setUp(){
        assertThrows(IllegalArgumentException.class,() -> new RationalNumber2(0, 0));

    }

    @Test
    void add() {
        rationalNumber2 = new RationalNumber2(4, 3);
        o = new RationalNumber2(4, 1);
        assertEquals(new RationalNumber2(1, 1), rationalNumber2.add(o));
    }

    @Test
    void multiply() {
        rationalNumber2 = new RationalNumber2(4, 3);
        o = new RationalNumber2(3, 2);
        assertEquals(new RationalNumber2(2, 1), rationalNumber2.multiply(o));
        o = new RationalNumber2(2, 0);
        assertEquals(new RationalNumber2(1, 0), rationalNumber2.multiply(o));
    }
}