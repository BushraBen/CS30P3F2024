package LocalBank;

public class Customer 
{
private String firstName, lastName;
		
	
	public Customer(String firstName, String lastName) {
		firstName = firstName;
		lastName = lastName;
	}
	

	public String toString() {
		String CUSTOMERString;

		CUSTOMERString = " " + firstName + " " + lastName + " ";	
	 	return(CUSTOMERString);
	}

	
}
