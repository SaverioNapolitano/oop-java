package com.snapolitano.exercises.generics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Measure2Test {
	Measure2.Measurer<Integer> measurer;

	@BeforeEach
	void setUp() {
		measurer = obj -> Double.parseDouble(obj.toString());
	}

	@Test
	void max() {
		assertEquals(4, Measure2.max(new Integer[]{3, 1, 4, 2}, measurer));
	}

	@Test
	void min() {
		assertEquals(1, Measure2.min(new Integer[]{3, 1, 4, 2}, measurer));
	}
}