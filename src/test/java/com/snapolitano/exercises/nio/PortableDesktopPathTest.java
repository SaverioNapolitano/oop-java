package com.snapolitano.exercises.nio;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class PortableDesktopPathTest {

	@Test
	void portableDesktopPath() {
		try {
			assertEquals("/Users/saverionapolitano/Desktop", PortableDesktopPath.portableDesktopPath());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}