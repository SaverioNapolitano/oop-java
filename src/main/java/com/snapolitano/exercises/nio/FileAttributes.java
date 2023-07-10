package com.snapolitano.exercises.nio;

import java.io.File;
import java.io.IOException;

public class FileAttributes {
	public static boolean exists(String filename) {
		return new File(filename).exists();
	}

	public static boolean isReadable(String filename) {
		return new File(filename).canRead();
	}

	public static boolean isWritable(String filename) {
		return new File(filename).canWrite();
	}

	public static boolean isExecutable(String filename) {
		return new File(filename).canExecute();
	}

	public static boolean isRegularFile(String filename) {
		return new File(filename).isFile();
	}

	public static boolean isDirectory(String filename) {
		return new File(filename).isDirectory();
	}

	public static long size(String filename) throws IOException {
		return new File(filename).length();
	}
}
