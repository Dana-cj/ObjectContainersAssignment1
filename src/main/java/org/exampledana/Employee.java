package org.exampledana;

public class Employee extends Person{
    private String company;

    public Employee(String firstName, String lastName, int age, String idCode, String company) {
        super(firstName, lastName, age, idCode);
        this.company = company;
    }

}
