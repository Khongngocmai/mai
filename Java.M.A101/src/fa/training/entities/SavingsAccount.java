package fa.training.entities;

public class SavingsAccount {
	
	public  static  double annualInterestRate;
	public double savingsBalance;
	
	public SavingsAccount() {

	}

	public SavingsAccount(double annualInterestRate, double savingsBalance) {
		super();
		SavingsAccount.annualInterestRate = annualInterestRate;
		this.savingsBalance = savingsBalance;
	}
	
	
	
	public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

	public  double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double InterestRate) {
		annualInterestRate = InterestRate;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
}
