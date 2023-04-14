package com.snapolitano.exercises.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Intersection {
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second){
        Set<Integer> integerSet = new HashSet<>();
        for(Iterator<Integer> i=first.iterator();i.hasNext();){
            Integer integer = i.next();
            if(second.contains(integer)){
                integerSet.add(integer);
            }
        }
        return integerSet;
    }
}
