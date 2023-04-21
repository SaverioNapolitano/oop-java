package com.snapolitano.exercises.functional;

import java.util.List;

public class AllPalindrome {
    public static boolean allPalindrome(List<String> strings){
        return strings.stream().allMatch(s -> s.contentEquals(new StringBuilder(s).reverse()));
    }
}
