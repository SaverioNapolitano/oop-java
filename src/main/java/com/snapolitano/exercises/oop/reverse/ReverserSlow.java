package com.snapolitano.exercises.oop.reverse;

public class ReverserSlow implements Reverser {

	@Override
	public String reverse(String s) {
		char[] chars = new char[s.length()];
		int j = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			chars[j] = s.charAt(i);
			j++;
		}
		return String.valueOf(chars);
	}
}
