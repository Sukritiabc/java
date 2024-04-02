package lab6;

public class Transaction {
	public static void main(String[] args) {
        
        Account account1 = new Account("John Doe", "123456789");
  
        account1.deposit(1000);
        account1.withdraw(500);

        account1.display();
    }

}
