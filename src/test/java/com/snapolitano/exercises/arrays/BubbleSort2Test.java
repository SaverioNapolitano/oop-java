package com.snapolitano.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSort2Test {

	@Test
	void bubbleSort() {
		int[] array1 = new int[]{6, 3, 4, 2};
		int[] array2 = new int[]{9, 8, 7, 4};
		int[] array3 = new int[]{1, 0, 0, 0};
		BubbleSort2.bubbleSort(array1);
		BubbleSort2.bubbleSort(array2);
		BubbleSort2.bubbleSort(array3);
		assertArrayEquals(new int[]{2, 3, 4, 6}, array1);
		assertArrayEquals(new int[]{4, 7, 8, 9}, array2);
		assertArrayEquals(new int[]{0, 0, 0, 1}, array3);
	}

	@Test
	void bubbleSortCopy() {
		assertArrayEquals(new int[]{2, 3, 4, 6}, BubbleSort2.bubbleSortCopy(new int[]{6, 3, 4, 2}));
		assertArrayEquals(new int[]{4, 7, 8, 9}, BubbleSort2.bubbleSortCopy(new int[]{9, 8, 7, 4}));
		assertArrayEquals(new int[]{0, 0, 0, 1}, BubbleSort2.bubbleSortCopy(new int[]{1, 0, 0, 0}));
	}
}