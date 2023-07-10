package com.snapolitano.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValuesKeys2Test {

	@Test
	void valuesKeys() {
		assertTrue(ValuesKeys2.valuesKeys(Map.of(
				"1", "One",
				"2", "Two",
				"3", "Three",
				"One", "Joke"
		)));
		assertFalse(ValuesKeys2.valuesKeys(Map.of(
				"1", "One",
				"2", "Two",
				"3", "Three",
				"4", "Four"
		)));
	}
}