package smells.longmethod;

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
	
	/** Code Smell - Long Method **/
	public void credit(float amount) {
		balance += amount;
		lastTransactionDate = LocalDate.now().toString();
	}
	/** Code Smell - Long Method **/	
	// Not many lines of code, but still has many responsibilities
	public void debit(float amount) {
		// deducts amount by balance
		balance -= amount;
		
		// records transaction
		transactions.add(new Transaction(amount, true));
		
		// record last transaction date
		lastTransactionDate = LocalDate.now().toString();
	}
	
    	
}
