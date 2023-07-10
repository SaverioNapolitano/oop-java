package com.snapolitano.exercises.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileList {

	public static Set<String> fileList(String src) throws IOException {
		try(Stream<Path> stream = Files.walk(Path.of(src))){
			return stream.filter(Files::isRegularFile).map(Path::toString).collect(Collectors.toSet());
		}
	}
}
