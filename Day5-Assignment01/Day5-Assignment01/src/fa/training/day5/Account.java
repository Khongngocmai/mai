package fa.training.day5;

import java.time.LocalDate;

/**
 * A class for bank accounts.
 * 
 * This class provides the basic functionality of accounts. It allows deposits
 * and withdrawals but not overdraft limits or interest rates.
 * 
 * @author Stuart Reynolds ... 1999
 */

public class Account {
	private double bal; // The current balance
	private int accnum; // The account number
	private LocalDate dateCreated;
	private boolean isActive;
	
	public Account(int accNum, double deposit) {
		this.bal = deposit;
		this.accnum = accNum;
		dateCreated = LocalDate.now();
		isActive = true;
	}

	public void deposit(double sum) {
		if (sum > 0)
			bal += sum;
		else
			System.err.println("Account.deposit(...): " + "cannot deposit negative amount.");
	}

	public void withdraw(double sum) {
		if (sum > 0)
			bal -= sum;
		else
			System.err.println("Account.withdraw(...): " + "cannot withdraw negative amount.");
	}

	public double getBalance() {
		return bal;
	}

	public int getAccountNumber() {
		return accnum;
	}
	

	public LocalDate getDateCreated() {
		return dateCreated;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String toString() {
		return "Acc " + accnum + ": " + "balance = " + bal;
	}

	public final void print() {
		// Don't override this,
		// override the toString method
		System.out.println(toString());
	}

}
