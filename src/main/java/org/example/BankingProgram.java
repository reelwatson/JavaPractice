package org.example;

import java.util.Scanner;

public class BankingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Do-while loop when the response is not a valid name
        System.out.println("Welcome to the Spacing Guild Interplanetary Bank!\nInput your last name.");
        String lastName = scanner.nextLine();

        switch (lastName) {
            case "Atreides" -> System.out.println("Welcome, Duke Leto!");
            case "Harkonnen" -> System.out.println("Greetings, beloved Na-Baron!");
            case "Corrino" -> System.out.println("All hail the Padishah Emperor of the Known Universe!");
            default -> System.out.println("I apologize, you do not seem to have an account here.");
        }

        int decision = 0;
        do {
            System.out.println("Please select what you would like to do (1-4): ");
            System.out.println("1: Check your account's total amount.");
            System.out.println("2: Make a deposit into your account.");
            System.out.println("3: Make a withdrawal from your account");
            System.out.println("4: End this transaction.");

            decision = scanner.nextInt();
//            switch (decision) {
//                case 1 -> ; Display the number based on the family last name
//                case 2 -> ; Take a number of solaris, add to existing total, and show new total
//                case 3 -> ; Take a number of solars, subtract from existing total, and show new total
//                case 4 -> ; Show a thank-you message and exit
//            }

        }
        while (decision != 4);

        System.out.println("Thank you for choosing to do business with the Spacing Guild!");



        scanner.close();
    }
}
