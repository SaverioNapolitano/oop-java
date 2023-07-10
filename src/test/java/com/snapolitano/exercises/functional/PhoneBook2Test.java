package com.snapolitano.exercises.functional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PhoneBook2Test {

	PhoneBook2 people;

	@BeforeEach
	void setUp() {
		people = new PhoneBook2(List.of(
				new PhoneBook2.Person("Luigi", "Rossi", "9876543210"),
				new PhoneBook2.Person("Mario", "Rossi", "0123456789"),
				new PhoneBook2.Person("Mario", "Rossi", "0123459876")
		));
	}

	@Test
	void searchByLastname() {
		assertEquals(Optional.of(new PhoneBook2.Person("Luigi", "Rossi", "9876543210")),
				people.searchByLastname("Rossi"));
	}

	@Test
	void searchByNameAndLastname() {
		assertEquals(Optional.of(new PhoneBook2.Person("Mario", "Rossi", "0123456789")),
				people.searchByNameAndLastname("Mario", "Rossi"));
	}
}