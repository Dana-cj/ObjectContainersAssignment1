package org.exampledana;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //new student
        Person corvin = new Student("Corvin", "Lazar",10, "55545154515", School.PRIMARY);
        System.out.println(corvin);
        //duplicate............................
        Person victor = new Student("Victor", "", 10, "55545154515", School.PRIMARY);
        //......................
        //add hobby
        corvin.addNewHobby("football", 7);
        //print
        corvin.printHobbies();
        //duplicate not added
        corvin.addNewHobby("football", 7);


        //create new country
        Country germany= new Country("Germany", "Berlin", 84000000);
        //set new addresses
        corvin.getHobbyByName("football").addHobbyLocalAddress("Cluj-Napoca", "Transylvania Club");
        corvin.getHobbyByName("football").addHobbyForeignAddress(germany, "Stuttgart", "Schwarzbachstadion");
        // add new hobby with address
        corvin.addNewHobby("swimming", 2);
        corvin.getHobbyByName("swimming").addHobbyLocalAddress("Cluj-Napoca", "Olympic Swimming Pool");


        //new unemployed
        Person ion = new Unemployed("Ion","Tudor", 30, "151594787487", School.HIGHSCHOOL);
        ion.addNewHobby("football", 2);
        ion.getHobbyByName("football").addHobbyLocalAddress("Cluj-Napoca", "Transylvania Club");

        //new employee
        Person vasile= new Employee("Vasile", "Ionas", 28, "15778552522522","Orange");
        vasile.addNewHobby("tennis", 2);
        vasile.getHobbyByName("tennis").addHobbyLocalAddress("Pitesti", "FTS Club");

        //print all hobbies of a person
        corvin.printHobbiesWithRelatedCountries();
        corvin.printHobbies();
        ion.printHobbies();
        vasile.printHobbies();

        //TreeSet ordered by name
        Set<Person> personsByName= new TreeSet<>(new NameComparator());
        personsByName.add(corvin);
        //duplicate not added
        personsByName.add(corvin);
        personsByName.add(ion);
        personsByName.add(vasile);
        //print persons ordered by name
        System.out.println("Persons sorted by name:");
        for (Person person: personsByName) {
            System.out.println("Name: "+ person.getFullName()+", age: "+person.getAge());
        }
        System.out.println(personsByName);

        //TreeSet ordered by age
        Set<Person> personsByAge= new TreeSet<>(new AgeComparator());
        personsByAge.add(corvin);
        personsByAge.add(ion);
        personsByAge.add(vasile);
        //print persons ordered by name
        System.out.println("Persons sorted by age:");
        for (Person person: personsByAge) {
            System.out.println("Name: "+ person.getFullName()+", age: "+person.getAge());
        }
        //System.out.println(personsByAge);

        //HashMap
        PersonsWithHobbies personsWithHobbiesMap = new PersonsWithHobbies();
        personsWithHobbiesMap.addPerson(corvin);
        personsWithHobbiesMap.addPerson(ion);
        personsWithHobbiesMap.addPerson(vasile);
        //duplicate not added
        personsWithHobbiesMap.addPerson(victor);

//        System.out.println(personsWithHobbiesMap);
//        personsWithHobbiesMap.printStatisticInformation();
        personsWithHobbiesMap.printPersonHobbiesCountries();

    }
}
