package com.snapolitano.exercises.oop.phonebook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookList2Test {
	PhoneBookList2 phoneBookList2;

	@BeforeEach
	void setUp() {
		phoneBookList2 = new PhoneBookList2();
		phoneBookList2.addPerson(new PhoneBook2.Person("Rossi", "Mario", "1234567890"));
		phoneBookList2.addPerson(new PhoneBook2.Person("Bianchi", "Luigi", "0987654321"));
	}

	@Test
	void addPerson() {
		assertTrue(phoneBookList2.addPerson(new PhoneBook2.Person("Neri", "Fabio", "9876501234")));
	}

	@Test
	void removePerson() {
		assertTrue(phoneBookList2.removePerson(new PhoneBook2.Person("Bianchi", "Luigi", "0987654321")));
		assertFalse(phoneBookList2.removePerson(new PhoneBook2.Person("Neri", "Fabio", "9876501234")));
	}

	@Test
	void searchByLastname() {
		assertArrayEquals(new PhoneBook2.Person[]{
				new PhoneBook2.Person("Rossi", "Mario", "1234567890")
		}, phoneBookList2.searchByLastname("Rossi"));
		assertArrayEquals(new PhoneBook2.Person[]{}, phoneBookList2.searchByLastname("Verdi"));
	}

	@Test
	void searchByNameAndLastname() {
		assertArrayEquals(new PhoneBook2.Person[]{
				new PhoneBook2.Person("Bianchi", "Luigi", "0987654321")
		}, phoneBookList2.searchByNameAndLastname("Luigi", "Bianchi"));
		assertArrayEquals(new PhoneBook2.Person[]{}, phoneBookList2.searchByNameAndLastname("Giuseppe", "Verdi"));
	}
}