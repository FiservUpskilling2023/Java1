package com.xpanxion.assignments.shared;

public class Person {
    public int id;
    public String firstName;
    public String lastName;

    public Person(int id, String name) {
        this.id = id;
        String[] nameParts = name.split(" ");
        this.firstName = nameParts[0];
        this.lastName = nameParts[1];
    }

    public String toString() {
        String result = String.format("Person{id=%d, firstName='%s', lastName='%s'}", this.id, this.firstName,
                this.lastName);

        return result;
    }
}