import java.util.Scanner;
import java.util.ArrayList;

public class CarpetCalc {

    public static double calcTotal(double price, ArrayList<String> arr) {
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

    public static void main(String[] args) {
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
        System.out.printf("Total cost: $%.2f", totalCost);
    }
}