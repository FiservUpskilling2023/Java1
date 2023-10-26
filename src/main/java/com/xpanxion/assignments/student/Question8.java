package com.xpanxion.assignments.student;

import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        // Create a Scanner object for keyboard input.
        Scanner input = new Scanner(System.in);

        // Display information about program.
        System.out.println("This program will display the carpet cost of a room.");

        // Get the length of the room.
        System.out.print("Enter the length of room: ");
        double length = input.nextDouble();

        // Get the width of the room.
        System.out.print("Enter the width of room: ");
        double width = input.nextDouble();

        // Get the cost of price per square feet of the desired carpeting.
        System.out.print("Enter the price per square feet for the desired carpeting: ");

        double carpetCost = input.nextDouble();

        //Close keyboard
        input.close();

        // Create Room_Dimension and Room_Carpet objects.
        Room_Dimension dimensions = new Room_Dimension(length, width);
        Room_Carpet roomCarpet = new Room_Carpet(dimensions, carpetCost);

        // Print the object calling the toString
        System.out.println(roomCarpet);
    }

    public static class Room_Dimension {

        private double length;
        private double width;

        public Room_Dimension(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public double getWidth() {
            return width;
        }

        public Room_Dimension(Room_Dimension roomDimensions) {

        }

        public double getArea() {
            return length * width;
        }

        public String toString() {
            return "Dimensions of room: (length = " + length + ", width = " + width + ")";
        }

    }

    public static class Room_Carpet {
        private Room_Dimension roomDimensions;
        private double carpetCost;

        public Room_Carpet(Room_Dimension roomDimensions, double carpetCost) {
            this.roomDimensions = roomDimensions;
            this.carpetCost = carpetCost;
        }

        public Room_Carpet(Room_Carpet roomCarpet) {

        }

        public double getTotalCost() {
            return carpetCost * roomDimensions.getArea();
        }

        public Room_Dimension getSize() {
            return roomDimensions;
        }

        public double getCarpetCost() {
            return carpetCost;
        }

        public String toString() {
            return " " + roomDimensions + ", Carpet cost per square feet = $" + carpetCost + ", " + "Total cost = $" + getTotalCost() + "";
        }
    }
}