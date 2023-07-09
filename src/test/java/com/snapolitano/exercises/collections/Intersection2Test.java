package com.snapolitano.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class Intersection2Test {

    @Test
    void intersection() {
        assertEquals(Set.of(), Intersection2.intersection(Set.of(1, 2, 3), Set.of(4, 5, 6)));
        assertEquals(Set.of(3), Intersection2.intersection(Set.of(1, 2, 3), Set.of(3, 4, 5)));
    }
}