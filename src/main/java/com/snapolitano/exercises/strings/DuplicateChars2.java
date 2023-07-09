package com.snapolitano.exercises.strings;

import java.util.Arrays;

public class DuplicateChars2 {
    public static char[] duplicateChars(String string){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if(string.indexOf(c) != string.lastIndexOf(c) && !stringBuilder.toString().contains(Character.toString(c))){
                stringBuilder.append(c);
            }
        }
        char[] chars = stringBuilder.toString().toCharArray();
        Arrays.sort(chars);
        return chars;
    }
}
