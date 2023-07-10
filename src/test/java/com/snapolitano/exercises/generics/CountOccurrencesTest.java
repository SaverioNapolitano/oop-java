package com.snapolitano.exercises.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountOccurrencesTest {

	@Test
	void countOccurrences() {
		assertEquals(3, CountOccurrences.countOccurrences(new Integer[]{1, 2, 2, 2}, 2));
		assertEquals(2, CountOccurrences.countOccurrences(new Integer[]{null, null, 3, 4}, null));
		assertEquals(1, CountOccurrences.countOccurrences(new String[]{"hello", "world", null, null}, "hello"));
	}
}