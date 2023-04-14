package com.snapolitano.exercises.warmup;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class GuessNumber {

    public static int computerGuessRandomNumber() {
        RandomGenerator number = new Random();
        return number.nextInt(0, 4);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int computerNumber;
        int userNumber;
        do {
            computerNumber = computerGuessRandomNumber();
            System.out.println("Guess the number (between 0 and 3)");
            userNumber = scanner.nextInt();
            if (computerNumber == userNumber)
                System.out.println("Correct");
            else
                System.out.println("Wrong");
        } while (computerNumber != userNumber || computerNumber != 0);
    }
}
