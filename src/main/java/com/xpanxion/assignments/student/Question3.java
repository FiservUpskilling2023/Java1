package com.xpanxion.assignments.student;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        String answer = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        System.out.println("Original String: " + str);

        String[] array = str.split(" ");

        for (int i = 0; i < array.length; i++) { // iterate through the array
            if (i % 2 == 0) {
                answer = answer + array[i].toUpperCase() + " ";
            } else {
                answer = answer + array[i].toLowerCase() + " ";
            }
        }
        System.out.println(answer);
    }
}
