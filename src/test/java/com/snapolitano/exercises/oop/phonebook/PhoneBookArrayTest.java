package com.snapolitano.exercises.oop.phonebook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class PhoneBookArrayTest {

	PhoneBookArray phoneBookArray = new PhoneBookArray();

	@Test
	void addPerson() {
		phoneBookArray.addPerson(new PhoneBook.Person("napolitano", "saverio", "000"));
		phoneBookArray.addPerson(new PhoneBook.Person("baglio", "aldo", "123"));
		phoneBookArray.addPerson(new PhoneBook.Person("storti", "giovanni", "456"));
		phoneBookArray.addPerson(new PhoneBook.Person("poretti", "giacomo", "789"));
		assertEquals(new PhoneBook.Person("napolitano", "saverio", "000"), phoneBookArray.searchByNumber("000"));
	}

	@Test
	void removePerson() {
		phoneBookArray.addPerson(new PhoneBook.Person("napolitano", "saverio", "000"));
		phoneBookArray.addPerson(new PhoneBook.Person("baglio", "aldo", "123"));
		phoneBookArray.addPerson(new PhoneBook.Person("storti", "giovanni", "456"));
		phoneBookArray.addPerson(new PhoneBook.Person("poretti", "giacomo", "789"));
		phoneBookArray.removePerson(new PhoneBook.Person("napolitano", "saverio", "000"));
		assertNotEquals(new PhoneBook.Person("napolitano", "saverio", "000"), phoneBookArray.searchByNumber("000"));
	}

	@Test
	void searchByLastname() {
		phoneBookArray.addPerson(new PhoneBook.Person("napolitano", "saverio", "000"));
		phoneBookArray.addPerson(new PhoneBook.Person("baglio", "aldo", "123"));
		phoneBookArray.addPerson(new PhoneBook.Person("storti", "giovanni", "456"));
		phoneBookArray.addPerson(new PhoneBook.Person("poretti", "giacomo", "789"));
		assertEquals(new PhoneBook.Person("baglio", "aldo", "123"), phoneBookArray.searchByLastname("baglio"));
	}

	@Test
	void searchByName() {
		phoneBookArray.addPerson(new PhoneBook.Person("napolitano", "saverio", "000"));
		phoneBookArray.addPerson(new PhoneBook.Person("baglio", "aldo", "123"));
		phoneBookArray.addPerson(new PhoneBook.Person("storti", "giovanni", "456"));
		phoneBookArray.addPerson(new PhoneBook.Person("poretti", "giacomo", "789"));
		assertEquals(new PhoneBook.Person("storti", "giovanni", "456"), phoneBookArray.searchByName("giovanni"));
	}

	@Test
	void searchByNumber() {
		phoneBookArray.addPerson(new PhoneBook.Person("napolitano", "saverio", "000"));
		phoneBookArray.addPerson(new PhoneBook.Person("baglio", "aldo", "123"));
		phoneBookArray.addPerson(new PhoneBook.Person("storti", "giovanni", "456"));
		phoneBookArray.addPerson(new PhoneBook.Person("poretti", "giacomo", "789"));
		assertEquals(new PhoneBook.Person("poretti", "giacomo", "789"), phoneBookArray.searchByNumber("789"));
	}
}