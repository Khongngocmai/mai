package exercise;

public class CurrentAccount extends Account {
	
	private double overdraftLimit;

	public CurrentAccount(String accName, double balance, double overdraftLimit) {
		super(accName, balance);
		this.overdraftLimit = overdraftLimit;
		
	}
	 @Override
	    public void withdraw(double amount) {
	        if (isActive() && (getBalance() - amount) >= (-overdraftLimit) && amount > 0) {
	            super.withdraw(amount);
	        } else {
	            System.out.println("Transaction declined: Insufficient funds.");
	        }
	    }
	
}
