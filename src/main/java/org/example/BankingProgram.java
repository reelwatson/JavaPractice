package org.example;

import java.util.Scanner;

public class BankingProgram {
    public static void main (String[] args) throws InterruptedException {
        BankingProgram program = new BankingProgram();
        program.bankInterface();
    }

    public void bankInterface() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String lastName = "";
        System.out.println("Welcome to the Spacing Guild Interplanetary Bank!\nInput your last name: ");
        lastName = scanner.nextLine();

        // Do-while loop when the response is not a valid name
        do {
            switch (lastName) {
                case "Atreides": {
                    System.out.println("Welcome, Duke Leto!");
                }
                case "Harkonnen": {
                    System.out.println("Greetings, beloved Na-Baron!");
                }
                case "Corrino": {
                    System.out.println("All hail the Padishah Emperor of the Known Universe!");
                }
                default: {
                    System.out.println("I apologize, you do not seem to have an account here. Please try again");
                    lastName = scanner.nextLine();
                }
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
            switch (decision) {
                case 1: {
                    showAccounts(lastName);
                    break;
                }
                case 2: {
                    System.out.println("Please input the amount you would like to deposit into checking");
                    long deposit = scanner.nextLong();
                    long newTotal = depositToAccount(lastName, deposit);
                    System.out.println("Thank you for your deposit!");
                    System.out.printf("Your new total amount is " + newTotal);
                    break;
                }
                case 3: {
                    System.out.println("Please input the amount you would like to withdraw");
                    // TO DO: Check in advance that withdrawal amount is not greater than
                    break;
                }
                case 4: {
                    break;

                }
                default: {
                    System.out.println("The number you entered is invalid, please try again.");
                    decision = scanner.nextInt();
                }
            }
//                case 2 -> ; Take a number of solaris, add to existing total, and show new total
//                case 3 -> ; Take a number of solaris, subtract from existing total, and show new total
//                case 4 -> ; Show a thank-you message and exit
//                default ->; Respond that the number is invalid
//            }
        }
        while (decision != 4);

        System.out.println("Thank you for choosing to do business with the Spacing Guild!\n");
        Thread.sleep(1000);
        System.out.printf("We appreciate the business of House %s and look forward to seeing you again!", lastName);
        scanner.close();
    }

    // Should these methods live in separate classes? Ehhhh but I'm in too deep now
    private void showAccounts(String householdName) {
        switch (householdName) {
            // Does not really follow DRY - easy to refactor if running a search to a database
            // Possible TO DO: set up an actual database and have this class make queries
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

    private long depositToAccount(String householdName, long deposit) {
        long newTotal;

        return 0;
    }

    private long withdrawFromAccount(String householdName, long withdrawal) {
        return 0;
    }

    // Private classes to contain info on each particular house - non-static (after some experimentation)
    // In real life would reach back into a database through a query, then make database updates as needed
    // Short-term idea for refactoring - keep all of these in a single class rather than multiple separate classes
    // TO DO: Implement the above line with a database (PostgreSQL?)
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
