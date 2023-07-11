package com.snapolitano.exercises.nio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CopyTextLong {
	public static void copyTextLong(String src, String dst){
		try(BufferedReader bufferedReader = new BufferedReader(Files.newBufferedReader(Path.of(src)));
			BufferedWriter bufferedWriter = new BufferedWriter(Files.newBufferedWriter(Path.of(dst)))){
			String line;
			while((line = bufferedReader.readLine()) != null){
				bufferedWriter.write(line);
				bufferedWriter.newLine();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
