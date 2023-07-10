package com.snapolitano.exercises.exceptions;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CheckString2Test {

	@Test
	void checkString() {
		assertThrows(ParseException.class, () -> CheckString2.checkString("a0b3h4zr4"));
	}
}