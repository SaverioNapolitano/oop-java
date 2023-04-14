package com.snapolitano.exercises.oop.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnhancedResizableArrayTest {

    EnhancedResizableArray enhancedResizableArray = new EnhancedResizableArray();

    @Test
    void add() {
        enhancedResizableArray.add(1);
        enhancedResizableArray.add(2);
        enhancedResizableArray.add(3);
        assertArrayEquals(new int[]{1, 2, 3}, enhancedResizableArray.toArray());
    }

    @Test
    void remove() {
        enhancedResizableArray.add(1);
        enhancedResizableArray.add(2);
        enhancedResizableArray.add(3);
        enhancedResizableArray.remove(2);
        assertArrayEquals(new int[]{1, 2}, enhancedResizableArray.toArray());
    }

    @Test
    void contains() {
        enhancedResizableArray.add(1);
        enhancedResizableArray.add(2);
        enhancedResizableArray.add(3);
        assertTrue(enhancedResizableArray.contains(2));
        assertFalse(enhancedResizableArray.contains(4));
    }

    @Test
    void size() {
        enhancedResizableArray.add(1);
        enhancedResizableArray.add(2);
        enhancedResizableArray.add(3);
        assertEquals(3, enhancedResizableArray.size());
    }

    @Test
    void toArray() {
        assertArrayEquals(new int[]{}, enhancedResizableArray.toArray());
        enhancedResizableArray.add(1);
        enhancedResizableArray.add(2);
        enhancedResizableArray.add(3);
        assertArrayEquals(new int[]{1, 2, 3}, enhancedResizableArray.toArray());
    }
}