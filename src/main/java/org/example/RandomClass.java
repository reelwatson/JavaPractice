package org.example;

import java.util.Random;
import java.util.Scanner;

public class RandomClass {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guessNum = 0;
        int randomNum = random.nextInt(1, 1000);

        System.out.println("Guess how close you are to a random number! Type a number: ");
        guessNum = scanner.nextInt();

        System.out.println("The random number the computer generated is " + randomNum);

        if (guessNum == randomNum) {
            System.out.println("Wow! You were right on the money!");
        } else if (Math.abs(randomNum - guessNum) < 100) {
            System.out.println("Close but no cigar!");
        } else if (Math.abs(randomNum - guessNum) < 500) {
            System.out.println("Not bad, all things considered.");
        } else {
            System.out.println("Not even close!");
        }

        scanner.close();
    }
}
