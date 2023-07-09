package com.snapolitano.exercises.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PairUtil2Test {

    @Test
    void swap() {
        Pair2<String, Integer> pair2 = new Pair2<>("1", 1);
        Pair2<Integer, String> swapped = PairUtil2.swap(pair2);
        assertEquals(1, swapped.getFirst());
        assertEquals("1", swapped.getSecond());
    }
}