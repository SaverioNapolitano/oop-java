package com.snapolitano.exercises.generics;

public class CountOccurrences {
    public static <T> int countOccurrences(T[] src, T item){
        int count = 0;
        boolean isNull = item==null;
        for (T t : src) {
            if(t!=null){
                if(!isNull && t.equals(item)){
                    count++;
                }
            } else if (isNull) {
                count++;
            }
        }
        return count;
    }
}
