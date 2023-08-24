package exercise;

public class SavingsAccount extends Account {

	private double interest;
	public SavingsAccount(String accName, double balance, double interest) {
		super(accName, balance);
		this.interest = interest;
	}
	
	public void addInterest() {
        if (isActive()) {
            double interestAmount = getBalance() * (interest / 100);
            deposit(interestAmount);
        }
    }
	
}
