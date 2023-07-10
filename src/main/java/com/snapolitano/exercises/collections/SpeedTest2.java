package com.snapolitano.exercises.collections;

import java.util.List;

public class SpeedTest2 {
	public static long insertBeginning(List<String> list, String item, int times) {
		long start = System.nanoTime();
		for (int i = 0; i < times; i++) {
			list.add(0, item);
		}
		return System.nanoTime() - start;
	}

	public static long insertEnd(List<String> list, String item, int times) {
		long start = System.nanoTime();
		for (int i = 0; i < times; i++) {
			list.add(item);
		}
		return System.nanoTime() - start;
	}
}
