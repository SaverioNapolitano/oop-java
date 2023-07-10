package com.snapolitano.exercises.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinMax2Test {

	@Test
	void max() {
		assertEquals(5, MinMax2.max(new ArrayList<>(List.of(3, 5, 1, 2, 4)), Comparator.naturalOrder()));
		assertEquals("strings", MinMax2.max(new ArrayList<>(List.of("hello", "world", "test", "strings")), Comparator.comparingInt(String::length)));
	}

	@Test
	void min() {
		assertEquals(1, MinMax2.min(new ArrayList<>(List.of(3, 5, 1, 2, 4)), Comparator.naturalOrder()));
		assertEquals("test", MinMax2.min(new ArrayList<>(List.of("hello", "world", "test", "strings")),
				Comparator.comparingInt(String::length)));
	}
}