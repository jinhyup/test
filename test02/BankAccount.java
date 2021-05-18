package test02;

public class BankAccount {
	protected int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	void deposit(int amount) {
		balance += amount;
	}

	public boolean withdraw(int amount) {
		if (amount < balance) {
			balance -= amount;
			return true;
		} else {
			return false;
		}

	}

	public boolean transfer(int amount, BankAccount otherAccount) {
		if (amount < balance) {
			balance -= amount;
			otherAccount.balance += amount;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return String.format("%,d", this.balance);
	}

}