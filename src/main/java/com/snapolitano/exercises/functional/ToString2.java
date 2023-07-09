package com.snapolitano.exercises.functional;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToString2 {
    public static <T> String toString(Stream<T> stream, int n){
        return stream
                .map(Object::toString)
                .limit(Long.parseLong(String.valueOf(n))).collect(Collectors.joining(", "));
    }
}
