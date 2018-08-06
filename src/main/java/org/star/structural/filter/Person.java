package org.star.structural.filter;

public class Person {

    private String name;

    private Gender gender;

    private MaritalStatus maritalStatus;

    public Person(String name, Gender gender, MaritalStatus maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }
}
