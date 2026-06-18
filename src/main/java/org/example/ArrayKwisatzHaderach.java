import java.util.Arrays;

public class ArrayKwisatzHaderach {
    public static void main(String[] args) {
        String[] kwisatzHaderach = {"Paul Atreides", "Leto III", "Darwi"};

        // System.out.println(kwisatzHaderach[0]);
        // Print first to last
        for (String name : kwisatzHaderach) {
            System.out.printf("This Kwisatz Haderach is %s.\n", name);
        }

        // Print last to first
        for (int i = kwisatzHaderach.length - 1; i >= 0; i--) {
            System.out.println("This Kwisatz Haderach is " + kwisatzHaderach[i]);
        }

        Arrays.sort(kwisatzHaderach);
        System.out.println(kwisatzHaderach[0]);
        System.out.println(kwisatzHaderach[1]);
        System.out.println(kwisatzHaderach[2]);

        Arrays.fill(kwisatzHaderach, "Duncan Idaho");
        System.out.println(kwisatzHaderach[0]);
        System.out.println(kwisatzHaderach[1]);
        System.out.println(kwisatzHaderach[2]);

    }
}
