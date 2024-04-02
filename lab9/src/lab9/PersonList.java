package lab9;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonList {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> personList = new ArrayList<>();
        int count = 0;

        System.out.println("Enter up to 25 pairs of names and postal codes (separated by tab):");
        while (count < 25 && scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split("\t");
            if (parts.length == 3) {
                Person person = new Person(parts[0], parts[1], parts[2]);
                personList.add(person);
                count++;
            } else {
                System.out.println("Invalid input format. Please enter three strings separated by tab.");
            }
        }

        System.out.println("\nList of Persons:");
        for (Person person : personList) {
            System.out.println(person);
        }

        scanner.close();
    }
}
