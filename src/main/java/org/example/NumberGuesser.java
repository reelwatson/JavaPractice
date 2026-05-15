import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int guess;
        int attempts= 0;
        int randomNumber = random.nextInt(1,101);
        String ageType;

        if (randomNumber > 64) {
            ageType = "a senior citizen.";
        }
        else if (randomNumber > 17) {
            ageType = "an adult.";
        }
        else if (randomNumber > 12) {
            ageType = "a teenager.";
        }
        else if (randomNumber > 2) {
            ageType = "a child.";
        }
        else {
            ageType = "an infant.";
        }

        System.out.println("Guess my age! Pick a number between 1 and 100: ");

        do {
            guess = scanner.nextInt();
            attempts++;
            if (guess > randomNumber) {
                System.out.println("Too high! How old do I look to you??");
            }
            else if (guess < randomNumber) {
                System.out.println("Too low! I know I look youthful, but not THAT young!");
            }
            else {
                System.out.println("Ohhh, you got it! Yes, I'm " + ageType);
                System.out.println("That only took " + attempts + " tries, not bad!");
            }
        }
        while(guess != randomNumber);

        scanner.close();
    }
}