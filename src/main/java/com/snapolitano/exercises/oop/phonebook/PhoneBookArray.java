package com.snapolitano.exercises.oop.phonebook;

public class PhoneBookArray implements PhoneBook {
    static final int MAX_PERSONS = 256;
    Person[] phoneBook;

    public PhoneBookArray() {
        this.phoneBook = new Person[MAX_PERSONS];
    }

    @Override
    public void addPerson(Person person) {
        for (int i = 0; i < MAX_PERSONS; i++) {
            if (phoneBook[i] == null) {
                phoneBook[i] = person;
                break;
            }
        }
    }

    @Override
    public void removePerson(Person person) {
        for (int i = 0; i < MAX_PERSONS; i++) {
            if (phoneBook[i].equals(person)) {
                phoneBook[i] = null;
                break;
            }
        }
    }

    @Override
    public Person searchByLastname(String lastname) {
        for (Person person : phoneBook) {
            if (person != null && person.getLastname().equals(lastname)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public Person searchByName(String name) {
        for (Person person : phoneBook) {
            if (person != null && person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public Person searchByNumber(String phone) {
        for (Person person : phoneBook) {
            if (person != null && person.getPhone().equals(phone)) {
                return person;
            }
        }
        return null;
    }
}
