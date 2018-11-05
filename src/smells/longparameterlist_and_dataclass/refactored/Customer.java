package smells.longparameterlist_and_dataclass.refactored;


public class Customer {
	private String firstName;
	private String lastName;
	private String title;
	private Address address;	
	//Refactoring techninque: Extract class to refactor phone into its separate class
	private Phone workPhone;
	private Phone homePhone;
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getTitle() {
		return title;
	}
	public Address getAddress() {
		return address;
	}
	public String getSummary() {
		return buildCustomerSummary(address);
	}
	
    // Fix code smell:  Long Parameter List	
	// 1. Apply replace parameter with method call
	// 2. Apply change method signature to remove the first three parameters
	// 3. Preserve whole object - passing in the entire object instead of object data
	private String buildCustomerSummary(Address address) {
		return getTitle() + " " + getFirstName() + " " + getLastName() + "," + address.getCity() + "," 
	           + address.getPostCode();
	}

	// Fix code smell:  Data Classes
	// 1. Apply move method inside method getCustomerSummary() in class CustomerSummaryView
	//    to move method to class Customer
	// 2. Extract the address summary
	// 3. Move the address summary to the class Address (to put behaviour where the data is
	// 4. This now makes CustomerSummaryView a Lazy class (another code smell), as it doesn't do much, so remove it
		
	public String getCustomerSummary() {
		return getTitle() + " " + getFirstName() + " " 
		+ getLastName() + "," + address.getAddressSummary();				
	}
	

}
