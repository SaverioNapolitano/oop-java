package com.snapolitano.exercises.collections;

import java.util.Iterator;
import java.util.List;

public class DownSize {
	public static void downsize(List<String> list, int n) {
		int count = 1;
		for (Iterator<String> i = list.iterator(); i.hasNext(); ) {
			i.next();
			if (count % n == 0) {
				i.remove();
			}
			count++;
		}
	}
}
