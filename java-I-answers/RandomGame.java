import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
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
}