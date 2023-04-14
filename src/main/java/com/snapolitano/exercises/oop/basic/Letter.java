package com.snapolitano.exercises.oop.basic;

import java.util.ArrayList;

public class Letter {
    String from;
    String to;
    ArrayList<String> lines;

    public Letter(String from, String to){
        this.from = from;
        this.to = to;
        this.lines = new ArrayList<>();
    }
    public void addLine(String line){
        lines.add(line);
    }

    public String getText(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Dear ").append(to).append(":\n\n");
        for (String line : lines) {
            stringBuilder.append(line).append("\n");
        }
        stringBuilder.append("\nSincerely,\n\n").append(from);
        return stringBuilder.toString();
    }
}
