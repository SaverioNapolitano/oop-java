package com.snapolitano.exercises.exceptions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FilterItemsTest {

	@Test
	void filterItems() {
		List<String> src = new ArrayList<>(List.of("aab3h4z1r4", "a0b3h4z1rr", "a0b3h4z1r4", "a0"));
		assertEquals(List.of("a0b3h4z1r4", "a0"), FilterItems.filterItems(src));
	}
}