package com.snapolitano.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FizzBuzz2Test {

	@Test
	void fizzBuzz() {
		assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz"}, FizzBuzz2.fizzBuzz(1, 6));
		assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"}, FizzBuzz2.fizzBuzz(1, 8));
		assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"},
				FizzBuzz2.fizzBuzz(1, 11));
		assertArrayEquals(new String[]{"2", "Fizz", "4", "Buzz"}, FizzBuzz2.fizzBuzz(2, 6));
	}
}