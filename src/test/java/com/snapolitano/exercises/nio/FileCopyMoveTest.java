package com.snapolitano.exercises.nio;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class FileCopyMoveTest {

	final String filename = "src/main/resources/test.txt";
	final String copy = "src/main/resources/copy.txt";
	final String copyFile = "src/main/resources/copyfile.txt";

	final String move = "src/main/resources/move.txt";

	@Test
	void fileCopy() {
		try {
			FileCopyMove.fileCopy(filename, copy);
			assertEquals(-1, Files.mismatch(Path.of(filename), Path.of(copy)));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

	@Test
	void fileMove() {
		try {
			Path target = Path.of(copyFile);
			Files.copy(Path.of(copy), target);
			FileCopyMove.fileMove(copy, move);
			assertEquals(-1, Files.mismatch(Path.of(move), target));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}