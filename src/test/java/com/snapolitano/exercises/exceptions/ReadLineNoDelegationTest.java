package com.snapolitano.exercises.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

class ReadLineNoDelegationTest {

	@Test
	void readLineNoDelegation() {
		assertNull(ReadLineNoDelegation.readLineNoDelegation("/tmp/missing"));
	}
}