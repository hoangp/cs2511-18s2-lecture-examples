package smells.duplicatecode.refactored;

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
	
	
    /** Code Smell Duplicate Code **/
	
	public void credit(float amount) {
		executeAndRecordTransaction(amount, false);
    }

	public void debit(float amount) {
		executeAndRecordTransaction(amount, true);
    }
	
    private void executeAndRecordTransaction(float amount, boolean isDebit) {
    	balance += amount;
    	// records transaction
    	transactions.add(new Transaction(amount, isDebit));
    	// record last transaction date
    	lastTransactionDate = LocalDate.now().toString();
    }

}
