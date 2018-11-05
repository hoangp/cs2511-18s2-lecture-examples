package smells.longparameterlist_and_dataclass;

//Here, getCustomerSummary() should be moved to class Customer
//A goal of OO design is to put behaviour where the data is
//Hence, as class Customer has all the customer data, the method getCustomerSummary() must be moved to class Customer
//Otherwise, class Customer suffers from code smell: Data Classes
public class CustomerSummaryView {
	private Customer customer;
	public CustomerSummaryView(Customer customer) {
		this.customer = customer;
	}	
	public String getCustomerSummary() {
		Address addr = customer.getAddress();
		return customer.getTitle() + " " + customer.getFirstName() + " " 
		+ customer.getLastName() + "," + addr.getCity() + "," + addr.getPostCode();				
	}
}
