package com.xpanxion.assignments.shared;

public class Repository implements DataAccess {

    // get the person with id of 1
    public Person getPerson() {
        return new Person(1, "John Doe");
    }
}