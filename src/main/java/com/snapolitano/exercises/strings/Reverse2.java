package com.snapolitano.exercises.strings;

public class Reverse2 {
	public static String reverse(String string) {
		StringBuilder stringBuilder = new StringBuilder(string);
        /*StringBuilder stringBuilder1 = new StringBuilder();
        for(int i = string.length() - 1; i >= 0; i--){
            stringBuilder1.append(string.charAt(i));
        }
        return stringBuilder1.toString();*/
		return stringBuilder.reverse().toString();
	}
}
