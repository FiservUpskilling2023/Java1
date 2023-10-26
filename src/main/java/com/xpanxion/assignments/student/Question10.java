package com.xpanxion.assignments.student;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Please enter your words: ");

        String word = console.nextLine();

        for (char ch: word.toCharArray())
        {
            System.out.println(ch);
        }

        String spaces = " ";

        for (int i = 0; i < word.length(); i++) {
            spaces = spaces + " ";

            System.out.println(spaces + word.charAt(i));
        }
    }
}
