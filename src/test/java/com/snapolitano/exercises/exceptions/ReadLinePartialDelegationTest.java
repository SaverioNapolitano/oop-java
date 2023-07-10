package com.snapolitano.exercises.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ReadLinePartialDelegationTest {

	@Test
	void readLinePartialDelegation() {
		assertThrows(RuntimeException.class, () -> ReadLinePartialDelegation.readLinePartialDelegation("/tmp/missing"));
	}
}