import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a sentence.");
        String[] words = console.nextLine().split(" ");

        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0)
                System.out.print(words[i].toUpperCase() + " ");
            else
                System.out.print(words[i] + " ");
        }
        console.close();
    }
}