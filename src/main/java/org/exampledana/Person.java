package org.exampledana;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String idCode;
    protected List<Hobby> hobbies;

    public Person(String firstName, String lastName, int age, String idCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.idCode = idCode;
        hobbies = new ArrayList<>();
    }

    public Integer getAge() {
        return age;
    }

    public String getFullName() {
        return (lastName + " " + firstName);

    }

    public void addNewHobby(String name, int frequency) {
        boolean isInHobbiesList = false;
        for (Hobby hobby : hobbies) {
            if (hobby.name.equals(name)) {
                isInHobbiesList = true;
            }
        }
        if (!isInHobbiesList) {
            hobbies.add(new Hobby(name, frequency));
        } else {
            System.out.println("Hobby " + "'" + name + "'" + " is already in " + getFullName() + "' s list of hobbies!");
        }
    }

    public Hobby getHobbyByName(String name) {
        for (Hobby hobby : hobbies) {
            if (hobby.name.equals(name)) {
                return hobby;
            }
        }
        System.out.println("Hobby not found!");
        return new Hobby("unknown", 0);
    }

    public void printHobbiesWithRelatedCountries() {
        System.out.println(getFullName() + "'s hobbies are: ");
        for (Hobby hobby : hobbies) {
            System.out.println("\t" + hobby + ", practiced in the following countries: ");
            for (Address address : hobby.listOfAddresses) {
                System.out.println("\t\t" + address.country);
            }
        }
    }

    public void printHobbies() {
        System.out.println(getFullName() + "'s hobbies are: ");
        for (Hobby hobby : hobbies) {
            System.out.println("\t" + hobby + ", practiced at the following addresses: ");
            for (Address address : hobby.listOfAddresses) {
                System.out.println("\t\t" + address);
            }
        }
    }

    @Override
    public String toString() {
        return "Person: " +
                "name='" + getFullName() + '\'' +
                ", age=" + age +
                ", idCode='" + idCode + '\''+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(idCode, person.idCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCode);
    }

    }
//Note: I have created class Hobby inside Person, considering that hobbies with frequency and addresses don't make sense without the person itself

    class Hobby {
        protected String name;
        protected int frequency;//times a week
        protected List<Address> listOfAddresses;

         Hobby(String name, int frequency) {
            this.name = name;
            this.frequency = frequency;
            listOfAddresses = new ArrayList<>();
        }

        public void addHobbyForeignAddress(Country country, String city, String place) {
            listOfAddresses.add(new Address(country, city, place));
        }

        public void addHobbyLocalAddress(String city, String place) {
            listOfAddresses.add(new Address(city, place));
        }
        @Override
        public String toString() {
            return "Hobby: " + name + ", frequency: " + frequency+" times a week";
        }

    }

