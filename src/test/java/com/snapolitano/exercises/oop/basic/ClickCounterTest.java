package com.snapolitano.exercises.oop.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClickCounterTest {

    @Test
    void getValue() {
        ClickCounter cc = new ClickCounter();
        cc.click();
        cc.click();
        assertEquals(2, cc.getValue());
    }

    @Test
    void click() {
        ClickCounter cc = new ClickCounter();
        assertEquals(0, cc.getValue());
        cc.click();
        assertEquals(1, cc.getValue());
    }

    @Test
    void undo() {
        ClickCounter cc = new ClickCounter();
        assertEquals(0, cc.getValue());
        cc.click();
        assertEquals(1, cc.getValue());
        cc.undo();
    }

    @Test
    void reset() {
        ClickCounter cc = new ClickCounter();
        cc.click();
        cc.undo();
        assertEquals(0, cc.getValue());
    }
}