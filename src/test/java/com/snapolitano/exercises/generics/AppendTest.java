package com.snapolitano.exercises.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppendTest {

    @Test
    void append() {
        ArrayList<Integer> dst = new ArrayList<>(List.of());
        ArrayList<Integer> src = new ArrayList<>(List.of(1, 2));
        Append.append(dst, src);
        assertEquals(new ArrayList<Integer>(List.of(1, 2)), dst);
        ArrayList<Integer> dst1 = new ArrayList<>(List.of(1, 2));
        ArrayList<Integer> src1 = new ArrayList<>(List.of(3, 4));
        Append.append(dst1, src1);
        assertEquals(new ArrayList<Integer>(List.of(1, 2, 3, 4)), dst1);
        ArrayList<String> dst2 = new ArrayList<>(List.of("a", "c"));
        ArrayList<String> src2 = new ArrayList<>(List.of("c", "d"));
        Append.append(dst2, src2);
        assertEquals(new ArrayList<String>(List.of("a", "c", "c", "d")), dst2);
    }
}