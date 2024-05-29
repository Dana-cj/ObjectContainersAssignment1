package org.exampledana;

public class Unemployed extends Person{

    private School lastSchoolAttended;

    public Unemployed(String firstName, String lastName, int age, String idCode, School lastSchoolAttended) {
        super(firstName, lastName, age, idCode);
        this.lastSchoolAttended = lastSchoolAttended;
    }

}
