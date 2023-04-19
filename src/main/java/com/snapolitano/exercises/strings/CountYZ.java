package com.snapolitano.exercises.strings;

import java.util.Scanner;

public class CountYZ {
    public static int countYZ(String string) {
        Scanner scanner = new Scanner(string);
        int count = 0;
        String str;
        while (scanner.hasNext()) {
            str = scanner.next();
            if (str.endsWith("y") || str.endsWith("z") || str.endsWith("Y") || str.endsWith("Z")) {
                count++;
            }
        }
        return count;
    }
}
