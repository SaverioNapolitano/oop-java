package com.snapolitano.exercises.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ReadLineNoDelegation2Test {

	final String filename = "src/main/resources/james-joyce-ulysses.txt";

	@Test
	void readLineNoDelegation() {
		assertEquals("\uFEFFThe Project Gutenberg EBook of Ulysses, by James Joyce",
				ReadLineNoDelegation2.readLineNoDelegation(filename));
		assertNull(ReadLineNoDelegation2.readLineNoDelegation("/tmp/missing"));
	}
}