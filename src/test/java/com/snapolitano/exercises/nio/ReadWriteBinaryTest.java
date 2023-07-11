package com.snapolitano.exercises.nio;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class ReadWriteBinaryTest {

	final String filename = "src/main/resources/test.txt";

	final String dst = "src/main/resources/move.txt";

	@Test
	void BinaryFile() {
		try {
			ReadWriteBinary.writeBinaryFile(dst, ReadWriteBinary.readBinaryFile(filename));
			assertEquals(-1, Files.mismatch(Path.of(dst), Path.of(filename)));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}