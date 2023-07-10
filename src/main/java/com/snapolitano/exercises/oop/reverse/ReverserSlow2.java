package com.snapolitano.exercises.oop.reverse;

import java.util.Arrays;

public class ReverserSlow2 implements Reverser2 {

	@Override
	public String reverse(String s) {
		char[] chars = new char[s.length()];
		for (int i = 0, j = s.length() - 1; i < s.length() && j >= 0; i++, j--) {
			chars[i] = s.charAt(j);
		}
		return Arrays.toString(chars);
	}
}
