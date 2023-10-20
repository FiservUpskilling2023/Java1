import java.util.Scanner;

public class UpperCase {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String[] userStrng = console.nextLine().split("");

        for (String letter : userStrng) {
            if (!letter.equals(" "))
                System.out.print(letter.toUpperCase());
            else
                System.out.print(letter);

        }
        console.close();
    }
}