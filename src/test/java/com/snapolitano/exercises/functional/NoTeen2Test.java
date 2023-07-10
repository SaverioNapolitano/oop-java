package com.snapolitano.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NoTeen2Test {

	@Test
	void noTeen() {
		assertEquals(List.of(12, 20), NoTeen2.noTeen(new ArrayList<>(List.of(12, 13, 19, 20))));
		assertEquals(List.of(1, 1), NoTeen2.noTeen(new ArrayList<>(List.of(1, 14, 1))));
		assertEquals(List.of(), NoTeen2.noTeen(new ArrayList<>(List.of(15))));
	}
}