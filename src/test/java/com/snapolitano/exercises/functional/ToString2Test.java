package com.snapolitano.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ToString2Test {

	@Test
	void testToString() {
		assertEquals("1, 2, 3", ToString2.toString(Stream.of(1, 2, 3, 4), 3));
	}
}