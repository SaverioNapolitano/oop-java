package com.snapolitano.exercises.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineNoDelegation {
	public static String readLineNoDelegation(String filename) {
		String s;
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			s = reader.readLine();
		} catch (IOException e) {
			return null;
		}
		return s;
	}
}
