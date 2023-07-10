package com.snapolitano.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Eratosthenes2Test {

	@Test
	void eratosthenes() {
		assertEquals(Set.of(2, 3, 5, 7, 11, 13), Eratosthenes2.eratosthenes(15));
	}
}