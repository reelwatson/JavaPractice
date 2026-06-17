package org.example;

import java.util.Scanner;

public class JavaStringMethods {
    public static void main(String[] args) {
        
        String blogName = "Mom Coded";
        char letter = blogName.charAt(0);
        int index = blogName.indexOf("C");
        // int lastIndex = blogName.lastIndex("o");
        blogName = blogName.toUpperCase();
        String bobBlogName = blogName.replace("m", "b");

        String badBlogName = "    Mom Coded  ";
        String goodBlogName = badBlogName.trim();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add your first and last name here: ");
        

        String fullName = scanner.nextLine(); //"Siona Atreides";
        String firstName = fullName.substring(0, 5);
        String firstNameAgain = fullName.substring(0, fullName.indexOf(" "));
        System.out.println(firstNameAgain);

        String lastName = fullName.substring(7, 14);
        String lastNameAgain = fullName.substring(7);
        String lastNameThirdTime = fullName.substring(fullName.indexOf(" ") + 1);
        System.out.println(lastNameThirdTime);

        scanner.close();

    }
}
