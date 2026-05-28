package org.example;

public class OverloadingMethods {
    public static void main(String[] args) throws InterruptedException {
        litanyOfFear(3);
        earthseedMantra(3, 1);
        earthseedMantra(1);
    }

    static void litanyOfFear(int x) throws InterruptedException {
        for (int i = 0; i < x; i++) {
            System.out.println("I must not fear, fear is the mind-killer.\n");
            Thread.sleep(2000);
        }
    }

    static void earthseedMantra(int x) throws InterruptedException {
        for (int i = 0; i < x; i++) {
            System.out.println("All that you touch you change.\nAll that you change changes you.\n");
            Thread.sleep(3000);
        }
    }

    static void earthseedMantra(int x, int y) throws InterruptedException {
        for (int i = 0; i < x; i++) {
            System.out.println("All that you touch you change.\nAll that you change changes you.\n");
            Thread.sleep(2000);
        }
        for (int i = 0; i < y; i++) {
            System.out.println("The only lasting truth is change.\nGod is change.\n");
            Thread.sleep(2000);
        }

    }
}
