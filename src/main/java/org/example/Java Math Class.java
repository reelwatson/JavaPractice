package org.example;

import java.util.Scanner;

class JavaMathClass {
    public static void main(String [] args) {

        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;
        result = Math.pow(2,12);
        System.out.println(result);

    }

    public static void determineOrdersOfMagnitude() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer for the magnitude to get the final number: ");

        int x = scanner.nextInt();

        double result = Math.abs(Math.pow(10, x));
        System.out.println(result);

        scanner.close();
    }

    public static void determineSquareRoot() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a double to get the square root: ");

        double x = scanner.nextInt();
        double result = Math.sqrt(x);

        System.out.println(result);
        scanner.close();
    }

    public static void roundNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a double to round it up or down: ");

        double x = scanner.nextDouble();
        double result = Math.round(x);
        System.out.println(result);
    
        scanner.close();
    }

    public static void useCeilingToRoundUp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a double to round it up: ");
        double x = scanner.nextInt();

        double result = Math.ceil(x);
        System.out.println(result);
        scanner.close();
    }
    
    public static void useFloorToRoundDown() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a double to round it down: ");
        
        double x = scanner.nextInt();

        double result = Math.floor(x);
        System.out.println(result);
        scanner.close();
    }
}