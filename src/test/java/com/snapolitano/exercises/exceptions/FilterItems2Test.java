package com.snapolitano.exercises.exceptions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FilterItems2Test {

	@Test
	void filterItems() {
		assertEquals(List.of("a1b2", "q8a7c9", "a0b3h4z1r4"), FilterItems2.filterItems(List.of("a", "22", "a1b2",
				"q8a7c9", "a1b2c3dr", "a0b3h4z1r4")));
	}
}