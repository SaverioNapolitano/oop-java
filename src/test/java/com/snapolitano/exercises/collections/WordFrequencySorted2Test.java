package com.snapolitano.exercises.collections;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordFrequencySorted2Test {

	final String filename = "src/main/resources/james-joyce-ulysses.txt";
	Map<String, Integer> map;
	{
		try {
			map = WordFrequencySorted2.wordFrequency(filename);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	@Test
	void mostFrequent() {
		Map<String, Integer> top = WordFrequencySorted2.mostFrequent(map, 50);
		assertEquals(704, top.get("one"));
		assertEquals(701, top.get("but"));
		assertEquals(698, top.get("have"));
	}

	@Test
	void lessFrequent() {
		Map<String, Integer> less = WordFrequencySorted2.lessFrequent(map, 50);
		assertEquals(1, less.get("zulus"));
		assertEquals(1, less.get("blasts"));
		assertEquals(1, less.get("guards"));
	}
}