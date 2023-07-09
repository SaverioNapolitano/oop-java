package com.snapolitano.exercises.collections;

import java.util.ArrayDeque;
import java.util.List;

public class Reverse {
    public static List<String> reverse(List<String> sentence) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>(sentence.size());
        for (String string : sentence) {
            arrayDeque.addFirst(string);
        }
        sentence.clear();
        sentence.addAll(arrayDeque);
        arrayDeque.clear();
        return sentence;
    }
}
