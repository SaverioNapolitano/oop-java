package com.snapolitano.exercises.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Reverse2Test {

    @Test
    void reverse() {
        List<Integer> list = new ArrayList<>(List.of(1, 2));
        Reverse2.reverse(list);
        assertEquals(List.of(2, 1), list);
        list = new ArrayList<>(List.of(1, 2, 3, 4));
        Reverse2.reverse(list);
        assertEquals(List.of(4, 3, 2, 1), list);
        List<String> stringList = new ArrayList<>(List.of("hello", "world"));
        Reverse2.reverse(stringList);
        assertEquals(List.of("world", "hello"), stringList);

    }
}