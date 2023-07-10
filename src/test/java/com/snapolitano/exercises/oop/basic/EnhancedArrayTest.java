package com.snapolitano.exercises.oop.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnhancedArrayTest {

	EnhancedArray enhancedArray = new EnhancedArray(5);

	@Test
	void size() {
		assertEquals(5, enhancedArray.size());
	}

	@Test
	void contains() {
		enhancedArray.resetZero();
		enhancedArray.set(3, -5);
		assertTrue(enhancedArray.contains(-5));
	}

	@Test
	void resetZero() {
		enhancedArray.set(3, -5);
		enhancedArray.resetZero();
		assertArrayEquals(new int[]{0, 0, 0, 0, 0}, enhancedArray.toArray());
	}

	@Test
	void toArray() {
		int[] copy = enhancedArray.toArray();
		assertArrayEquals(copy, enhancedArray.array);
	}
}