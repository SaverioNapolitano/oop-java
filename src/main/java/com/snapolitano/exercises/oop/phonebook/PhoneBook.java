package com.snapolitano.exercises.oop.phonebook;

import java.util.Objects;

public interface PhoneBook {

	void addPerson(Person person);

	void removePerson(Person person);

	Person searchByLastname(String lastname);

	Person searchByName(String name);

	Person searchByNumber(String phone);

	class Person {
		String lastname;
		String name;
		String phone;

		public Person(String lastname, String name, String phone) {
			this.lastname = lastname;
			this.name = name;
			this.phone = phone;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		@Override
		public int hashCode() {
			return Objects.hash(lastname, name, phone);
		}

		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;
			Person person = (Person) o;
			return Objects.equals(lastname, person.lastname) && Objects.equals(name, person.name) && Objects.equals(phone, person.phone);
		}

		@Override
		public String toString() {
			return "Person{" + "lastname='" + lastname + '\'' + ", name='" + name + '\'' + ", phone='" + phone + '\'' + '}';
		}
	}
}
