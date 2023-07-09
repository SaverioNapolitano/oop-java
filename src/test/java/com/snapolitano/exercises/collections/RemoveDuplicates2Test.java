package com.snapolitano.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicates2Test {

    @Test
    void removeDuplicates() {
        assertEquals(List.of(1, 2, 3, 4, 5),
                RemoveDuplicates2.removeDuplicates(new ArrayList<>(List.of(1, 2, 3, 4, 5))));
        assertEquals(List.of(1, 2),
                RemoveDuplicates2.removeDuplicates(new ArrayList<>(List.of(1, 1, 1, 2, 2))));
    }
}