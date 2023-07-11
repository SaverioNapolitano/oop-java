package com.snapolitano.exercises.nio;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class CopyTextLongTest {

	final String src = "src/main/resources/copyfile.txt";
	final String dst = "src/main/resources/move.txt";

	@Test
	void copyTextLong() {
		CopyTextLong.copyTextLong(src, dst);
		try {
			assertEquals(-1, Files.mismatch(Path.of(src), Path.of(dst)));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}