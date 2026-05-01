package org.example;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        width = scanner.nextDouble();
        System.out.println("Enter the height of the rectangle: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is: " + area + "square centimeters.");
        if (width == height) {
            System.out.println("Looks like a square to me!");
        }
    }
}
