package org.example;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome newPal = new Palindrome();
        newPal.isPalindrome("Odysseus");
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
