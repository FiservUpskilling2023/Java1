import java.util.Scanner;

public class AddOnly {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int digit1 = console.nextInt();

        System.out.print("Enter the second number: ");
        int digit2 = console.nextInt();

        int sum = digit1 + digit2;
        console.close();
        System.out.printf("Result: %d", sum);
    }
}