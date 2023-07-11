package com.snapolitano.exercises.nio;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class CopyBinaryLongTest {

	final String src = "src/main/resources/move.txt";
	final String dst = "src/main/resources/test.txt";

	@Test
	void copyBinaryLong() {
		CopyBinaryLong.copyBinaryLong(src, dst);
		try {
			assertEquals(-1, Files.mismatch( Path.of(src), Path.of(dst)));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}