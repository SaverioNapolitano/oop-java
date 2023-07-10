package com.snapolitano.exercises.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCreateDelete {
	public static void createFile(String src) throws IOException{
		Files.createFile(Path.of(src));
	}
	public static void deleteFile(String src) throws IOException{
		Files.deleteIfExists(Path.of(src));
	}
}
