import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VarargsNotVarags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VarargsNotVarags example = new VarargsNotVarags();

        System.out.println("Enter the total number of sources of spice, from 1 to 10.");
        int numberOfSources = scanner.nextInt();
        // TO DO: If statement for when numberOfSources null, 0, or greater than 10
        int[] revenues = new int[numberOfSources];

        System.out.println("Input the revenue generated from each location.");
        for (int i = 0; i < numberOfSources; i++) {
            revenues[i] = scanner.nextInt();
        }

        int exampleTotal = example.totalMelangeRevenue(revenues);
        double exampleAverage = example.averageMelangeRevenue(revenues);
        System.out.printf("The total spice revenue is %d solaris\n", exampleTotal);
        System.out.printf("The average revenue per location is %f solaris", exampleAverage);
        scanner.close();
    }

    // Now you COULD do the below, but it will take a lot of time and manual updates
//    public int totalMelangeRevenue(int northernHemisphere) {
//        return 0;
//    }
//
//    public int totalMelangeRevenue(int northernHemisphere, int southernHemisphere) {
//        return 0;
//    }
//
//    public int totalMelangeRevenue(int northernHemisphere, int southernHemisphere, int axolotlTanks) {
//        return 0;
//    }

    // Instead we can use varargs to override a single method

    public int totalMelangeRevenue(int...sources) {
        int total = 0;
        for (int source : sources) {
            total += source;
        }
        return total;
    }

    public double averageMelangeRevenue(int...sources) {
        int total = totalMelangeRevenue(sources);
        int numberOfSources = sources.length;
        return (double) total / numberOfSources;
    }

}
