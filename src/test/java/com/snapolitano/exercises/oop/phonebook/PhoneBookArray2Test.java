package com.snapolitano.exercises.oop.phonebook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookArray2Test {

    PhoneBookArray2 phoneBookArray2;

    @BeforeEach
    void setUp(){
        phoneBookArray2 = new PhoneBookArray2();
        phoneBookArray2.addPerson(new PhoneBook2.Person("Rossi", "Mario", "1234567890"));
        phoneBookArray2.addPerson(new PhoneBook2.Person("Bianchi", "Luigi", "0987654321"));
    }

    @Test
    void addPerson() {
        assertTrue(phoneBookArray2.addPerson(new PhoneBook2.Person("Neri", "Fabio", "9876501234")));
    }

    @Test
    void removePerson() {
        assertTrue(phoneBookArray2.removePerson(new PhoneBook2.Person("Bianchi", "Luigi", "0987654321")));
        assertFalse(phoneBookArray2.removePerson(new PhoneBook2.Person("Neri", "Fabio", "9876501234")));

    }

    @Test
    void searchByLastname() {
        assertArrayEquals(new PhoneBook2.Person[]{
                new PhoneBook2.Person("Rossi", "Mario", "1234567890")
        }, phoneBookArray2.searchByLastname("Rossi"));
        assertArrayEquals(new PhoneBook2.Person[]{}, phoneBookArray2.searchByLastname("Verdi"));

    }

    @Test
    void searchByNameAndLastname() {
        assertArrayEquals(new PhoneBook2.Person[]{
                new PhoneBook2.Person("Bianchi", "Luigi", "0987654321")
        }, phoneBookArray2.searchByNameAndLastname("Luigi", "Bianchi"));
        assertArrayEquals(new PhoneBook2.Person[]{}, phoneBookArray2.searchByNameAndLastname("Giuseppe", "Verdi"));

    }
}