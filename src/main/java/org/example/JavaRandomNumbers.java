package org.example;

import java.util.Random;

public class JavaRandomNumbers {
    public static void main (String[] args) {
        
        Random random = new Random();
        Random secondRandom = new Random();
        Random thirdRandom = new Random();

        int diceFour = random.nextInt(1, 5); // to "roll a die" between 1 and 4; first number inclusive, second number exclusive
        int diceSix = random.nextInt(1, 7);
        int diceEight = random.nextInt(1, 9); 
        int diceTen = random.nextInt(1, 11); 
        int dicePercent = random.nextInt(1, 11); 
        int diceTwelve = random.nextInt(1, 13); 
        int diceTwenty = random.nextInt(1, 21); 

        System.out.println(diceTwenty);

        double healthPointsLeft = secondRandom.nextDouble();
        System.out.println(healthPointsLeft);

        boolean villainIsDefeated = thirdRandom.nextBoolean();
        System.out.println("Is the enemy defeated? " + villainIsDefeated);
        if (villainIsDefeated) {
            System.out.println("The enemy has fallen!");
        }
        else {
            System.out.println("Try again!");
        }

    }
}