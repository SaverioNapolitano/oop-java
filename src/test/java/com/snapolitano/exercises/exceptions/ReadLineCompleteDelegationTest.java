package com.snapolitano.exercises.exceptions;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ReadLineCompleteDelegationTest {

	@Test
	void readLineCompleteDelegation() {
		assertThrows(IOException.class, () -> ReadLineCompleteDelegation.readLineCompleteDelegation("/tmp/missing"));
	}
}