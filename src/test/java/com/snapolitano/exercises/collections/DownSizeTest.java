package com.snapolitano.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DownSizeTest {

    @Test
    void downsize() {
        List<String> l = new ArrayList<>(List.of("A", "B", "C", "D", "E", "F"));
        DownSize.downsize(l, 2);
        assertEquals(List.of("A", "C", "E"), l);
        List<String> l1 = new ArrayList<>(List.of("A", "B", "C", "D", "E", "F"));
        DownSize.downsize(l1, 3);
        assertEquals(List.of("A", "B", "D", "E"), l1);
    }
}