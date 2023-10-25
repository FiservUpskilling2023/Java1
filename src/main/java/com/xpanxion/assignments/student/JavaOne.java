package com.xpanxion.assignments.student;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class JavaOne {

    //
    // Constructors
    //

    public JavaOne() {
    }

    //
    // Public methods
    //

    public void ex1() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String[] userStrng = console.nextLine().split("");

        for (String letter : userStrng) {
            if (!letter.equals(" "))
                System.out.print(letter.toUpperCase());
            else
                System.out.print(letter);

        }
        System.out.println();

    }

    public void ex2() {
        Scanner console = new Scanner(System.in);
        System.out.println("Would you kindly write me a sentence?");

        String[] sentence = console.nextLine().split("");

        int count = 0;

        for (String letter : sentence) {
            // check if its a letter first
            if (!letter.toLowerCase().equals(letter.toUpperCase()) && letter.equals(letter.toUpperCase())) {
                // it is a letter and it is upperCase, increment count
                count++;
            }
        }
        System.out.printf("Number of uppercase letters: %d.\n", count);
    }

    public void ex3() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a sentence.");
        String[] words = console.nextLine().split(" ");

        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0)
                System.out.print(words[i].toUpperCase() + " ");
            else
                System.out.print(words[i] + " ");
        }
        System.out.println();
    }

    public void ex4() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String[] input = console.next().split("");

        int left = 0;
        int right = input.length - 1;

        while (left <= right) {
            if (!input[left].equals(input[right])) {
                System.out.print("NO");
                break;
            } else if (input[left].equals(input[right])) {
                left++;
                right--;
            }
            if (left == right)
                System.out.print("YES");
        }
        System.out.println();
    }

    public void ex5() {
        Scanner console = new Scanner(System.in);

        String input = "go";
        String choice = "go";
        while (!choice.equals("quit")) {
            System.out.print("Enter a word: ");
            input = console.next();
            if (input.equals("quit"))
                choice = input;
            else {
                // res will be the print out with num vowels and consonants
                String res = vowelCount(input);
                System.out.print(res);
            }
        }
        System.out.println();
    }

    public void ex6() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int digit1 = console.nextInt();

        System.out.print("Enter the second number: ");
        int digit2 = console.nextInt();

        int sum = digit1 + digit2;
        console.close();
        System.out.printf("Result: %d", sum);
    }

    public void ex7() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int digit1 = console.nextInt();

        System.out.print("Enter the second number: ");
        int digit2 = console.nextInt();

        System.out.print("Enter operation (add, sub, mul, div): ");
        String choice = console.next();
        int res;
        switch (choice) {
            case "add" -> {
                res = digit1 + digit2;
                System.out.printf("Result: %d", res);
            }
            case "sub" -> {
                res = digit1 - digit2;
                System.out.printf("Result: %d", res);
            }
            case "mul" -> {
                res = digit1 * digit2;
                System.out.printf("Result: %d", res);
            }
            case "div" -> {
                res = digit1 / digit2;
                System.out.printf("Result: %d", res);
            }
        }
        System.out.println();
    }

    public void ex8() {
        ArrayList<String> dimensions = new ArrayList<>();
        Scanner console = new Scanner(System.in);

        System.out.print("Enter price per square feet: ");
        double carpetPrice = console.nextDouble();
        console.nextLine();
        System.out.print("Enter room dimensions (width x height): ");
        // rather just add it to the arrayList

        String roomDimensions = console.nextLine();
        dimensions.add(roomDimensions);

        while (!roomDimensions.equals("done")) {
            System.out.print("Enter room dimensions (width x height): ");
            roomDimensions = console.nextLine();
            if (!roomDimensions.equals("done"))
                dimensions.add(roomDimensions);
        }
        double totalCost = calcTotal(carpetPrice, dimensions);
        System.out.printf("Total cost: $%.2f\n", totalCost);
    }

    public void ex9() {
        Scanner console = new Scanner(System.in);
        Random rand = new Random();

        int choice = 10;
        int randomNum = rand.nextInt(1, 6);
        while (choice != randomNum) {
            System.out.print("Enter a number: ");
            choice = console.nextInt();

            System.out.println("Try again...");

        }
        System.out.println("You guessed it!!!");
    }

    public void ex10() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String[] words = console.nextLine().split(" ");

        for (int i = 0; i < words.length; i++) {
            String[] letters = words[i].split("");
            for (int j = 0; j < letters.length; j++) {
                for (int k = 0; k < j; k++) {
                    System.out.print(" ");
                }
                System.out.println(letters[j]);
            }
        }

        console.close();
    }

    private static String vowelCount(String word) {
        String vowels = "aeiouAEIOU";
        String[] letters = word.split("");
        int numVowels = 0;
        int numConsonants = 0;
        for (String letter : letters) {
            if (vowels.contains(letter)) {
                numVowels++;
            } else {
                numConsonants++;
            }
        }
        String res = String.format("Number of vowels: %d\nNumber of consonants: %d\n", numVowels, numConsonants);

        return res;
    }

    private static double calcTotal(double price, ArrayList<String> arr) {
        // iterate and replace whitespace in string
        // while in the entry, get the total area of dimension
        // add to total
        // return the total * price as double
        int sum = 0;
        double total;
        for (int i = 0; i < arr.size(); i++) {
            String temp = arr.get(i).replaceAll(" ", "");
            String[] dimensions = temp.split("x");
            int area = Integer.parseInt(dimensions[0]) * Integer.parseInt(dimensions[1]);
            sum += area;

        }
        total = price * sum;
        return total;
    }

    // Private helper methods
    //
}
