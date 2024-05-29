package org.exampledana;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonsWithHobbies {
   private Map<Person, List<Hobby>> personsWithHobbies;


   public PersonsWithHobbies(){
      personsWithHobbies = new HashMap<>();
   }

   public void addPerson(Person person){
      personsWithHobbies.putIfAbsent(person, new ArrayList<>(person.hobbies));
   }

   public void printPersonHobbiesCountries(){
      for (Map.Entry<Person, List<Hobby>> entry: personsWithHobbies.entrySet()) {
         System.out.println(entry.getKey().getFullName()+" has the following hobbies: ");
         for (Hobby hobby: entry.getValue()) {
            System.out.println("\t○ "+hobby.name+ " practiced in the following countries: ");
            for (Address address:hobby.listOfAddresses) {
               System.out.println("\t\t-"+address.country.getName());
            }
         }
      }
   }

   private int countHobbies(){
      int count=0;
      for (Person person: personsWithHobbies.keySet()) {
         count+= personsWithHobbies.get(person).size();
      }
      return count;
   }
   public void printStatisticInformation(){
      System.out.println("The map contains "+personsWithHobbies.size()+" persons with "+countHobbies()+" hobbies.");
   }

   @Override
   public String toString() {
      return "PersonsWithHobbies{" + personsWithHobbies +
              '}';
   }
}
