package com.snapolitano.exercises.exceptions;

import java.io.IOException;

public class RetryWrite {
    public static void main(String[] args) {
        try {
            writeWithTries(3);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeWithTries(int maxTries) {
        boolean valid = false;
        for (int i = 0; i < maxTries; i++) {
            try {
                write("Message");
                valid = true;
                break;
            } catch (IOException ignored) {

            }
        }
        if (!valid) {
            throw new RuntimeException();
        }
    }

    public static void write(String message) throws IOException {
        throw new IOException("Unable to send: " + message);
    }
}
