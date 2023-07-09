package com.snapolitano.exercises.functional;

import java.util.List;
import java.util.stream.Collectors;

public class NoYY2 {
    public static List<String> noYY(List<String> strings){
        return strings.stream().map(s -> s + 'y').filter(s -> !s.endsWith("yy")).collect(Collectors.toList());
    }
}
