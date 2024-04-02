package lab9;

import java.util.ArrayList;
import java.util.Scanner;

public class BankManagement {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SavingsAccount> accounts = new ArrayList<>();

        System.out.println("Welcome to L&L Bank!");

        while (true) {
            System.out.println("\n1. Create Account\n2. Deposit\n3. Withdraw\n4. Add Interest\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    SavingsAccount account = new SavingsAccount();
                    accounts.add(account);
                    System.out.println("Account created. Account number: " + account.getAccountNumber());
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    int depositAccountNumber = scanner.nextInt();
                    SavingsAccount depositAccount = findAccount(accounts, depositAccountNumber);
                    if (depositAccount != null) {
                        System.out.print("Enter deposit amount: $");
                        double depositAmount = scanner.nextDouble();
                        depositAccount.deposit(depositAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    int withdrawAccountNumber = scanner.nextInt();
                    SavingsAccount withdrawAccount = findAccount(accounts, withdrawAccountNumber);
                    if (withdrawAccount != null) {
                        System.out.print("Enter withdrawal amount: $");
                        double withdrawAmount = scanner.nextDouble();
                        withdrawAccount.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    for (SavingsAccount acc : accounts) {
                        acc.addInterest();
                    }
                    System.out.println("Interest added to all accounts.");
                    break;
                case 5:
                    System.out.println("Thank you for using L&L Bank. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static SavingsAccount findAccount(ArrayList<SavingsAccount> accounts, int accountNumber) {
        for (SavingsAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}
