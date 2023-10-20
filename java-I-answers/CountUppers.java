import java.util.Scanner;

public class CountUppers {
    public static void main(String[] args) {
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
        System.out.printf("Number of uppercase letters: %d.", count);
        console.close();
    }
}