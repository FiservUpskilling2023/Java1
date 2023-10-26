package com.xpanxion.assignments.student;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        int upperCase = 0;

        Scanner console = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = console.nextLine();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upperCase++;
        }
    }
}
