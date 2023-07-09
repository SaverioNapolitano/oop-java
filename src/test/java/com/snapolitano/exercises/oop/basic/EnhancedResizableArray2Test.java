package com.snapolitano.exercises.oop.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnhancedResizableArray2Test {
    EnhancedResizableArray2 enhancedResizableArray2;

    @BeforeEach
    void setUp(){
        enhancedResizableArray2 = new EnhancedResizableArray2();
        enhancedResizableArray2.set(0, 0);
        enhancedResizableArray2.set(1, 1);
        enhancedResizableArray2.set(2, 2);
        enhancedResizableArray2.set(3, 3);
    }

    @Test
    void contains() {
        assertTrue(enhancedResizableArray2.contains(2));
        assertFalse(enhancedResizableArray2.contains(5));
    }

    @Test
    void fill() {
        EnhancedResizableArray2 resizableArray2 = new EnhancedResizableArray2();
        resizableArray2.fill(-1);
        enhancedResizableArray2.fill(-1);
        assertEquals(enhancedResizableArray2, resizableArray2);
    }

    @Test
    void get() {
        assertEquals(2, enhancedResizableArray2.get(2));
    }

    @Test
    void length() {
        assertEquals(4, enhancedResizableArray2.length());
    }

    @Test
    void set() {
        EnhancedResizableArray2 resizableArray2 = new EnhancedResizableArray2();
        resizableArray2.fill(-1);
        resizableArray2.set(4, -1);
        EnhancedResizableArray2 array2 = new EnhancedResizableArray2();
        array2.fill(-1);
        array2.set(4, -1);
        array2.set(5, 0);
        array2.set(6, 0);
        array2.set(7, 0);
        assertEquals(resizableArray2, array2);
    }

    @Test
    void toArray() {
        assertArrayEquals(new int[]{0, 1, 2, 3}, enhancedResizableArray2.toArray());
    }
}