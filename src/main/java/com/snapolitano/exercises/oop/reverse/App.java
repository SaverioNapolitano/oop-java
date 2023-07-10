package com.snapolitano.exercises.oop.reverse;

public class App {

	public static void main(String[] args) {
		Reverser reverser = s -> new StringBuilder(s).reverse().toString();
		System.out.println(reverser.reverse("String to revert"));
	}
}
