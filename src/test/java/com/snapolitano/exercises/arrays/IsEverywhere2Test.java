package com.snapolitano.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsEverywhere2Test {

	@Test
	void isEverywhere() {
		assertTrue(IsEverywhere2.isEverywhere(new int[]{1, 2, 1, 3}, 1));
		assertFalse(IsEverywhere2.isEverywhere(new int[]{1, 2, 1, 3}, 2));
		assertFalse(IsEverywhere2.isEverywhere(new int[]{1, 2, 1, 3, 4}, 1));
		//assertTrue(IsEverywhere2.isEverywhere(new int[]{1, 2, 3, 1}, 1));
	}
}