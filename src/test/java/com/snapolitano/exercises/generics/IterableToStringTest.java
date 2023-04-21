package com.snapolitano.exercises.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IterableToStringTest {

    @Test
    void iterableToString() {
        assertEquals("1, 2, 3, ", IterableToString.iterableToString(new ArrayList<>(List.of(1, 2, 3))));
        assertEquals("a, b, c, ", IterableToString.iterableToString(new ArrayList<>(List.of("a", "b", "c"))));
    }
}