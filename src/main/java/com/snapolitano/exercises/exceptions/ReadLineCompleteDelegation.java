package com.snapolitano.exercises.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineCompleteDelegation {
	public static String readLineCompleteDelegation(String filename) throws IOException {
		String s;
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			s = reader.readLine();
		}
		return s;
	}
}
