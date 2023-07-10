package com.snapolitano.exercises.oop.basic;

public class Letter2 {
	String from;
	String to;
	StringBuilder lines;

	public Letter2(String from, String to) {
		this.from = from;
		this.to = to;
		lines = new StringBuilder();
		lines.append("Dear ").append(to).append(":");
		lines.append("\n");
		lines.append("\n");
		lines.append("\nSincerely,");
		lines.append("\n");
		lines.append("\n").append(from);
	}

	public void addLine(String line) {
		int index = lines.indexOf("Sincerely,");
		lines.insert(index - 1, line + "\n");
	}

	public String getText() {
		return lines.toString();
	}
}
