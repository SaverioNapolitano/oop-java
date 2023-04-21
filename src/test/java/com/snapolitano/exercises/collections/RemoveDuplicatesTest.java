package com.snapolitano.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void removeDuplicates() {
        assertEquals(new ArrayList<>(List.of(1, 2, 3, 4, 5)), RemoveDuplicates.removeDuplicates(new ArrayList<>(List.of(1, 2, 3, 4, 5))));
        assertEquals(new ArrayList<>(List.of(1, 2)), RemoveDuplicates.removeDuplicates(new ArrayList<>(List.of(1, 1, 1, 2, 2))));
    }
}