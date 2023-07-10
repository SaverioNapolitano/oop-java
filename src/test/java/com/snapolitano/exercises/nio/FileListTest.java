package com.snapolitano.exercises.nio;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FileListTest {

	final String src = "src/main/resources/filelisttest";

	@Test
	void fileList() {
		try {
			assertEquals(Set.of("file.txt", "file1.txt"), FileList.fileList(src));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}