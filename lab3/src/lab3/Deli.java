package lab3;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Deli {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        DecimalFormat fmt;
        NumberFormat money;

        fmt = new DecimalFormat("0.##");
        money = NumberFormat.getCurrencyInstance();

        System.out.println("*****  CS Deli  *****");

        // Prompt the user to enter the unit price
        System.out.print("Enter the unit price per pound: ");
        double unitPrice = scanner.nextDouble();

        // Prompt the user to enter the weight
        System.out.print("Enter the weight in pounds: ");
        double weight = scanner.nextDouble();

        double totalPrice = unitPrice * weight;

        // Print the label
        System.out.println("Unit Price: " + money.format(unitPrice) + " per pound");
        System.out.println("Weight: " + fmt.format(weight) + " pounds");
        System.out.println();
        System.out.println("TOTAL:  " + money.format(totalPrice));

        scanner.close();
    }

}
