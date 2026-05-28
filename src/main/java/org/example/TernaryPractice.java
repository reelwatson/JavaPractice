package org.example;

import java.util.Scanner;

public class TernaryPractice {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature you wish to convert: ");
        temp = scanner.nextDouble();

        System.out.print("Do you want to convert the temperature to Celsius or Fahrenheit? Type C or F: ");
        unit = scanner.next().toLowerCase();

        newTemp = (unit.equals("c")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        System.out.printf("%.1f° %s", newTemp, unit);

        scanner.close();
    }
}
