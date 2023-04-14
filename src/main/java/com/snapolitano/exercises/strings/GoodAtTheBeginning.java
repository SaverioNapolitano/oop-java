package com.snapolitano.exercises.strings;

public class GoodAtTheBeginning {
    public static boolean goodAtTheBeginning(String string) {
        if (string.length() > 4 && string.charAt(0) == 'g') {
            if (string.charAt(1) == 'o') {
                if (string.charAt(2) == 'o') {
                    return string.charAt(3) == 'd';
                }
            }
        }
        return false;
    }
}
