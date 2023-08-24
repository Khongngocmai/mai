package fa.training.day5;

public class CurrentAccount extends Account {

	private double limit;
	private double spent;

	public CurrentAccount(int accNum, double deposit, double limit) {
		super(accNum, deposit);
		this.limit = limit;
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}

	public double getSpent() {
		return spent;
	}

	public void setSpent(double spent) {
		this.spent = spent;
	}

	@Override
	public void withdraw(double amount) {
		if ((spent + amount) <= this.limit) {
			spent += amount;
			super.withdraw(limit);
		} else {
			System.out.println(" Sorry, Limit Exceeded");
		}
	}

}
