package com.snapolitano.exercises.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapToPairs2Test {

    @Test
    void mapToPairs() {
        Map<String, Integer> map = new HashMap<>(Map.of(
                "1", 1,
                "2", 2,
                "3", 3));
        List<Pair2<String, Integer>> list = new ArrayList<>(List.of(
                new Pair2<>("1", 1),
                new Pair2<>("2", 2),
                new Pair2<>("3", 3))
        );
        assertEquals(list, MapToPairs2.mapToPairs(map));
    }
}