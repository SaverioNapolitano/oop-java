package com.snapolitano.exercises.exceptions;

import java.time.LocalDate;

public class CheckIntervalBetweenDates {
    public static boolean checkIntervalBetweenDates(String begin, String end) {
        LocalDate firstDate = LocalDate.parse(begin);
        LocalDate secondDate = LocalDate.parse(end);
        return firstDate.isBefore(secondDate);
    }
}
