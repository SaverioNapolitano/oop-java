package com.snapolitano.exercises.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Append2Test {

	@Test
	void append() {
		List<Integer> list = new ArrayList<>();
		Append2.append(list, new ArrayList<>(List.of(1, 2)));
		assertEquals(List.of(1, 2), list);
		list = new ArrayList<>(List.of(1, 2));
		Append2.append(list, new ArrayList<>(List.of(3, 4)));
		assertEquals(List.of(1, 2, 3, 4), list);
		List<String> strings = new ArrayList<>(List.of("a", "c"));
		Append2.append(strings, new ArrayList<>(List.of("c", "d")));
		assertEquals(List.of("a", "c", "c", "d"), strings);
	}
}