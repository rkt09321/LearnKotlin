package javatest.threadtest.racecondition;
 
/**
 * @author Crunchify.com
 */
 
class CrunchifyBankAccount {
	private String crunchifyAccountNumber;
	private double crunchifyAccountBalance;
 
	public String getAccountNumber() {
		return crunchifyAccountNumber;
	}
 
	public double getAccountBalance() {
		return crunchifyAccountBalance;
	}
 
	public CrunchifyBankAccount(String crunchifyAccountNumber) {
		this.crunchifyAccountNumber = crunchifyAccountNumber;
	}
 
	// Make a note of this line -- synchronized keyword added
	// To create Race Condition Remove synchronized keyword from line 25 and 35 and run program multiple times

	public synchronized boolean depositAmount(double amount) {
		if (amount < 0) {
			return false;
		} else {
			crunchifyAccountBalance = crunchifyAccountBalance + amount;
			return true;
		}
	}
 
	// Make a note of this line -- synchronized keyword added
	public synchronized boolean withdrawAmount(double amount) {
		if (amount > crunchifyAccountBalance) {
			return false;
		} else {
			crunchifyAccountBalance = crunchifyAccountBalance - amount;
			return true;
		}
	}
}