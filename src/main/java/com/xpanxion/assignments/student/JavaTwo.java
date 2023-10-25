package com.xpanxion.assignments.student;

import java.util.Scanner;

import com.xpanxion.assignments.shared.*;

import java.util.ArrayList;

public class JavaTwo {

    //
    // Constructors
    //

    public JavaTwo() {
    }

    //
    // Public methods
    //

    // Person List
    public void ex1() {
        Scanner console = new Scanner(System.in);
        ArrayList<Person> personList = new ArrayList<>();
        String enteredPerson = "x";
        while (true) {
            System.out.print("Enter Person: ");
            enteredPerson = console.nextLine();
            if (enteredPerson.equals("done")) {
                break;
            }
            String[] sanitizedPerson = enteredPerson.split(", ");
            // make the Person object and then add it to the list
            Person tempPerson = new Person(Integer.parseInt(sanitizedPerson[0]), sanitizedPerson[1]);
            personList.add(tempPerson);
        }
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    public void ex2() {
        System.out.println("Student 1: ex2.");
    }

    public void ex3() {
        System.out.println("Student 1: ex3.");
    }

    public void ex4() {
        System.out.println("Student 1: ex4.");
    }

    public void ex5() {
        System.out.println("Student 1: ex5.");
    }

    public void ex6() {
        System.out.println("Student 1: ex6.");
    }

    public void ex7() {
        System.out.println("Student 1: ex7.");
    }

    public void ex8() {
        System.out.println("Student 1: ex8.");
    }

    public void ex9() {
        System.out.println("Student 1: ex9.");
    }

    public void ex10() {
        System.out.println("Student 1: ex10.");
    }

    //
    // Private helper methods
    //
}