package com.snapolitano.exercises.collections;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordAfterWord2Test {

	final String filename = "src/main/resources/james-joyce-ulysses.txt";

	@Test
	void wordAfterWord() throws IOException {
		assertEquals("yesterdays", WordAfterWord2.wordAfterWord(filename, "yesterday"));
		assertEquals("gold", WordAfterWord2.wordAfterWord(filename, "goings"));
		assertEquals("zero", WordAfterWord2.wordAfterWord(filename, "zermatt"));
	}
}