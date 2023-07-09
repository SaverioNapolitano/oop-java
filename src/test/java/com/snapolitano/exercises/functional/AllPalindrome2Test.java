package com.snapolitano.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AllPalindrome2Test {

    @Test
    void allPalindrome() {
        assertTrue(AllPalindrome2.allPalindrome(List.of("kayak", "deed", "noon")));
        assertFalse(AllPalindrome2.allPalindrome(List.of("kayak", "hello")));
        assertFalse(AllPalindrome2.allPalindrome(List.of("hello", "world")));
    }
}