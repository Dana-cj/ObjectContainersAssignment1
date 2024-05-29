package org.exampledana;

public class Student extends Person{
    private School curretSchool;


    public Student(String firstName, String lastName,int age, String idCode, School school){
        super(firstName, lastName, age, idCode);
        this.curretSchool =school;
    }

}
