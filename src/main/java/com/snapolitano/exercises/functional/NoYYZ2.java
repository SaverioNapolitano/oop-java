package com.snapolitano.exercises.functional;

import java.util.List;
import java.util.stream.Collectors;

public class NoYYZ2 {
    public static List<String> noYYZ(List<String> strings){
        return strings.stream().map(s -> s + "y").filter(s -> !s.endsWith("yy")).peek(s -> {if(s.startsWith("z"))
            System.out.println(s);}).collect(Collectors.toList());
    }
}
