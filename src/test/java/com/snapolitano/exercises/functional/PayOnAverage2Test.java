package com.snapolitano.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PayOnAverage2Test {

    @Test
    void payOnAverage() {
        Map<String, Double> fees = new HashMap<>(Map.of(
                "34745...", 11.75,
                "33367...", 9.75,
                "34833...", 7.75,
                "33188...", 7.75,
                "33112...", 7.95));

        assertEquals(Map.of("347", 11.75, "333", 9.75, "348", 7.75, "331", 7.85), PayOnAverage2.payOnAverage(fees));
    }
}