package com.snapolitano.exercises.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class PortableDesktopPath {

	public static String portableDesktopPath() throws IOException {
		return System.getProperty("user.home") + System.getProperty("file.separator") + "Desktop";
	}
}
