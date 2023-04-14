package com.snapolitano.exercises.generics;

import java.util.*;

public class MapToPairs {
    public static <K, V> List<Pair<K, V>> mapToPairs(Map<K, V> src) {
        Set<Map.Entry<K, V>> set = src.entrySet();
        ArrayList<Pair<K, V>> pairs = new ArrayList<>();
        for (Map.Entry<K, V> m : set) {
            Pair<K, V> pair = new Pair<>(m.getKey(), m.getValue());
            pairs.add(pair);
        }
        return pairs;
    }
}
