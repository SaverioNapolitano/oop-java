package com.snapolitano.exercises.collections;

import java.util.HashSet;
import java.util.Set;

public class RecurringChars2 {
    public static Set<Character> recurringChars(String string){
        Set<Character> characters = new HashSet<>();
        for(int i = 0; i < string.length(); i++){
            char c = string.charAt(i);
            if(string.indexOf(c) != string.lastIndexOf(c)){
                characters.add(c);
            }
        }
        return characters;
    }
}
