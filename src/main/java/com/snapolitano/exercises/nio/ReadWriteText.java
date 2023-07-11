package com.snapolitano.exercises.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadWriteText {
	public static List<String> readTextFile(String filename) throws IOException {
		return Files.readAllLines(Path.of(filename));
	}

	public static <T extends CharSequence> void writeTextFile(String filename, List<T> lines) throws IOException{
		Files.write(Path.of(filename), lines);
	}
}
