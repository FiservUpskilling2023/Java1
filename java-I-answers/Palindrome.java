import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
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
        console.close();

    }
}