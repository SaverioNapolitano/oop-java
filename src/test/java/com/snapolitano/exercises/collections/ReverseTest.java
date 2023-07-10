package com.snapolitano.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseTest {

	@Test
	void reverse() {
		assertEquals(new ArrayList<>(List.of("World!", "Hello")), Reverse.reverse(new ArrayList<>(List.of("Hello", "World!"))));
		assertEquals(new ArrayList<>(List.of("am", "I")), Reverse.reverse(new ArrayList<>(List.of("I", "am"))));
	}
}