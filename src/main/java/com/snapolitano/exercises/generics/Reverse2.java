package com.snapolitano.exercises.generics;

import java.util.ArrayList;
import java.util.List;

public class Reverse2 {
    public static <T> void reverse(List<T> list){
        List<T> copyList = new ArrayList<>(list.subList(0, list.size()));
        for(int i = 0, j = list.size() - 1; i < list.size(); i++, j--){
            list.set(i, copyList.get(j));
        }
    }
}
