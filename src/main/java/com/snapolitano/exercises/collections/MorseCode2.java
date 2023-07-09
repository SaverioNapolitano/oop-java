package com.snapolitano.exercises.collections;

import java.util.HashMap;
import java.util.Map;

public class MorseCode2 {
    static Map<Character, String> conversionTable() {
        Map<Character, String> map = new HashMap<>();
        map.put('a', "._");
        map.put('b', "_...");
        map.put('c', "_._.");
        map.put('d', "_..");
        map.put('e', ".");
        map.put('f', ".._.");
        map.put('g', "__.");
        map.put('h', "....");
        map.put('i', "..");
        map.put('j', ".___");
        map.put('k', "_._");
        map.put('l', "._..");
        map.put('m', "__");
        map.put('n', "_.");
        map.put('o', "___");
        map.put('p', ".__.");
        map.put('q', "__._");
        map.put('r', "._.");
        map.put('s', "...");
        map.put('t', "_");
        map.put('u', ".._");
        map.put('v', "..._");
        map.put('w', ".__");
        map.put('x', "_.._");
        map.put('y', "_.__");
        map.put('z', "__..");
        return map;
    }

    public static String morseCode(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        Map<Character, String> map = conversionTable();
        for (int i = 0; i < string.length(); i++) {
            if (map.containsKey(string.charAt(i))) {
                stringBuilder.append(map.get(string.charAt(i))).append(" ");
            } else {
                throw new IllegalArgumentException("Character not supported");
            }
        }
        return stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString();
    }
}
