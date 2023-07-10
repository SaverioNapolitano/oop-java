package com.snapolitano.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntersectionTest {

	@Test
	void intersection() {
		assertEquals(new HashSet<>(), Intersection.intersection(new HashSet<>(Set.of(1, 2, 3)), new HashSet<>(Set.of(4, 5, 6))));
		assertEquals(new HashSet<>(Set.of(3)), Intersection.intersection(new HashSet<>(Set.of(1, 2, 3)), new HashSet<>(Set.of(3, 4, 5))));
	}
}