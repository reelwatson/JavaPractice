package org.example;

import java.util.Scanner;

public class BankingProgram {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String lastName = "";

        // Do-while loop when the response is not a valid name
        do {
            System.out.println("Welcome to the Spacing Guild Interplanetary Bank!\nInput your last name: ");
            lastName = scanner.nextLine();

            switch (lastName) {
                case "Atreides" -> System.out.println("Welcome, Duke Leto!");
                case "Harkonnen" -> System.out.println("Greetings, beloved Na-Baron!");
                case "Corrino" -> System.out.println("All hail the Padishah Emperor of the Known Universe!");
                default -> System.out.println("I apologize, you do not seem to have an account here.");
            }
        }
        while (!lastName.equals("Atreides") && !lastName.equals("Harkonnen") && !lastName.equals("Corrino"));


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
//                case 3 -> ; Take a number of solaris, subtract from existing total, and show new total
//                case 4 -> ; Show a thank-you message and exit
//            }

        }
        while (decision != 4);

        System.out.println("Thank you for choosing to do business with the Spacing Guild!\n");
        Thread.sleep(1000);
        System.out.printf("We appreciate the business of House %s and look forward to seeing you again!", lastName);



        scanner.close();
    }

    private void showAccounts(String householdName) {
        switch (householdName) {
            case "Atreides": {
                houseAtreides newAtreides = new houseAtreides();
                System.out.println("Checking account: " + newAtreides.checkingAccount);
                System.out.println("Savings account: " + newAtreides.savingsAccount);
                System.out.println("Total amount: " + (newAtreides.checkingAccount + newAtreides.savingsAccount));
            }
            case "Harkonnen": {
                houseHarkonnen newHarkonnen = new houseHarkonnen();
                System.out.println("Checking account: " + newHarkonnen.checkingAccount);
                System.out.println("Savings account: " + newHarkonnen.savingsAccount);
                System.out.println("Total amount: " + (newHarkonnen.checkingAccount + newHarkonnen.savingsAccount));
            }
            case "Corrino": {
                houseCorrino newCorrino = new houseCorrino();
                System.out.println("Checking account: " + newCorrino.checkingAccount);
                System.out.println("Savings account: " + newCorrino.savingsAccount);
                System.out.println("Total amount: " + (newCorrino.checkingAccount + newCorrino.savingsAccount));
            }
        }
    }

    private long depositToAccount(String householdName, String accountType) {
        return 0;
    }

    private long withdrawFromAccount(String householdName, String accountType) {
        return 0;
    }

    // Private classes to contain info on each particular house - non-static (after some experimentation)
    // In real life would reach back into a database through a query, then make database updates as needed
    // TO DO: Implement the above line with a database (postgresql?)
    private class houseAtreides {
        long checkingAccount = 3600200;
        long savingsAccount = 456898444;
    }

    private class houseHarkonnen {
        long checkingAccount = 13254689;
        long savingsAccount = 865456211;
    }

    private class houseCorrino {
        long checkingAccount = 43521235;
        long savingsAccount = 568644355;
    }
}
