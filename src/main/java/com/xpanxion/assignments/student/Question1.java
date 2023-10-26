package com.xpanxion.assignments.student;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        int upperCase = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine().toUpperCase();
        System.out.println(name);

        System.out.println("Upper case letters : " + upperCase);
    }
}
