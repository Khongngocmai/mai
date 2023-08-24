package exercise;
import java.util.ArrayList;
public class Bank {
	
	private ArrayList<Account> accounts;
	public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public void closeAccount(String accountName) {
        for (Account account : accounts) {
            if (account.getAccName().equals(accountName)) {
                if (account instanceof SavingsAccount) {
                    ((SavingsAccount) account).addInterest();
                }
                account.setActive(false);
                break;
            }
        }
    }

    public void payDividend(double amount) {
        for (Account account : accounts) {
            if (account.isActive()) {
                account.deposit(amount);
            }
        }
    }

    public void updateAccounts() {
        for (Account account : accounts) {
            if (account.isActive()) {
                if (account instanceof SavingsAccount) {
                    ((SavingsAccount) account).addInterest();
                } else if (account instanceof CurrentAccount) {
                    CurrentAccount currentAccount = (CurrentAccount) account;
                    if (currentAccount.getBalance() < 0) {
                        System.out.println("Sending overdraft letter to " + currentAccount.getAccName());
                    }
                }
            }
        }
    }
}
