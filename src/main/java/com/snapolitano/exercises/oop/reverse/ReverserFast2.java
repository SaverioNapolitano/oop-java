package com.snapolitano.exercises.oop.reverse;

public class ReverserFast2 implements Reverser2 {
	@Override
	public String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}
}
