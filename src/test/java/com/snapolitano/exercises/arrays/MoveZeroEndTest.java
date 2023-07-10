package com.snapolitano.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZeroEndTest {

	@Test
	void moveZerosEnd() {
		assertArrayEquals(new int[]{4, 2, 0, 0}, MoveZeroEnd.moveZerosEnd(new int[]{0, 0, 4, 2}));
		assertArrayEquals(new int[]{9, 4, 0, 0}, MoveZeroEnd.moveZerosEnd(new int[]{9, 0, 0, 4}));
		assertArrayEquals(new int[]{1, 0, 0, 0}, MoveZeroEnd.moveZerosEnd(new int[]{1, 0, 0, 0}));
	}
}