package com.snapolitano.exercises.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ReadLinePartialDelegation2Test {

	final String filename = "src/main/resources/james-joyce-ulysses.txt";

	@Test
	void readLinePartialDelegation() {
		assertEquals("\uFEFFThe Project Gutenberg EBook of Ulysses, by James Joyce",
				ReadLinePartialDelegation2.readLinePartialDelegation(filename));
		assertThrows(RuntimeException.class, () -> ReadLinePartialDelegation2.readLinePartialDelegation("/tmp/missing"));
	}
}