package com.snapolitano.exercises.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLinePartialDelegation {
    public static String readLinePartialDelegation(String filename){
        String s;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            s = reader.readLine();
        } catch (IOException e){
            throw new RuntimeException();
        }
        return s;
    }
}
