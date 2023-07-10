package com.snapolitano.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Reverse2Test {

	@Test
	void reverse() {
		assertEquals(List.of("World!", "Hello"), Reverse2.reverse(new ArrayList<>(List.of("Hello", "World!"))));
		assertEquals(List.of("am", "I"), Reverse2.reverse(new ArrayList<>(List.of("I", "am"))));
	}
}