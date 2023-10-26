package com.xpanxion.assignments.student;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String firstName = keyboard.nextLine();

        firstName = firstName.toLowerCase();
        int count = 0;

        for (int i = 0; i < firstName.length(); i++) {
            // Check if char[i] is vowel
            if (firstName.charAt(i) == 'a' || firstName.charAt(i) == 'e'
                    || firstName.charAt(i) == 'i'
                    || firstName.charAt(i) == 'o'
                    || firstName.charAt(i) == 'u') {
                // Count increments if there is vowel in char[i]
                count++;
            }
            // Display total count of vowels in string
            System.out.println("The total number of vowels in string are " + count);
        }
    }
}
