package com.snapolitano.exercises.collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordFrequency {
    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }

    public static int howMany(List<String> list, String string){
        int count = 0;
        for (String s : list) {
            if (s.contentEquals(string)) {
                count++;
            }
        }
        return count;
    }
    public static Map<String, Integer> wordFrequency(String filename) throws IOException {
        List<String> words = lineToWords(getLines(filename).toString());
        Set<String> set = new HashSet<>(words);
        Map<String, Integer> map = new HashMap<>();
        for (String s : set) {
            map.put(s, howMany(words, s));
        }
        return map;

    }
}
