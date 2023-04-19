package com.snapolitano.exercises.collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordAfterWord {
    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }

    public static String wordAfterWord(String filename, String word) throws IOException {
        ArrayList<String> book = new ArrayList<>(getLines(filename));
        String ulysses = book.toString().toLowerCase();
        ArrayList<String> list = new ArrayList<>(lineToWords(ulysses));
        TreeSet<String> treeSet = new TreeSet<>(list);
        SortedSet<String> subset = treeSet.tailSet(word);
        subset.remove(word);
        return subset.first();
    }
}
