package com.snapolitano.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SpeedTestTest {

	@Test
	void insertBeginning() {
		assertTrue(SpeedTest.insertBeginning(new ArrayList<>(), "saverio", 10000) > SpeedTest.insertBeginning(new LinkedList<>(), "saverio", 10000));
	}

	@Test
	void insertEnd() {
		assertTrue(SpeedTest.insertEnd(new ArrayList<>(), "saverio", 10000) < SpeedTest.insertEnd(new LinkedList<>(), "saverio", 10000));
	}
}