package com.snapolitano.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void bubbleSort() {
        int[] v = {6, 3, 4, 2};
        BubbleSort.bubbleSort(v);
        assertArrayEquals(new int[]{2, 3, 4, 6}, v);
    }

    @Test
    void bubbleSortCopy() {
        assertArrayEquals(new int[]{4, 7, 8, 9}, BubbleSort.bubbleSortCopy(new int[]{9, 8, 7, 4}));
        assertArrayEquals(new int[]{0, 0, 0, 1}, BubbleSort.bubbleSortCopy(new int[]{1, 0, 0, 0}));
    }
}