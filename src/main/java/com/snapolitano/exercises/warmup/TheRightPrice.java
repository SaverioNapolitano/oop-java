package com.snapolitano.exercises.warmup;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class TheRightPrice {
	static final int FIRST_USER = 1;
	static final int SECOND_USER = 2;

	static final int BOTH = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("User 1, guess the price (0-100)");
		int user1Price = scanner.nextInt();
		System.out.println("User 2, guess the price (0-100)");
		int user2Price = scanner1.nextInt();
		int price = randomPriceOfImaginaryItem();
		switch (whoIsCloser(user1Price, user2Price, price)) {
			case FIRST_USER -> {
				System.out.println("User 1 was closer");
				System.out.println("Real price: " + price);
			}
			case SECOND_USER -> {
				System.out.println("User 2 was closer");
				System.out.println("Real price: " + price);
			}
			case BOTH -> {
				System.out.println("Both users were closer");
				System.out.println("Real price: " + price);
			}
		}
	}

	public static int randomPriceOfImaginaryItem() {
		RandomGenerator computerPrice = new Random();
		return computerPrice.nextInt(0, 101);
	}

	public static int whoIsCloser(int user1Price, int user2Price, int computerPrice) {
		int difference1 = user1Price - computerPrice;
		int difference2 = user2Price - computerPrice;
		if (Math.abs(difference2) > Math.abs(difference1))
			return FIRST_USER;
		else if (Math.abs(difference1) > Math.abs(difference2)) {
			return SECOND_USER;
		} else
			return BOTH;
	}
}