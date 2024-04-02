package lab2;

import java.util.Scanner;
import java.text.NumberFormat;

public class Salary {

	public static void main(String[] args) {
		double currentSalary;  // employee's current  salary
		double raise = 0;          // amount of the raise
		double newSalary;      // new salary for the employee
		String rating;         // performance rating

		Scanner Scanner = new Scanner(System.in);

		System.out.print ("Enter the current salary: ");
		currentSalary = Scanner.nextDouble();
	    System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
	    rating = Scanner.next();
	    
	    if (rating.equalsIgnoreCase("Excellent")) {
            raise = currentSalary * 0.06; // 6% raise for excellent performance
        } 
	    else if (rating.equalsIgnoreCase("Good")) {
            raise = currentSalary * 0.04; // 4% raise for good performance
        } 
	    else if (rating.equalsIgnoreCase("Poor")) {
            raise = currentSalary * 0.015; // 1.5% raise for poor performance
        } 
	    else {
            System.out.println("Invalid rating entered.");
            System.exit(1); // Exit the program if an invalid rating is entered
        }

	    newSalary = currentSalary + raise;

	       // Print the results
	    NumberFormat money = NumberFormat.getCurrencyInstance();
	    System.out.println();
	    System.out.println("Current Salary:       " + money.format(currentSalary));
	    System.out.println("Amount of your raise: " + money.format(raise));
	    System.out.println("Your new salary:      " + money.format(newSalary));
	    System.out.println();


	}

}
