package smells.longparameterlist_and_dataclass;


public class Customer {
	private String firstName;
	private String lastName;
	private String title;
	private Address address;
	
    // Code Smell:  Having all the phone details in class customer
	// is not a good OO design. Breaks SRP
	private String workPhoneAreaCode;
	private String workPhoneNumber;
	private String homePhoneAreaCode;
	private String homePhoneNumber;
	
	
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
		return buildCustomerSummary(getFirstName(), getLastName(), getTitle(), 
				address.getCity(), address.getPostCode());
	}
	// Code Smell: Long parameter list
	private String buildCustomerSummary(String firstName, String lastName, 
			String title, String city, String postCode) {
		return title + " " + firstName + " " + lastName + "," + city + "," + "postcode";
	}
	
}
