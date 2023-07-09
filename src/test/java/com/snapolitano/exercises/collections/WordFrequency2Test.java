package com.snapolitano.exercises.collections;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequency2Test {

    final String filename = "src/main/resources/james-joyce-ulysses.txt";
    @Test
    void wordFrequency() throws IOException {
        Map<String, Integer> map = WordFrequency2.wordFrequency(filename);
        assertEquals(1, map.get("prejudice"));
        assertEquals(1, map.get("zulu"));
        assertEquals(2, map.get("velocipedes"));
        assertEquals(3, map.get("bachelor"));
    }
}