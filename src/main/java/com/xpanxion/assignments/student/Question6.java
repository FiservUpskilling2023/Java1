package com.xpanxion.assignments.student;

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {

        // Ex. 6 Add Only Calculator
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum is " + sum);
    }
}
