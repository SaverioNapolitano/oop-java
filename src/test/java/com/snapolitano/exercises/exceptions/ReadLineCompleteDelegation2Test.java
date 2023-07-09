package com.snapolitano.exercises.exceptions;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ReadLineCompleteDelegation2Test {

    final String filename = "src/main/resources/james-joyce-ulysses.txt";

    @Test
    void readLineCompleteDelegation() {
        try {
            assertEquals("\uFEFFThe Project Gutenberg EBook of Ulysses, by James Joyce",
                    ReadLineCompleteDelegation2.readLineCompleteDelegation(filename));
        } catch (IOException ignored) {

        }
        assertThrows(IOException.class, () -> ReadLineCompleteDelegation2.readLineCompleteDelegation("invalid path"));
    }
}