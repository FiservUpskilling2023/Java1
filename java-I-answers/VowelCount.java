import java.util.Scanner;

public class VowelCount {

    public static String vowelCount(String word) {
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

    public static void main(String[] args) {
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
        console.close();
    }
}