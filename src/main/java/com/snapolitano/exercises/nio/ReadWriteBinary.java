package com.snapolitano.exercises.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadWriteBinary {
	public static byte[] readBinaryFile(String filename) throws IOException {
		return Files.readAllBytes(Path.of(filename));
	}

	public static void writeBinaryFile(String filename, byte[] bytes) throws IOException{
		Files.write(Path.of(filename), bytes);
	}
}
