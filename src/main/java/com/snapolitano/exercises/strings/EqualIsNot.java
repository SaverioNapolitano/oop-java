package com.snapolitano.exercises.strings;

public class EqualIsNot {
	public static boolean equalIsNot(String string) {
		StringBuilder builder = new StringBuilder(string);
		int isCount = 0;
		int notCount = 0;
		while (builder.indexOf("is") > 0 || builder.indexOf("not") > 0) {
			if (builder.indexOf("is") > 0) {
				builder.delete(builder.indexOf("is"), builder.indexOf("is") + 2);
				isCount++;
			}
			if (builder.indexOf("not") > 0) {
				builder.delete(builder.indexOf("not"), builder.indexOf("not") + 3);
				notCount++;
			}
		}
		return isCount == notCount;
	}
}
