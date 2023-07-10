package com.snapolitano.exercises.nio;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileAttributesTest {

	final String filename = "src/main/resources/test.txt";

	@Test
	void exists() {
		assertTrue(FileAttributes.exists(filename));
	}

	@Test
	void isReadable() {
		assertTrue(FileAttributes.isReadable(filename));
	}

	@Test
	void isWritable() {
		assertTrue(FileAttributes.isWritable(filename));
	}

	@Test
	void isExecutable() {
		assertFalse(FileAttributes.isExecutable(filename));
	}

	@Test
	void isRegularFile() {
		assertTrue(FileAttributes.isRegularFile(filename));
	}

	@Test
	void isDirectory() {
		assertFalse(FileAttributes.isDirectory(filename));
	}

	@Test
	void size() {
		try {
			assertEquals(28, FileAttributes.size(filename));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}