package com.snapolitano.exercises.exceptions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilterLists2Test {

    @Test
    void filterLists() {
        List<List<String>> lists = new ArrayList<>();
        lists.add(List.of("a1b2", "cd1s"));
        lists.add(List.of("s2r3", "t5h6y7"));
        lists.add(List.of("", "a"));
        List<List<String>> expected = new ArrayList<>();
        expected.add(List.of("s2r3", "t5h6y7"));
        assertEquals(expected, FilterLists2.filterLists(lists));
    }
}