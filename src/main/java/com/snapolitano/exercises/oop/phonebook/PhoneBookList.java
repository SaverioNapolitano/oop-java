package com.snapolitano.exercises.oop.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook {

	public static final int MAX_PERSONS = 256;
	ArrayList<Person> phoneBook;

	public PhoneBookList() {
		this.phoneBook = new ArrayList<>();
	}

	@Override
	public void addPerson(Person person) {
		if (phoneBook.size() < MAX_PERSONS) {
			phoneBook.add(person);
		}
	}

	@Override
	public void removePerson(Person person) {
		phoneBook.remove(person);
	}

	@Override
	public Person searchByLastname(String lastname) {
		for (Person person : phoneBook) {
			if (person.lastname.equals(lastname)) {
				return person;
			}
		}
		return null;
	}

	@Override
	public Person searchByName(String name) {
		for (Person person : phoneBook) {
			if (person.name.equals(name)) {
				return person;
			}
		}
		return null;
	}

	@Override
	public Person searchByNumber(String phone) {
		for (Person person : phoneBook) {
			if (person.phone.equals(phone)) {
				return person;
			}
		}
		return null;
	}
}
