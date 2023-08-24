package exercise;

public class Main {

	public static void main(String[] args) {
		
		 Bank bank = new Bank();

		 Account account1 = new Account("Mai's Account", 1000);
	        SavingsAccount account2 = new SavingsAccount("Savings Account", 2000, 2.5);
	        CurrentAccount account3 = new CurrentAccount("Current Account", 1500, 500);

	        bank.openAccount(account1);
	        bank.openAccount(account2);
	        bank.openAccount(account3);

	        // Perform some transactions
	        account1.deposit(500);
	        account2.withdraw(300);
	        account3.withdraw(2000);

	        // Close accounts and update
	        bank.closeAccount("Savings Account");
	        bank.closeAccount("Current Account");
	        bank.updateAccounts();

	        // Print account information
	        System.out.println("Account 1:");
	        account1.printAcountInfo();

	        System.out.println("\nAccount 2:");
	        account2.printAcountInfo();

	        System.out.println("\nAccount 3:");
	        account3.printAcountInfo();
	    }
	

}
