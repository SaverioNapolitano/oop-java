package com.snapolitano.exercises.arrays;

public class FizzBuzz2 {
    public static String[] fizzBuzz(int start, int end){
        final int FIZZ = 3;
        final int BUZZ = 5;
        int j = 0;
        String[] strings = new String[end - start];
        for(int i = start; i < end; i++){
            if(i % FIZZ == 0 && i % BUZZ == 0){
                strings[j] = "FizzBuzz";
            } else if (i % FIZZ == 0) {
                strings[j] = "Fizz";
            } else if (i % BUZZ == 0) {
                strings[j] = "Buzz";
            } else {
                strings[j] = Integer.toString(i);
            }
            j++;
        }
        return strings;
    }
}
