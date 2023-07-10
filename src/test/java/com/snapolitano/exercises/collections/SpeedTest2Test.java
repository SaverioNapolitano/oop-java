package com.snapolitano.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SpeedTest2Test {

	@Test
	void insertBeginning() {
		long elapsedTimeArray = SpeedTest2.insertBeginning(new ArrayList<>(List.of("a", "b", "c", "d")), "e", 10000);
		long elapsedTimeLinked = SpeedTest2.insertBeginning(new LinkedList<>(List.of("a", "b", "c", "d")), "e", 10000);
		assertTrue(elapsedTimeLinked < elapsedTimeArray);
	}

	@Test
	void insertEnd() {
		long elapsedTimeArray = SpeedTest2.insertEnd(new ArrayList<>(List.of("a", "b", "c", "d")), "e", 10000);
		long elapsedTimeLinked = SpeedTest2.insertEnd(new LinkedList<>(List.of("a", "b", "c", "d")), "e", 10000);
		assertTrue(elapsedTimeLinked > elapsedTimeArray);
	}
}