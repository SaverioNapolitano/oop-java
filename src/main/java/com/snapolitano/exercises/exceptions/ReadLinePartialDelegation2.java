package com.snapolitano.exercises.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLinePartialDelegation2 {
    public static String readLinePartialDelegation(String filename){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))){
            return bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
