package com.snapolitano.exercises.strings;

public class Palindrome {
	public static boolean isPalindrome(String string) {
		String str = Reverse.reverse(string);
		return str.equals(string);
	}
}
