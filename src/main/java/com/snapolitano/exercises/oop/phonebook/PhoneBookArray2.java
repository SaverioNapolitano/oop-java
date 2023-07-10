package com.snapolitano.exercises.oop.phonebook;

import java.util.Arrays;

public class PhoneBookArray2 implements PhoneBook2 {
	static final int MAX_PERSONS = 256;
	Person[] phoneBook;

	public PhoneBookArray2() {
		phoneBook = new Person[MAX_PERSONS];
	}

	@Override
	public boolean addPerson(Person person) {
		for (int i = 0; i < MAX_PERSONS; i++) {
			if (phoneBook[i] == null) {
				phoneBook[i] = person;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean removePerson(Person person) {
		for (int i = 0; i < MAX_PERSONS; i++) {
			if (phoneBook[i] != null && phoneBook[i].equals(person)) {
				phoneBook[i] = null;
				return true;
			}
		}
		return false;
	}

	@Override
	public Person[] searchByLastname(String lastname) {
		Person[] people = new Person[0];
		for (int i = 0; i < MAX_PERSONS; i++) {
			if (phoneBook[i] != null && phoneBook[i].getLastname().equals(lastname)) {
				people = Arrays.copyOf(people, people.length + 1);
				people[people.length - 1] = phoneBook[i];
			}
		}
		return people;
	}

	@Override
	public Person[] searchByNameAndLastname(String name, String lastname) {
		Person[] people = new Person[0];
		for (int i = 0; i < MAX_PERSONS; i++) {
			if (phoneBook[i] != null && phoneBook[i].getLastname().equals(lastname) && phoneBook[i].getName().equals(name)) {
				people = Arrays.copyOf(people, people.length + 1);
				people[people.length - 1] = phoneBook[i];
			}
		}
		return people;
	}
}
