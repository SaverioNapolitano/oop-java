package com.snapolitano.exercises.strings;

import java.util.Scanner;

public class CountYZ2 {

    public static int countYZ(String string){
        Scanner scanner = new Scanner(string);
        int count = 0;
        while(scanner.hasNext()){
            String word = scanner.next();
            if(word.endsWith("y") || word.endsWith("z") || word.endsWith("Y") || word.endsWith("Z")){
                count++;
            }
        }
        return count;
    }
}
