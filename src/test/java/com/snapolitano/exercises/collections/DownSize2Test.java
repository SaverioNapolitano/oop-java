package com.snapolitano.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DownSize2Test {

	@Test
	void downsize() {
		List<String> strings = new ArrayList<>(List.of("A", "B", "C", "D", "E", "F"));
		DownSize2.downsize(strings, 2);
		assertEquals(List.of("A", "C", "E"), strings);
		strings = new ArrayList<>(List.of("A", "B", "C", "D", "E", "F"));
		DownSize2.downsize(strings, 3);
		assertEquals(List.of("A", "B", "D", "E"), strings);
	}
}