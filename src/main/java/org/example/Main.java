package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name here: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt(); //will fail if float or String entered

        System.out.print("What is your undergraduate gpa? ");
        double gpa = scanner.nextDouble();

        System.out.println("Are you currently a student? (true/false) ");
        boolean student = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is: " + gpa);

        if (student) {
            System.out.println("Greetings fellow student!");
        }
        else {
            System.out.println("A teacher perhaps?");
        }
        scanner.close();
    }
}