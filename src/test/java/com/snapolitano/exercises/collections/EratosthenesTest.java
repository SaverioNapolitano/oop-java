package com.snapolitano.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class EratosthenesTest {

    @Test
    void eratosthenes() {
        assertEquals(new HashSet<>(Set.of(2, 3, 5, 7, 11, 13)), Eratosthenes.eratosthenes(15));
        assertEquals(new HashSet<>(Set.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)), Eratosthenes.eratosthenes(29));
    }
}