package com.xpanxion.assignments.student;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Question9 {

    public static void main(String[] args) {

        // Method call
        randomNumberGame();
    }

    public static void randomNumberGame() {
        Scanner console = new Scanner(System.in);

        // Generate the numbers
        int number = 1 + (int) (5 * Math.random());

        // Given n trials
        int n = 5;
        int guess;

        System.out.print("A number is chosen between 1 to 5. Guess the number within 5 trials. ");

        // Iterate over n trials
        for (int i = 0; i < n; i++) {
            System.out.println("Guess the number: ");

            // Take input for guessing.
            guess = console.nextInt();

            // If the correct number is guessed
            if ( number == guess) {
                System.out.println("Congratulations!" + "You guessed the number. ");
                break;
            }
            else if (number > guess && i != n - 1) {
                System.out.println("The number is" + " less than " + guess);
            }
            else if (number < guess && i != n - 1) {
                System.out.println("The number is" + " less than " + guess);
            }
            if (i == n) {
                System.out.println("You have exhausted" + "n trials.");

                System.out.println("The number was " + number);
            }
        }
    }
}