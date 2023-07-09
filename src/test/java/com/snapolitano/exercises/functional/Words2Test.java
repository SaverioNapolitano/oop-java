package com.snapolitano.exercises.functional;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class Words2Test {

    final String filename = "./src/main/resources/james-joyce-ulysses.txt";

    @Test
    void howManyLines() throws IOException {
        assertEquals(9, Words2.howManyLines(filename, "pride"));
        assertEquals(1, Words2.howManyLines(filename, "prejudice"));
        assertEquals(12939, Words2.howManyLines(filename, "the"));
    }

    @Test
    void howManyTimes() throws IOException {
        assertEquals(10, Words2.howManyTimes(filename, "pride"));
        assertEquals(1, Words2.howManyTimes(filename, "prejudice"));
        assertEquals(15107, Words2.howManyTimes(filename, "the"));
    }
}