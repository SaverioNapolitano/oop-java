package com.snapolitano.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OneTen2Test {

    @Test
    void oneTen() {
        assertEquals(List.of(20, 30, 40), OneTen2.oneTen(new ArrayList<>(List.of(1, 2, 3))));
        assertEquals(List.of(70, 90, 70, 90, 20), OneTen2.oneTen(new ArrayList<>(List.of(6, 8, 6, 8, 1))));
        assertEquals(List.of(110), OneTen2.oneTen(new ArrayList<>(List.of(10))));

    }
}