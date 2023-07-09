package com.snapolitano.exercises.oop.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookList2 implements PhoneBook2{
    static final int MAX_PERSONS = 256;
    ArrayList<Person> phoneBook;

    public PhoneBookList2() {
        phoneBook = new ArrayList<>(MAX_PERSONS);
    }

    @Override
    public boolean addPerson(Person person) {
        return phoneBook.size() < MAX_PERSONS && phoneBook.add(person);
    }

    @Override
    public boolean removePerson(Person person) {
        return !phoneBook.isEmpty() && phoneBook.remove(person);
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        List<Person> p =
                phoneBook.stream().filter(person -> person.getLastname().equals(lastname)).toList();
        Person[] people = new Person[p.size()];
        for(int i = 0; i < people.length; i++){
            people[i] = p.get(i);
        }
        return people;
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        List<Person> p =
                phoneBook.stream().filter(person -> person.getLastname().equals(lastname) && person.getName().equals(name)).toList();
        Person[] people = new Person[p.size()];
        for(int i = 0; i < people.length; i++){
            people[i] = p.get(i);
        }
        return people;
    }
}
