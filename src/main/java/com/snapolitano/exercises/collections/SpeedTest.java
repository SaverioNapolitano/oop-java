package com.snapolitano.exercises.collections;

import java.util.List;

public class SpeedTest {

	public static long insertBeginning(List<String> list, String item, int times) {
		long start = System.nanoTime();
		for (int i = 0; i < times; i++) {
			list.add(0, item);
		}
		long end = System.nanoTime();
		return end - start;
	}

	public static long insertEnd(List<String> list, String item, int times) {
		long start = System.nanoTime();
		for (int i = 0; i < times; i++) {
			list.add(list.size(), item);
		}
		long end = System.nanoTime();
		return end - start;
	}
}
