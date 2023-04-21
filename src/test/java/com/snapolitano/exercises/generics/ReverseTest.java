package com.snapolitano.exercises.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    void reverse() {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2));
        Reverse.reverse(list);
        assertEquals(new ArrayList<>(List.of(2, 1)), list);
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4));
        Reverse.reverse(list1);
        assertEquals(new ArrayList<>(List.of(4, 3, 2, 1)), list1);
        ArrayList<String> list2 = new ArrayList<>(List.of("hello", "world"));
        Reverse.reverse(list2);
        assertEquals(new ArrayList<>(List.of("world", "hello")), list2);
    }
}