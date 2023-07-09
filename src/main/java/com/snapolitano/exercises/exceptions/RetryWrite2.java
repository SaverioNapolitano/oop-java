package com.snapolitano.exercises.exceptions;

import java.io.IOException;

public class RetryWrite2 {
    public static void main(String[] args) {
        try {
            writeWithTries(3);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeWithTries(int maxTries) {
        int i;
        String message = "something";
        for (i = 0; i < maxTries; i++) {
            try{
                write(message);
                break;
            } catch (IOException ignored) {

            }
        }
        if(i == maxTries){
            throw new RuntimeException("Unable to send: " + message);
        }
    }

    public static void write(String message) throws IOException {
        throw new IOException("Unable to send: " + message);
    }
}
