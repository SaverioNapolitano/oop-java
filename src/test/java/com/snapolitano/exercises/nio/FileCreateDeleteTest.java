package com.snapolitano.exercises.nio;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileCreateDeleteTest {

	final String filename = "src/main/resources/create.txt";

	@Test
	void createFile() {
		try {
			FileCreateDelete.createFile(filename);
			assertTrue(FileAttributes.exists(filename));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Test
	void deleteFile() {
		try {
			FileCreateDelete.deleteFile(filename);
			assertFalse(FileAttributes.exists(filename));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}