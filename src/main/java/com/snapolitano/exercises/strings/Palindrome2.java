package com.snapolitano.exercises.strings;

public class Palindrome2 {
    public static boolean isPalindrome(String string){
        return string.equalsIgnoreCase(new StringBuilder(string).reverse().toString());
    }
}
