package com.snapolitano.exercises.oop.reverse;

public class TestApp {
    public static void main(String[] args) {
        String s = "hello world!";
        Reverser2 r = s1 -> new ReverserFast2().reverse(s1);
        String a = r.reverse(s);
        System.out.println(a);
    }
}
