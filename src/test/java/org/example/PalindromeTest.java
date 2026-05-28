package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void mainTest() {

    }

    @Test
    void isPalindrome() {
        Palindrome testPalindrome = new Palindrome();
        boolean result = testPalindrome.isPalindrome("racecar");
        assertTrue(result, "The method should have returned true, instead returned " + result);
    }

    @Test
    void isNotPalindrome() {
        Palindrome testPalindrome = new Palindrome();
        boolean result = testPalindrome.isPalindrome("streetcar");
        assertFalse(result, "The method should have returned false, instead returned " + result);
    }

    @Test
    void isNullString() {
        Palindrome testPalindrome = new Palindrome();
        boolean result = testPalindrome.isPalindrome(null);
    }

    @Test
    void isBlankString() {

    }
}