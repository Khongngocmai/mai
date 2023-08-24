package fa.training.main;

import fa.training.entities.SavingsAccount;

public class SavingsAccountTest {

	public static void main(String[] args) {
		
		SavingsAccount saver1 = new SavingsAccount (0.04,2000.00);
		SavingsAccount saver2 = new SavingsAccount(0.04,3000.00);
		
        System.out.println("Saver1 Balance: $" + saver1.getSavingsBalance());
        System.out.println("Saver2 Balance: $" + saver2.getSavingsBalance());
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println(" Annual Interest Rate: 4%");
        System.out.println("Saver1 New Balance: $" + saver1.getSavingsBalance());
        System.out.println("Saver2 New Balance: $" + saver2.getSavingsBalance());
        
        
        SavingsAccount.setAnnualInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println(" Annual Interest Rate: 5%");
        System.out.println("Saver1 New Balance: $" + saver1.getSavingsBalance());
        System.out.println("Saver2 New Balance: $" + saver2.getSavingsBalance());
	}

}
