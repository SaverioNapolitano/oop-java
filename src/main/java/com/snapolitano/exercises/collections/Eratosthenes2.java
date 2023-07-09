package com.snapolitano.exercises.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Eratosthenes2 {
    public static Set<Integer> eratosthenes(int n){
        Set<Integer> integers = new HashSet<>();
        for(int i = 2; i <= n; i++){
            integers.add(i);
        }
        for(int i = 2; i <= Math.sqrt(Integer.valueOf(n).doubleValue()); i++){
            int j = i;
            integers =
                    integers.stream().filter(integer -> integer.equals(j) || integer % j != 0).collect(Collectors.toSet());
        }
        return integers;
    }
}
