package com.snapolitano.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeTest {

	@Test
	void isPalindrome() {
		assertTrue(Palindrome.isPalindrome("radar"));
		assertTrue(Palindrome.isPalindrome("r"));
		assertTrue(Palindrome.isPalindrome(""));
		assertFalse(Palindrome.isPalindrome("whistleblower"));
	}
}