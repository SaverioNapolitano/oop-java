package com.snapolitano.exercises.functional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Words2 {

    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }
    public static long howManyLines(String filename, String subString) throws IOException {
        return getLines(filename).stream().filter(s -> s.contains(subString)).count();

    }
    public static long howManyTimes(String filename, String word) throws IOException {
        return lineToWords(getLines(filename).toString()).stream().filter(s -> s.equals(word)).count();

    }
}
