package com.xpanxion.assignments.student;

import com.xpanxion.assignments.shared.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.text.NumberFormat;

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

    // person HashMap
    public void ex2() {
        HashMap<Integer, Person> personMap = new HashMap<>();
        Person person1 = new Person(1, "Peter Jones");
        Person person2 = new Person(2, "John Smith");
        Person person3 = new Person(3, "Mary Jane");

        personMap.put(person1.id, person1);
        personMap.put(person2.id, person2);
        personMap.put(person3.id, person3);

        Scanner console = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Person ID: ");
            String userId = console.next();
            if (userId.equals("done")) {
                break;
            }
            // convert userID to int then get the value from map
            int intUserId = Integer.parseInt(userId);
            System.out.println(personMap.get(intUserId));
        }
    }

    // Invoice and Products
    public void ex3() {
        var invoice = new Invoice(1);
        invoice.addProduct(new Product(111, "Mustard", 2.00));
        invoice.addProduct(new Product(222, "Ketchup", 3.00));
        invoice.addProduct(new Product(333, "Franks Hot Sauce", 4.00));

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));

    }

    // Refactor Invoice and Products
    public void ex4() {
        var invoice = new Invoice(1);
        invoice.addProduct(new Product(111, "Mustard", 2.00));
        invoice.addProduct(new Product(222, "Ketchup", 3.00));
        invoice.addProduct(new Product(333, "Franks Hot Sauce", 4.00));

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex5() {
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }

    public void ex6() {
        Scanner console = new Scanner(System.in);
        Calculator calc = new Calculator();

        while (true) {
            // problem is we're terminating after asking about digit1
            System.out.print("Enter the first number: ");
            var digit1 = console.next();
            if (digit1.equals("done")) {
                calc.showStatements();
                break;
            }
            System.out.print("Enter the second number: ");
            int digit2 = console.nextInt();

            System.out.print("Enter operation (add, sub, mul, div): ");
            String operation = console.next();

            int convertedDigit1 = Integer.parseInt(digit1);
            System.out.println(calc.processStatement(convertedDigit1, digit2, operation));
        }

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