package org.example;

public class PrintFPractice {
    public static void main (String[] args) {

        //%[flags][width][.precision][specifier-character]

        String name = "Paul Muad'dib Usul Atreides";
        char firstLetter = 'P';
        int age = 18;
        double height = 175.20320;
        boolean isKwisatzHaderach = false;
        String propheticName = "The Voice from the Outer Worlds";
        double solaris = 620000;
        double harkonnenBribes = -1000000000;

        System.out.printf("Lisan al-Gaib! His name is %s\n", name);
        System.out.printf("Lisan al-Gaib! His name is %s\n", name);
        System.out.printf("His name starts with a %c\n", firstLetter);
        System.out.printf("He is %d years old/n", age);
        System.out.printf("He is %.1f centimeters tall\n", height);
        System.out.printf("Is he the Kwisatz Haderach?: %b\n", isKwisatzHaderach);
        System.out.printf("The cost of spice can get as high as %,.2f solaris per decagram\n", solaris);
        System.out.printf("The Harkonnens take out approximately %(,.2f solaris per 330 days\n", harkonnenBribes);

        System.out.printf("I am %s, Duke of Arrakis! I am %s\n", name, propheticName);


        // 0 = zero padding
        // positive number = right justified padding
        // negative number = left justified padding

        int firstInt = 8;
        int secondInt = 67;
        int thirdInt = 503;
        int fourthInt = 8675;

        System.out.printf("%04d\n", firstInt);
        System.out.printf("%04d\n", secondInt);
        System.out.printf("%04d\n", thirdInt);
        System.out.printf("%04d\n", fourthInt);

        System.out.printf("%4d\n", firstInt);
        System.out.printf("%4d\n", secondInt);
        System.out.printf("%4d\n", thirdInt);
        System.out.printf("%4d\n", fourthInt);

        System.out.printf("%-4d\n", firstInt);
        System.out.printf("%-4d\n", secondInt);
        System.out.printf("%-4d\n", thirdInt);
        System.out.printf("%-4d\n", fourthInt);
        
    }
}