package com.snapolitano.exercises.collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordFrequencySorted2 {

    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }
    public static Map<String, Integer> wordFrequency(String filename) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        for (String line : getLines(filename)) {
            for (String word : lineToWords(line)) {
                if(map.containsKey(word)){
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
        }
        return map;
    }
    public static Map<String, Integer> mostFrequent(Map<String, Integer> map, int limit){
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        Map<String, Integer> frequencyMap = new LinkedHashMap<>();
        List<Map.Entry<String, Integer>> limitedList =
                list.stream().limit(Integer.valueOf(limit).longValue()).toList();
        for (Map.Entry<String, Integer> entry: limitedList){
            frequencyMap.put(entry.getKey(), entry.getValue());
        }
        return frequencyMap;
    }
    public static Map<String, Integer> lessFrequent(Map<String, Integer> map, int limit){
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Map<String, Integer> frequencyMap = new LinkedHashMap<>();
        List<Map.Entry<String, Integer>> limitedList =
                list.stream().limit(Integer.valueOf(limit).longValue()).toList();
        for (Map.Entry<String, Integer> entry: limitedList){
            frequencyMap.put(entry.getKey(), entry.getValue());
        }
        return frequencyMap;
    }
}
