package com.snapolitano.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SearchArrayTest {

	@Test
	void containsBruteForce() {
		assertTrue(SearchArray.containsBinary(new String[]{"car", "boat", "bike", "plane"}, "bike"));
		assertFalse(SearchArray.containsBinary(new String[]{"car", "boat", "bike", "plane"}, "helicopter"));
	}

	@Test
	void containsBinary() {
		assertTrue(SearchArray.containsBinary(new String[]{"car", "boat", "bike", "plane"}, "bike"));
		assertFalse(SearchArray.containsBinary(new String[]{"car", "boat", "bike", "plane"}, "helicopter"));
	}
}