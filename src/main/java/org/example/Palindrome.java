package org.example;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Palindrome newPal = new Palindrome();

        System.out.println("Welcome! Enter the word you wish to test: ");
        String potentialPalindrome = scanner.nextLine();
        boolean boolIsPalindrome = newPal.isPalindrome(potentialPalindrome);

        // TO DO: Handle when string is blank or null
        if (boolIsPalindrome) {
            System.out.printf("The word %s is a palindrome!", potentialPalindrome);
        }
        else {
            System.out.printf("The word %s is not a palindrome", potentialPalindrome);
        }
        scanner.close();
    }

    public boolean isPalindrome(String originalString) {
        boolean isPalindrome = false;

        StringBuilder firstString = new StringBuilder();
        firstString.append(originalString);
        StringBuilder reversedString = new StringBuilder();
        reversedString.append(firstString);
        reversedString.reverse();

        if (reversedString.compareTo(firstString) == 0) {
            isPalindrome = true;
        }

        return isPalindrome;
    }
}
