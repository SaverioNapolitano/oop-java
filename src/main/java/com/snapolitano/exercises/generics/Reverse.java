package com.snapolitano.exercises.generics;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Reverse {
    public static <T> void reverse(List<T> list){
        Collections.reverse(list);
        /*for(int i=0, j = list.size()-1;i<=j;i++, j--){
            T t = list.get(i);
            list.set(i, list.get(j));
            list.set(j, t);
        }*/
    }
}
