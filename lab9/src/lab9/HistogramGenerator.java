package lab9;
import java.util.Scanner;
public class HistogramGenerator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] frequency = new int[10]; // Array to store frequency of values in each range
        int numValues;

        System.out.print("Enter the number of values: ");
        numValues = scanner.nextInt();

        // Read and process input values
        System.out.println("Enter the values (1-100):");
        for (int i = 0; i < numValues; i++) {
            int value = scanner.nextInt();
            if (value >= 1 && value <= 100) {
                int rangeIndex = (value - 1) / 10; // Determine the index of the range
                frequency[rangeIndex]++; // Increment the frequency count for the range
            } else {
                System.out.println("Invalid input! Value should be in the range 1-100.");
                i--; // Decrement i to re-read this value
            }
        }

        // Print the histogram
        System.out.println("Histogram:");
        for (int i = 0; i < frequency.length; i++) {
            int lowerBound = i * 10 + 1;
            int upperBound = (i + 1) * 10;
            System.out.printf("%2d - %2d | ", lowerBound, upperBound);
            for (int j = 0; j < frequency[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
