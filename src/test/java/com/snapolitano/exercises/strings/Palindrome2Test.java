package com.snapolitano.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Palindrome2Test {

    @Test
    void isPalindrome() {
        assertFalse(Palindrome2.isPalindrome("whistleblower"));
        assertTrue(Palindrome2.isPalindrome("radar"));
        assertTrue(Palindrome2.isPalindrome("r"));
        assertTrue(Palindrome2.isPalindrome(""));
    }
}