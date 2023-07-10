package com.snapolitano.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecurringChars2Test {

	@Test
	void recurringChars() {
		assertEquals(Set.of(), RecurringChars2.recurringChars("Ciao"));
		assertEquals(Set.of('l'), RecurringChars2.recurringChars("Hello"));
		assertEquals(Set.of('l', 'o'), RecurringChars2.recurringChars("Hello World!"));
	}
}