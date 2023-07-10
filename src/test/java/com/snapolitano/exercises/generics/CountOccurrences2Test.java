package com.snapolitano.exercises.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountOccurrences2Test {

	@Test
	void countOccurrences() {
		assertEquals(3, CountOccurrences2.countOccurrences(new Integer[]{1, 2, 2, 2}, 2));
		assertEquals(2, CountOccurrences2.countOccurrences(new Integer[]{null, null, 3, 4}, null));
		assertEquals(1, CountOccurrences2.countOccurrences(new String[]{"hello", "world", null, null}, "hello"));
	}
}