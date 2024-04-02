package lab3;
import java.util.Random;
import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the PIN number
        System.out.print("Enter a 4 digit pin number to encrypt: ");
        int pin = scanner.nextInt();

        // Step 1: Convert the pin number to hexadecimal
        String pinHex = Integer.toHexString(pin);

        // Step 2: Generate two random numbers and convert them to hexadecimal
        Random random = new Random();
        int random1 = 1000 + random.nextInt(64536); // Generate random number between 1000 and 65535
        int random2 = 1000 + random.nextInt(64536); // Generate another random number
        String random1Hex = Integer.toHexString(random1);
        String random2Hex = Integer.toHexString(random2);

        // Step 3: Sandwich the converted pin between the two random hexadecimal numbers
        String encryptedPin = random1Hex + pinHex + random2Hex;

        // Output the encrypted pin
        System.out.println("Your encrypted pin number is " + encryptedPin);

        scanner.close();
	}

}
