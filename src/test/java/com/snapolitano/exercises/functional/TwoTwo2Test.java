package com.snapolitano.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoTwo2Test {

    @Test
    void twoTwo() {
        assertEquals(List.of(4, 6), TwoTwo2.twoTwo(new ArrayList<>(List.of(1, 2, 3))));
        assertEquals(List.of(4), TwoTwo2.twoTwo(new ArrayList<>(List.of(2, 6, 11))));
        assertEquals(List.of(0), TwoTwo2.twoTwo(new ArrayList<>(List.of(0))));

    }
}