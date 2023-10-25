import java.util.Scanner;

public class DiagonalAlley {
    public static void main(String[] args) {
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
}
