package lab3;
import java.util.Scanner;

public class Sphere {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the sphere
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        // Calculate the volume of the sphere
        double volume = (4 * Math.PI * Math.pow(radius, 3)) / 3;

        // Calculate the surface area of the sphere
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

        // Print the volume and surface area to four decimal places
        System.out.printf("Volume: %.4f\n", volume);
        System.out.printf("Surface Area: %.4f\n", surfaceArea);

        scanner.close();

	}

}
