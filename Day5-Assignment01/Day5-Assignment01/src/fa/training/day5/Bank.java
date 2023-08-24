package fa.training.day5;

public class Bank {

	private final int MAX_NUMBER_ACCOUNT = 100;
	private Account[] accounts;
	private static int numberAccount;
	
	public Bank() {
		
	}
	
	public void addAccount(TypeAccount typeAccount) {
		switch (typeAccount) {
		case SAVING:
			accounts[numberAccount++] = new SavingAccount(0,0 ,0);
			break;

		case CURRENT:
			accounts[numberAccount++] = new CurrentAccount(0,0 ,0);
			break;
		}
	}
	public void update() {
		for(Account account : accounts) {
			if(account instanceof SavingAccount) {
				SavingAccount savingAccount = (SavingAccount) account;
				savingAccount.addInterest();
			}else {
				CurrentAccount currentAccount = (CurrentAccount) account;
				if(currentAccount.getSpent() > currentAccount.getLimit()) {
					System.out.println("Some thing");
				}
			}
		}
	}
	public void lockAccount(int accNum) {
		for(Account account : accounts) {
			if(account.getAccountNumber() == accNum && account instanceof SavingAccount) {
				SavingAccount savingAccount = (SavingAccount) account;
				savingAccount.addInterest();
				savingAccount.setActive(false);
				break;
			}
		}
	}
	
	
}
