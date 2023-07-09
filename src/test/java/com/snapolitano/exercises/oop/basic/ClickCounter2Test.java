package com.snapolitano.exercises.oop.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClickCounter2Test {
    ClickCounter2 clickCounter2;

    @BeforeEach
    void setUp(){
        clickCounter2 = new ClickCounter2();
    }



    @Test
    void getValue() {
        clickCounter2.click();
        assertEquals(1, clickCounter2.getValue());
    }

    @Test
    void click() {
        clickCounter2.click();
        assertEquals(1, clickCounter2.getValue());
    }

    @Test
    void undo() {
        clickCounter2.undo();
        assertEquals(0, clickCounter2.getValue());
        clickCounter2.undo();
        assertEquals(0, clickCounter2.getValue());
    }

    @Test
    void reset() {
        clickCounter2.click();
        clickCounter2.click();
        clickCounter2.reset();
        assertEquals(0, clickCounter2.getValue());
    }
}