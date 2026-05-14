package org.example;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void switchDayOfWeek() {
        //Enhanced switch is a feature from Java 14 onward
        Scanner scanner = new Scanner(System.in);
        System.out.println("What day of the week is it?");
        String day = scanner.nextLine();

        switch(day) {
            case "Sunday","Monday", "Tuesday", "Wednesday", "Thursday" -> System.out.println("Still working inshallah...");
            case "Friday" -> System.out.println("Go to jum'ah!");
            case "Saturday" -> System.out.println("Woohoo, party hard!");
            default -> System.out.println("Hey, that's not a real day!");
        }

        scanner.close();
    }
}
