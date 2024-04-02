package lab9;

public class SavingsAccount {
	private static int nextAccountNumber = 1;
    private int accountNumber;
    private double balance;

    public SavingsAccount() {
        this.accountNumber = nextAccountNumber++;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount. Amount should be greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Amount should be greater than 0.");
        } else {
            System.out.println("Insufficient funds. Withdrawal amount exceeds account balance.");
        }
    }

    public void addInterest() {
        double interest = balance * 0.03; // 3% interest
        balance += interest;
        System.out.println("Interest added: $" + interest);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
