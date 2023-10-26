package com.xpanxion.assignments.student;

import java.util.Objects;
import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {

        // Ex. 7 Full Calculator
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number1 = scan.nextInt();
        System.out.println("Enter operation (add, sub, mul, div): ");
        String operation = scan.next();
        scan.nextLine();
        System.out.println("Enter a second number: ");
        int number2 = scan.nextInt();

        scan.close();

        if (Objects.equals(operation, "+")) {
            int sum = number1 + number2;
            System.out.println(sum);
        } else if (Objects.equals(operation, "-")) {
            int difference = number1 - number2;
            System.out.println(difference);
        } else if (Objects.equals(operation, "*")) {
            int product = number1 * number2;
            System.out.println(product);
        } else if (Objects.equals(operation, "/")) {
            int dividend = number1 / number2;
            System.out.println(dividend);
        }

        /*if (operation == String.valueOf(add)) {
            System.out.println(add);
            } else if (operation == String.valueOf(sub)) {
                    System.out.println(sub);
            } else if (operation == String.valueOf(mul)) {
                    System.out.println(mul);
            } else if (operation == String.valueOf(div)) {
                    System.out.println(div); */
    }
}




