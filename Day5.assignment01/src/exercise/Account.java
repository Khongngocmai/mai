package exercise;

public class Account {
	
	private String accName;
	private double balance;
	private boolean isActive;
	
	public Account(String accName, double balance) {
		super();
		this.accName = accName;
		this.balance = balance;
		this.isActive= true;
		
	}

	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
		}
	}
	public void withdraw (double amount) {
		if(isActive && amount > 0 && amount <= balance) {
			balance -= amount;
		}
	}
	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public void printAcountInfo() {
		System.out.println("Account name:  " +accName);
		System.out.println("Balance : $" + balance);
		System.out.println("Account Status: " +( isActive?"Active ":"Inactive"));
	}
	
	}
