package com.snapolitano.exercises.nio;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReadWriteTextTest {

	final String filename = "src/main/resources/test.txt";

	final String dst = "src/main/resources/copyfile.txt";

	@Test
	void readTextFile() {
		try {
			assertEquals(List.of("test file for nio exercises.", "another line for further tests."),
					ReadWriteText.readTextFile(filename));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Test
	void writeTextFile() {
		try {
			ReadWriteText.writeTextFile(dst, ReadWriteText.readTextFile(filename));
			assertEquals(-1, Files.mismatch(Path.of(dst), Path.of(filename)));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}