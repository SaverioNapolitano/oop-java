package com.snapolitano.exercises.nio;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileCopyMoveTest {

	final String filename = "src/main/resources/test.txt";
	final String copy = "src/main/resources/copy.txt";

	final String move = "src/main/resources/move.txt";

	@Test
	void fileCopy() {
		try {
			FileCopyMove.fileCopy(filename, copy);
			assertEquals(28, FileAttributes.size(copy));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

	@Test
	void fileMove() {
		try {
			FileCopyMove.fileMove(copy, move);
			assertEquals(28, FileAttributes.size(move));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}