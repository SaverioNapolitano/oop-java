package com.snapolitano.exercises.strings;

public class EqualIsNot2 {
	public static boolean equalIsNot(String string) {
		int countIs = 0;
		int countNot = 0;
		String sub = string;
		while (sub.indexOf("is") != sub.lastIndexOf("is")) {
			countIs++;
			sub = sub.substring(sub.indexOf("is") + 2);
		}
		if (sub.contains("is")) {
			countIs++;
		}
		sub = string;
		while (sub.indexOf("not") != sub.lastIndexOf("not")) {
			countNot++;
			sub = sub.substring(sub.indexOf("not") + 3);
		}
		if (sub.contains("not")) {
			countNot++;
		}
		return countIs == countNot;
	}
}
