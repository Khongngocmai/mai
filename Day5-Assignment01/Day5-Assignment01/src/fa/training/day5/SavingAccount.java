package fa.training.day5;

public class SavingAccount extends Account {
	
	public SavingAccount(int accNum, double deposit, double interestRate) {
		super(accNum, deposit);
		this.interest = interestRate;
	}

	private double interest;
	
	@Override
	public void withdraw(double amount) {
		// chi phí rút sẽ là $2
		super.withdraw(amount + 2);
	}

	public double calcInterest() {
		return interest * super.getBalance();
	}
	
	public void addInterest() {
		this.deposit(calcInterest());
	}
	
	@Override
	public String toString() {
		return "CurrentAccount interest=" + interest 
				+ " date= "+super.getDateCreated()
				+ " balance = "+ super.getBalance();
	}
	

}
