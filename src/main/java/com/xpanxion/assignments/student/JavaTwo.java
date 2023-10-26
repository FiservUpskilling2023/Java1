package com.xpanxion.assignments.student;

import com.xpanxion.assignments.shared.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
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

    // Redact Last Name
    public void ex7() {
        var personList = Arrays.asList(
                new Person(1, "Peter", "Jones"),
                new Person(2, "John", "Smith"),
                new Person(3, "Sue", "Anderson"));

        // stream the list so that last name is "xxx", use getters/setters?
        List<Person> newPersonList = personList.stream()
                .peek(p -> p.setLastName("xxx"))
                .collect(Collectors.toList());

        for (Person p : newPersonList) {
            System.out.println(p);
        }
    }

    // sort persons by first name
    public void ex8() {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson"));

        // sortimg with Comparator
        personList.sort(Comparator.comparing(p -> p.getFirstName()));

        for (Person p : personList) {
            System.out.println(p);
        }
    }

    public void ex9() {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson"));

        List<Person> filteredList = personList.stream()
                .filter(p -> p.getLastName().equals("Smith"))
                .collect(Collectors.toList());

        for (Person p : filteredList) {
            System.out.println(p);
        }
    }

    public void ex10() {
        Cat cat1 = new Cat("Alice");
        Cat cat2 = new Cat("Bob");
        Cat cat3 = new Cat("Charlie");
        Cat cat4 = new Cat("Dan");

        Node node1 = new Node(cat1);

        Node node2 = new Node(cat2);
        Node node3 = new Node(cat3);
        Node node4 = new Node(cat4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Queue queue = new Queue();
        queue.enqueue(node1);
        queue.enqueue(node2);
        queue.enqueue(node3);
        queue.enqueue(node4);

        while (!queue.isEmpty()) {
            System.out.println(queue);
            queue.dequeue();
        }

    }

    //
    // Private helper methods
    //
}