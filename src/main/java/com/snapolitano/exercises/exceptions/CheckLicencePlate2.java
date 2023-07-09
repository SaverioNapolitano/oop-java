package com.snapolitano.exercises.exceptions;

public class CheckLicencePlate2 {
    public static void checkLicencePlate(String licence){
        if(licence.length() != 7 || !Character.isLetter(licence.charAt(0)) || !Character.isLetter(licence.charAt(1)) || !Character.isDigit(licence.charAt(2)) || !Character.isDigit(licence.charAt(3)) || !Character.isDigit(licence.charAt(4)) || !Character.isLetter(licence.charAt(5)) || !Character.isLetter(licence.charAt(6))){
            throw new IllegalArgumentException("License does not respect the format LLNNNLL");
        }
    }
}
