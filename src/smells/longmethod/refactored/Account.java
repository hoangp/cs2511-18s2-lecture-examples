package smells.longmethod.refactored;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Account {
	
	private double balance;
	List<Transaction> transactions = new ArrayList<>();
	String  lastTransactionDate; 
	
	public double getBalance() {
		return balance;
	}
	
	public void credit(float amount) {
		balance += amount;
	}

	public void debit(float amount) {
		deductBalance(amount);
		recordTransaction(amount, true);
		recordLastTransaction();
	}

	private void deductBalance(float amount) {
		balance -= amount;
	}
	private void recordTransaction(float amount, boolean isDebit) {
		transactions.add(new Transaction(amount,isDebit));
	}
	private void recordLastTransaction() {
		lastTransactionDate = LocalDate.now().toString();
	}

}
