package com.snapolitano.exercises.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortAccount2Test {
	List<SortAccount2.Account> accountList;

	@BeforeEach
	void setUp() {
		accountList = new ArrayList<>(List.of(
				new SortAccount2.Account(1000, 0.02, LocalDate.of(2020, 11, 15)),
				new SortAccount2.Account(1500, 0.01, LocalDate.of(2023, 11, 15)),
				new SortAccount2.Account(500, 0.3, LocalDate.of(2022, 11, 12))
		));
	}

	@Test
	void sortByAmount() {
		SortAccount2.sortByAmount(accountList);
		assertEquals(List.of(
				new SortAccount2.Account(500, 0.3, LocalDate.of(2022, 11, 12)),
				new SortAccount2.Account(1000, 0.02, LocalDate.of(2020, 11, 15)),
				new SortAccount2.Account(1500, 0.01, LocalDate.of(2023, 11, 15))
		), accountList);
	}

	@Test
	void sortByInterestRate() {
		SortAccount2.sortByInterestRate(accountList);
		assertEquals(List.of(
				new SortAccount2.Account(1500, 0.01, LocalDate.of(2023, 11, 15)),
				new SortAccount2.Account(1000, 0.02, LocalDate.of(2020, 11, 15)),
				new SortAccount2.Account(500, 0.3, LocalDate.of(2022, 11, 12))
		), accountList);
	}

	@Test
	void sortByDuePayment() {
		SortAccount2.sortByDuePayment(accountList);
		assertEquals(List.of(
				new SortAccount2.Account(1000, 0.02, LocalDate.of(2020, 11, 15)),
				new SortAccount2.Account(500, 0.3, LocalDate.of(2022, 11, 12)),
				new SortAccount2.Account(1500, 0.01, LocalDate.of(2023, 11, 15))
		), accountList);
	}
}