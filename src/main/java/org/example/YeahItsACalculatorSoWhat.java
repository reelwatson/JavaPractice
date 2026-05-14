package org.example;

import java.util.Scanner;

public class YeahItsACalculatorSoWhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum;
        double secondNum;
        char simpleOperator;
        // String complexOperator;
        double result;

        System.out.println("Input, in sequence, two numbers and an operator (-, +, *, /, %, ^)");
        // Would want to build out for square root, abs value, and
        firstNum = scanner.nextDouble();
        secondNum = scanner.nextDouble();
        simpleOperator = scanner.next().charAt(0);

        switch (simpleOperator) {
            case '+' -> result = firstNum + secondNum;
            case '-' -> result = firstNum - secondNum;
            case '*' -> result = firstNum * secondNum;
            case '/' -> {
                if (secondNum != 0) {
                    result = firstNum / secondNum;
                }
                else {
                    System.out.println("You cannot divide by zero!");
                }
            }
            case '%' -> {
                if (secondNum != 0) {
                    result = firstNum % secondNum;
                }
                else {
                    System.out.println("You cannot calculate module from zero!");
                }
            }
        }

        scanner.close();
    }
}
