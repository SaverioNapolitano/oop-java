package com.snapolitano.exercises.functional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PhoneBook2 {

    List<Person> people;
    public static class Person {
        String name;
        String lastname;
        String phone;

        public Person(String name, String lastname, String phone) {
            this.name = name;
            this.lastname = lastname;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if(name.isBlank()){
                throw new IllegalArgumentException("name can't be blank");
            }
            this.name = name;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            if(lastname.isBlank()){
                throw new IllegalArgumentException("lastname can't be blank");
            }
            this.lastname = lastname;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            if(phone.length() != 10 || phone.matches("[a-zA-Z]")){
                throw new IllegalArgumentException("phone must contain 10 numbers");
            }
            this.phone = phone;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name) && Objects.equals(lastname, person.lastname) && Objects.equals(phone, person.phone);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, lastname, phone);
        }

        @Override
        public String toString() {
            return "Person{" + "name='" + name + '\'' + ", lastname='" + lastname + '\'' + ", phone='" + phone + '\'' + '}';
        }
    }

    public PhoneBook2(List<Person> people){
        this.people = List.copyOf(people);
    }

    public Optional<Person> searchByLastname(String lastname){
        return people.stream().filter(person -> person.getLastname().equals(lastname)).findFirst();
    }
    public Optional<Person> searchByNameAndLastname(String name, String lastname){
        return people.stream().filter(person -> person.getLastname().equals(lastname) && person.getName().equals(name)).findFirst();
    }
}
