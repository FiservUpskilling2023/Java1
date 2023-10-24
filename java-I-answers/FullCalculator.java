import java.util.Scanner;

public class FullCalculator {
    public static void main(String[] args) {
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
        console.close();

    }
}