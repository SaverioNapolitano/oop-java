package com.snapolitano.exercises.arrays;

public class MatchUp2 {

    public static int matchUp(int[] v1, int[] v2){
        int count = 0;
        for(int i = 0; i < v1.length; i++){
            int diff = Math.abs(v1[i] - v2[i]);
            if(diff > 0 && diff <= 2){
                count++;
            }
        }
        return count;
    }
}
