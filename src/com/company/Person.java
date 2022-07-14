package com.company;

class Person {
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public String fullName(){

        return this.firstName + " " +  this.lastName;

    }

    String firstName;
    String lastName;

    public Person() {
        firstName = "";
        lastName = "";
    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
