package com.snapolitano.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ValuesKeysTest {

    @Test
    void valuesKeys() {
        assertTrue(ValuesKeys.valuesKeys(new HashMap<>(Map.of("a", "hello", "b", "how", "c", "are",
                "are", "saverio"))));
        assertFalse(ValuesKeys.valuesKeys(new HashMap<>(Map.of("a", "hello", "b", "how", "c", "are",
                "you", "saverio"))));
    }
}