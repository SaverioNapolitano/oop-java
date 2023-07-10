package com.snapolitano.exercises.generics;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IterableToString2Test {

	@Test
	void iterableToString() {
		assertEquals("1, 2, 3, ", IterableToString2.iterableToString(List.of(1, 2, 3)));
		assertEquals("a, b, c, ", IterableToString2.iterableToString(List.of("a", "b", "c")));
	}
}